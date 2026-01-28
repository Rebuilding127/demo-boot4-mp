
DROP TABLE IF EXISTS jav_favorite_manage;
CREATE TABLE jav_favorite_manage
(
    id          BIGSERIAL PRIMARY KEY,
    label       VARCHAR(100),
    url         VARCHAR(200),
    type        VARCHAR(50), -- movie, actor, tag, series
    is_favorite BOOLEAN,

    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

