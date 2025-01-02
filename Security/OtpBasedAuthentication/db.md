```
CREATE SCHEMA `auth` ;
```
```
CREATE TABLE `auth`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `roll` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);
```
```
CREATE TABLE tokens (
id INT AUTO_INCREMENT PRIMARY KEY,
user_id INT,
otp VARCHAR(10),
created_at DATETIME,
FOREIGN KEY (user_id) REFERENCES users(id));
```
```
INSERT INTO `auth`.`users` (`username`, `password`, `email`, `roll`) VALUES ('omkar', 'omkar@123', 'tanujkmahajan@gmail.com', 'admin');
INSERT INTO `auth`.`users` (`username`, `password`, `email`, `roll`) VALUES ('simran', 'simran@123', 'tanujkmahajan@gmail.com', 'customer');
```
