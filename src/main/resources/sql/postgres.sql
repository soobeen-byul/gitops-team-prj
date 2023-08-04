CREATE USER pd24 PASSWORD 'pass' SUPERUSER;

CREATE DATABASE postgres OWNER pd24;

CREATE TABLE resume (
                        id integer NOT NULL,
                        name character varying(255),
                        github character varying(32),
                        aboutme character varying(255),
                        CONSTRAINT star_pk PRIMARY KEY (id)
);

SELECT * FROM resume;
