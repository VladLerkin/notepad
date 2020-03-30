CREATE SEQUENCE IF NOT EXISTS entity_seq
  START WITH 1
  INCREMENT BY 1
  NO MINVALUE
  NO MAXVALUE
  CACHE 1;

CREATE TABLE IF NOT EXISTS note (
    id bigint DEFAULT nextval('entity_seq'::regclass) NOT NULL,
	title VARCHAR(255) NOT NULL,
	content VARCHAR(255) NOT NULL,
	CONSTRAINT id_pkey PRIMARY KEY (id)
);

INSERT INTO note VALUES (nextval('entity_seq'::regclass), 'What is Cassandra?', 'Cassandra is a NoSQL database that belongs to the Column Family NoSQL database category.');
