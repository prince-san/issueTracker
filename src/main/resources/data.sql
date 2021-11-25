INSERT INTO status (id, name) VALUES (1001, 'Created');
INSERT INTO status (id, name) VALUES (1002, 'Resolved');
INSERT INTO status (id, name) VALUES (1003, 'Closed');
INSERT INTO issue (id, name, author, description, date, status_id) VALUES (2001, 'Post method 500 error', 'admin', 'Invocation of post method results in error 500', parsedatetime('2030-01-01 15:00', 'yyyy-MM-dd hh:mm'), 1001);
INSERT INTO issue (id, name, author, description, date, status_id) VALUES (2002, 'Database is inaccessible', 'admin', 'Database is inaccessible', parsedatetime('2030-01-01 16:00', 'yyyy-MM-dd hh:mm'), 1002);
INSERT INTO comment (id, author, text, date, status_id, issue_id) VALUES (3001, 'database developer', 'database inaccessibility is fixed', parsedatetime('2030-01-02 12:00', 'yyyy-MM-dd hh:mm'), 1002, 2002);
