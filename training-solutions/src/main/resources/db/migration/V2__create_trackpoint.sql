CREATE TABLE `track_point` (
	`id` BIGINT AUTO_INCREMENT,
	`time` DATE,
	`lat` DOUBLE,
	`lon` DOUBLE,
	`activity_id` INT,
	CONSTRAINT PRIMARY KEY (`id`),
	CONSTRAINT `fk_tp` FOREIGN KEY (`activity_id`) REFERENCES `activitytracker`.`activities` (`id`)
	);