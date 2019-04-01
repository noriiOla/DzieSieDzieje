CREATE TABLE `dziesiedzieje`.`user_profile` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `date_of_birth` DATE NULL,
  PRIMARY KEY (`id`));

  CREATE TABLE `dziesiedzieje`.`place` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `postal_code` VARCHAR(6) NULL,
  `adress` VARCHAR(100) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `latitude` VARCHAR(20) NULL,
  `longitude` VARCHAR(20) NULL,
  PRIMARY KEY (`id`))
DEFAULT CHARACTER SET = utf8;

CREATE TABLE `dziesiedzieje`.`price` (
  `id` INT NOT NULL,
  `type` VARCHAR(45) NULL,
  `currency` VARCHAR(45) NOT NULL,
  `min` INT(10) NULL,
  `max` INT(10) NOT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `dziesiedzieje`.`event` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `image` VARCHAR(300) NULL,
  `date` DATETIME NULL,
  `type` VARCHAR(45) NULL,
  `promoter` VARCHAR(45) NULL,
  `place_id` INT NULL,
  `price_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_event_price_idx` (`price_id` ASC) VISIBLE,
  INDEX `fk_event_place_idx` (`place_id` ASC) VISIBLE,
  CONSTRAINT `fk_event_price`
    FOREIGN KEY (`price_id`)
    REFERENCES `dziesiedzieje`.`price` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_event_place`
    FOREIGN KEY (`place_id`)
    REFERENCES `dziesiedzieje`.`place` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

  
  
  CREATE TABLE `dziesiedzieje`.`user_event_interested` (
  `id` INT NOT NULL,
  `user_id` INT NOT NULL,
  `event_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_event_id_idx` (`event_id` ASC) VISIBLE,
  INDEX `fk_user_id_idx` (`user_id` ASC) VISIBLE,
  UNIQUE INDEX `unique_user_event` (`user_id` ASC, `event_id` ASC) VISIBLE,
  CONSTRAINT `fk_event_id`
    FOREIGN KEY (`event_id`)
    REFERENCES `dziesiedzieje`.`event` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `dziesiedzieje`.`user_profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
	
	CREATE TABLE `dziesiedzieje`.`user_event_not_interested` (
  `id` INT NOT NULL,
  `user_id` INT NOT NULL,
  `event_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_event_id_not_idx` (`event_id` ASC) VISIBLE,
  INDEX `fk_user_id_not_idx` (`user_id` ASC) VISIBLE,
  UNIQUE INDEX `unique_user_event_not` (`user_id` ASC, `event_id` ASC) VISIBLE,
  CONSTRAINT `fk_event_id_not`
    FOREIGN KEY (`event_id`)
    REFERENCES `dziesiedzieje`.`event` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_id_not`
    FOREIGN KEY (`user_id`)
    REFERENCES `dziesiedzieje`.`user_profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);