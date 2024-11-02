CREATE TABLE ConductingEquipment(
           equipment_id INT PRIMARY KEY,
           type ENUM('Breaker','Conductor') NOT NULL
);

CREATE TABLE Breaker(
                        breaker_id INT PRIMARY KEY,
                        FOREIGN KEY (breaker_id) REFERENCES ConductingEquipment(equipment_id)
);

CREATE TABLE Conductor(
                          conductor_id INT PRIMARY KEY,
                          length INT,
                        FOREIGN KEY (conductor_id) REFERENCES ConductingEquipment(equipment_id)
);

CREATE TABLE ConnectivityNode(
                      node_id INT PRIMARY KEY
);

CREATE TABLE Terminal(
                     terminal_id INT PRIMARY KEY,
                     equipment_id INT,
                     node_id INT  ,
                     FOREIGN KEY (node_id) REFERENCES ConnectivityNode(node_id),
                     FOREIGN KEY (equipment_id) REFERENCES ConductingEquipment(equipment_id)
);