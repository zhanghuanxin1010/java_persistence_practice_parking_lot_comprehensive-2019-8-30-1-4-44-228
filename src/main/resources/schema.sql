
CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   INTEGER NOT NULL
);

CREATE TABLE parkingLot(
   parkingLotID INTEGER PRIMARY KEY,
   capacity INTEGER NOT NULL,
    availablePositionCount INTEGER NOT NULL
);
