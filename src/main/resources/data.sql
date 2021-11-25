INSERT INTO status (id, name) VALUES (1001, 'Created');
INSERT INTO status (id, name) VALUES (1002, 'Resolved');
INSERT INTO issue (id, name, author, description, date, status_id) VALUES (2001, 'red sus', 'yellow', 'red faking tasks', parsedatetime('2021-11-23 18:47', 'yyyy-MM-dd hh:mm'), 1001);
INSERT INTO issue (id, name, author, description, date, status_id) VALUES (2002, 'blue sus', 'yellow', 'blue killed green', parsedatetime('2021-11-23 18:47', 'yyyy-MM-dd hh:mm'), 1001);
INSERT INTO comment (id, author, text, date, status_id, issue_id) VALUES (3001, 'pink', 'yellow lies it is pretty sus', parsedatetime('2021-11-23 18:47', 'yyyy-MM-dd hh:mm'), 1001, 2002);
