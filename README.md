# messaging-sample implementation of  Advanced Message Queuing Protocol using Active Mq and Rabbit MQ

preconditions

1. Set up ActiveMQ server and point to it in the configuration
2. Set up RabbitMQ server and point to it in the configuration

3. Create table in mysql instance

drop table if exists `traderequest`;

CREATE TABLE `traderequest` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `ticker` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB
