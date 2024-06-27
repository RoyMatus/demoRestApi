CREATE EXTENSION IF NOT EXISTS pgcrypto;

DROP TABLE IF EXISTS records;

CREATE TABLE IF NOT EXISTS records
(

    id          uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    title       VARCHAR(200) not null,
    description TEXT         not null,
    datetime    TIMESTAMP    not null
);
