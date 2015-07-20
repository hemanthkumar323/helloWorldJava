
create table db_version
(
syncVersion int unsigned NOT NULL,
PRIMARY KEY(school_id)
);

create table school_info
(
school_id int unsigned NOT NULL,
school_name varchar(100) NOT NULL,
school_address varchar(100) NOT NULL,
PRIMARY KEY(school_id)
);


create table login_info
(
user_id int unsigned NOT NULL,
school_id int unsigned NOT NULL,
user_name varchar(30) NOT NULL,
password BLOB,
password_last_modified TIMESTAMP,
PRIMARY KEY(user_id)
);

create table user_info
(
user_id int unsigned NOT NULL,
user_firstName VARCHAR(40),
user_lastName VARCHAR(40),
user_middleName Varchar(40),
user_displayName Varchar(40)
);