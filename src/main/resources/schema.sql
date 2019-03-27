CREATE TABLE `dziesiedzieje`.`user_profile` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `date_of_birth` DATE NULL,
  PRIMARY KEY (`id`));
  
  CREATE TABLE `dziesiedzieje`.`event` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `latitude` VARCHAR(45) NOT NULL,
  `longitude` VARCHAR(45) NOT NULL,
  `description` VARCHAR(500) NULL,
  `image` LONGBLOB NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE);
  
  
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