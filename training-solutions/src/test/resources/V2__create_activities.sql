CREATE TABLE `activities` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`startTime` DATETIME NULL DEFAULT NULL,
	`activity_desc` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb3_hungarian_ci',
	`activity_type` VARCHAR(20) NULL DEFAULT NULL COLLATE 'utf8mb3_hungarian_ci',
	PRIMARY KEY (`id`) USING BTREE
)