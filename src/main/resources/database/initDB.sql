CREATE TABLE IF NOT EXISTS records
(
    id       BIGSERIAL PRIMARY KEY,
    name     VARCHAR(200) not null,
    comment  TEXT         not null,
    datetime TIMESTAMP    not null
);

-- DROP TABLE IF EXISTS records