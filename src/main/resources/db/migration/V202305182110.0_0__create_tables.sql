USE `spacep`;

CREATE TABLE IF NOT EXISTS `video` (
  `video_id` int NOT NULL AUTO_INCREMENT,
  `thumbnail` varchar(255),
  PRIMARY KEY (`video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS `image` (
  `image_id` int NOT NULL AUTO_INCREMENT,
  `hdurl` varchar(255),
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS `media` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255),
  `media_type` varchar(255),
  `url` varchar(255),
  `explanation` longtext,
  `date` date,
  `pk_video` int,
  `pk_image` int,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`pk_video`) REFERENCES video(`video_id`),
  FOREIGN KEY (`pk_image`) REFERENCES image(`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

