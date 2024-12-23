```
CREATE SCHEMA `springmp` ;
```
```
CREATE TABLE `springmp`.`employee` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `password` INT NULL,
  `salary` INT NULL,
  `age` INT NULL,
  PRIMARY KEY (`id`));
```
```
INSERT INTO `springmp`.`employee` (`id`, `name`, `password`, `salary`, `age`) VALUES ('1', 'Jayesh', '123', '90000', '25');
INSERT INTO `springmp`.`employee` (`id`, `name`, `password`, `salary`, `age`) VALUES ('2', 'Gansy', '234', '85000', '23');
```
