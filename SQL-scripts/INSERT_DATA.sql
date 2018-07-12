-- ADDRESS
INSERT INTO `ADDRESS`(`ADDRESS_LINE_1`, `TOWN`, `COUNTRY`, `POSTCODE`)
VALUES
       ('42, Green Terrace', 'Los Angeles', 'USA', '12345'),
       ('23B, Baker str', 'London', 'UK', 'BK388'),
       ('62, Green str', 'Southampton', 'USA', '32452'),
       ('1, Buckinham palace', 'London', 'UK', 'AA111'),
       ('2, Garage', 'Pasadena', 'USA', '62628');

-- TASK
INSERT INTO `TASK`(`TITLE`, `FIRST_NAME`, `LAST_NAME`, `SCHEDULED_DATE`, `ADDRESS_ID`)
VALUES ('MR', 'John', 'Smith', '2018-07-11', 1),
       ('MRS', 'Ada', 'Lovelace', '2018-07-25', 2),
       ('MR', 'Josh', 'Bloch', '2018-07-17', 3),
       ('MRS', 'Elisabeth', 'Tudor', '2018-07-23', 4),
       ('MR', 'Rajesh', 'Kutrapali', '2018-07-03', 5);


