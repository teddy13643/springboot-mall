CREATE TABLE products (
                          id                INT             NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          name              VARCHAR(128)    NOT NULL,
                          category          VARCHAR(32)     NOT NULL,
                          price             INT             NOT NULL,
                          stock             INT             NOT NULL,
                          description       VARCHAR(1024),
                          created_at        TIMESTAMP       NOT NULL,
                          last_modified     TIMESTAMP       NOT NULL
);