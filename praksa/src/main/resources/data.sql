INSERT INTO ConductingEquipment (equipment_id, type) VALUES (1, 'Breaker');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (2, 'Breaker');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (3, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (4, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (5, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (6, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (7, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (8, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (9, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (10, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (11, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (12, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (13, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (14, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (15, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (16, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (17, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (18, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (19, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (20, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (21, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (22, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (23, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (24, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (25, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (26, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (27, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (28, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (29, 'Conductor');
INSERT INTO ConductingEquipment (equipment_id, type) VALUES (30, 'Conductor');


INSERT INTO Breaker (breaker_id) VALUES (1);
INSERT INTO Breaker (breaker_id) VALUES (2);

INSERT INTO Conductor (conductor_id, length) VALUES (3, 150);
INSERT INTO Conductor (conductor_id, length) VALUES (4, 200);
INSERT INTO Conductor (conductor_id, length) VALUES (5, 300);
INSERT INTO Conductor (conductor_id, length) VALUES (6, 250);
INSERT INTO Conductor (conductor_id, length) VALUES (7, 180);
INSERT INTO Conductor (conductor_id, length) VALUES (8, 220);
INSERT INTO Conductor (conductor_id, length) VALUES (9, 275);
INSERT INTO Conductor (conductor_id, length) VALUES (10, 160);
INSERT INTO Conductor (conductor_id, length) VALUES (11, 310);
INSERT INTO Conductor (conductor_id, length) VALUES (12, 190);
INSERT INTO Conductor (conductor_id, length) VALUES (13, 140);
INSERT INTO Conductor (conductor_id, length) VALUES (14, 330);
INSERT INTO Conductor (conductor_id, length) VALUES (15, 210);
INSERT INTO Conductor (conductor_id, length) VALUES (16, 290);
INSERT INTO Conductor (conductor_id, length) VALUES (17, 250);
INSERT INTO Conductor (conductor_id, length) VALUES (18, 175);
INSERT INTO Conductor (conductor_id, length) VALUES (19, 230);
INSERT INTO Conductor (conductor_id, length) VALUES (20, 240);
INSERT INTO Conductor (conductor_id, length) VALUES (21, 260);
INSERT INTO Conductor (conductor_id, length) VALUES (22, 200);
INSERT INTO Conductor (conductor_id, length) VALUES (23, 270);
INSERT INTO Conductor (conductor_id, length) VALUES (24, 280);
INSERT INTO Conductor (conductor_id, length) VALUES (25, 300);
INSERT INTO Conductor (conductor_id, length) VALUES (26, 220);
INSERT INTO Conductor (conductor_id, length) VALUES (27, 190);
INSERT INTO Conductor (conductor_id, length) VALUES (28, 40);
INSERT INTO Conductor (conductor_id, length) VALUES (29, 326);
INSERT INTO Conductor (conductor_id, length) VALUES (30, 110);


INSERT INTO ConnectivityNode (node_id) VALUES (1);
INSERT INTO ConnectivityNode (node_id) VALUES (2);
INSERT INTO ConnectivityNode (node_id) VALUES (3);
INSERT INTO ConnectivityNode (node_id) VALUES (4);
INSERT INTO ConnectivityNode (node_id) VALUES (5);
INSERT INTO ConnectivityNode (node_id) VALUES (6);
INSERT INTO ConnectivityNode (node_id) VALUES (7);
INSERT INTO ConnectivityNode (node_id) VALUES (8);
INSERT INTO ConnectivityNode (node_id) VALUES (9);
INSERT INTO ConnectivityNode (node_id) VALUES (10);
INSERT INTO ConnectivityNode (node_id) VALUES (11);
INSERT INTO ConnectivityNode (node_id) VALUES (12);
INSERT INTO ConnectivityNode (node_id) VALUES (13);
INSERT INTO ConnectivityNode (node_id) VALUES (14);
INSERT INTO ConnectivityNode (node_id) VALUES (15);
INSERT INTO ConnectivityNode (node_id) VALUES (16);
INSERT INTO ConnectivityNode (node_id) VALUES (17);
INSERT INTO ConnectivityNode (node_id) VALUES (18);
INSERT INTO ConnectivityNode (node_id) VALUES (19);
INSERT INTO ConnectivityNode (node_id) VALUES (20);
INSERT INTO ConnectivityNode (node_id) VALUES (21);
INSERT INTO ConnectivityNode (node_id) VALUES (22);
INSERT INTO ConnectivityNode (node_id) VALUES (23);
INSERT INTO ConnectivityNode (node_id) VALUES (24);
INSERT INTO ConnectivityNode (node_id) VALUES (25);
INSERT INTO ConnectivityNode (node_id) VALUES (26);
INSERT INTO ConnectivityNode (node_id) VALUES (27);
INSERT INTO ConnectivityNode (node_id) VALUES (28);
INSERT INTO ConnectivityNode (node_id) VALUES (29);



INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (1, 1, 1);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (2, 3, 1);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (3, 4, 1);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (4, 5, 1);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (5, 6, 1);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (6, 3, 2);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (7, 7, 2);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (8, 8, 2);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (9, 9, 2);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (10, 7, 3);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (11, 10, 3);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (12, 11, 3);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (13, 12, 3);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (14, 10, 6);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (15, 11, 7);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (16, 12, 8);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (17, 8, 4);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (18, 9, 5);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (19, 4, 9);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (20, 13, 9);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (21, 14, 9);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (22, 15, 9);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (23, 13, 10);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (24, 14, 17);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (25, 15, 13);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (26, 16, 10);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (27, 16, 11);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (28, 17, 10);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (29, 17, 12);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (30,18, 13);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (31, 18, 14);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (32, 19, 13);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (33, 19, 16);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (34, 20, 14);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (35, 20, 15);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (36, 5, 18);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (37, 21, 18);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (38, 22, 18);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (39, 23, 18);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (40, 21, 19);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (41, 22, 20);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (42, 23, 21);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (43, 24, 19);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (44, 25, 20);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (45, 26, 21);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (46, 27, 21);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (47, 24, 22);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (48, 25, 23);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (49, 26, 24);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (50, 27, 25);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (51, 6, 26);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (52, 28, 26);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (53, 29, 26);

INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (54, 28, 27);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (55, 29, 28);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (56, 30, 27);
INSERT INTO Terminal (terminal_id, equipment_id, node_id) VALUES (57, 30, 29);