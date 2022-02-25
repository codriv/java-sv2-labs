CREATE TABLE `activities` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`startTime` DATETIME NULL DEFAULT NULL,
	`activity_desc` VARCHAR(255),
	`activity_type` VARCHAR(20),
	PRIMARY KEY (`id`)
)