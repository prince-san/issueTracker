CREATE TABLE status
(
    id integer PRIMARY KEY AUTO_INCREMENT,
    name varchar(31) NOT NULL UNIQUE
);
CREATE TABLE issue
(
    id integer PRIMARY KEY AUTO_INCREMENT,
    name varchar(31) NOT NULL,
    author varchar(31) NOT NULL,
    description varchar(255) NOT NULL,
    date timestamp NOT NULL,
    status_id integer NOT NULL,
    FOREIGN KEY (status_id) REFERENCES status(id)
);
CREATE TABLE comment
(
    id integer PRIMARY KEY AUTO_INCREMENT,
    author varchar(31) NOT NULL,
    text varchar(255) NOT NULL,
    date timestamp NOT NULL,
    status_id integer NOT NULL,
    issue_id integer NOT NULL,
    FOREIGN KEY (status_id) REFERENCES status(id),
    FOREIGN KEY (issue_id) REFERENCES issue(id)
);