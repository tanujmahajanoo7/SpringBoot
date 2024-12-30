```
CREATE TABLE `springmp`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);
```
```

INSERT INTO `springmp`.`user` (`username`, `password`, `role`) VALUES ('admin', 'admin123', 'ADMIN');
INSERT INTO `springmp`.`user` (`username`, `password`, `role`) VALUES ('customer', 'customer123', 'CUSTOMER');
```
