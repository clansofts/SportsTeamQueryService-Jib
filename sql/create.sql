/*
 * Create the database for the SportsTeam application prior to deploying.
 * To create the database in Apache NetBeans IDE, utilize the "Services" tab
 * to add a new JavaDB database (Apache Derby).
 *
 * Database Name: acme (may refer to it as acmedb within JNDI connections)
 * Database User: acme
 *
 * Once the database has been created, execute the following script to create
 * the objects and populate the tables.
 */
/**
 * Author:  Juneau
 * Created: May 01, 2018
 */
create table team_roster (
id          numeric,
first_name       varchar(150),
last_name        varchar(150),
position         varchar(150),
registration_date    date,
PRIMARY KEY (ID)
);

insert into team_roster values(
1,
'DUKE',
'JAVA',
'FORWARD',
'2018-11-25');
