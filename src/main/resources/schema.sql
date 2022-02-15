CREATE TABLE team
(
    id IDENTITY NOT NULL PRIMARY KEY,
    name   VARCHAR(200),
    slogan VARCHAR(500),
    sport_id bigint(20)  NOT NULL,
    UNIQUE KEY name (name),
    CONSTRAINT sport_ibfk_1 FOREIGN KEY (sport_id) REFERENCES sport (id) ON DELETE CASCADE ON UPDATE CASCADE
)
);
CREATE TABLE player (
                        id IDENTITY NOT NULL PRIMARY KEY,
                        name varchar(200) NOT NULL,
                        number varchar(2) DEFAULT NULL,
                        position varchar(100) DEFAULT NULL,
                        team_id bigint(20)  NOT NULL,
                        UNIQUE KEY name (name),
                        CONSTRAINT player_ibfk_1 FOREIGN KEY (team_id) REFERENCES team (id) ON DELETE CASCADE ON UPDATE CASCADE
)
CREATE TABLE sport
(
    id IDENTITY NOT NULL PRIMARY KEY,
    name VARCHAR(200)
)
