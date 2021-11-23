CREATE TABLE status
(
    id integer PRIMARY KEY,
    name varchar(31) NOT NULL
);
CREATE TABLE issue
(
    id integer PRIMARY KEY,
    name varchar(31) NOT NULL,
    author varchar(63) NOT NULL,
    description varchar(255) NOT NULL,
    date timestamp NOT NULL,
    status_id integer NOT NULL,
    FOREIGN KEY (status_id) REFERENCES status(id)
);

