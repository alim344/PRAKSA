package com.example.praksa;

import java.sql.*;
import java.util.ArrayList;
import java.util.Dictionary;

import com.example.praksa.Dictionaries;
import com.example.praksa.dataclasses.*;

public class Builder {

    public Builder(){}
    Dictionaries dictionaries = new Dictionaries();

    public void build() throws SQLException {

        String url = "jdbc:h2:mem:testdb"; // Update with your actual database URL
        String user = "sa";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password)){

            LoadNodes(connection);
            LoadConductors(connection);
            LoadBreakers(connection);
            LoadTerminals(connection);

        }


    }

    private void LoadTerminals(Connection connection) throws SQLException {
        String query4 = "SELECT * FROM Terminal";
        PreparedStatement preparedStatement4 = connection.prepareStatement(query4);
        ResultSet resultSet4 = preparedStatement4.executeQuery();
        while (resultSet4.next()) {
            int id3 = resultSet4.getInt("terminal_id");

            int equipmentId = resultSet4.getInt("equipment_id");
            int nodeId = resultSet4.getInt("node_id");
            ConductingEquipment c = dictionaries.conductingEquipmentDictionary.get(equipmentId);
            ConnectivityNode node = dictionaries.nodeDictionary.get(nodeId);

            Terminal terminal =  new Terminal(c,node);
            dictionaries.terminalDictionary.put(id3, terminal);

            if(c != null){
                c.getTerminals().add(terminal);
            }
            if(node != null){
                node.getTerminals().add(terminal);
            }

        }
    }

    private void LoadBreakers(Connection connection) throws SQLException {
        String query3= "SELECT * FROM ConductingEquipment ce JOIN Breaker  b on ce.equipment_id = b.breaker_id WHERE ce.type = 'Breaker'";

        PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
        ResultSet resultSet3 = preparedStatement3.executeQuery();
        while (resultSet3.next()) {
            int id2 = resultSet3.getInt("breaker_id");
            Breaker breaker = new Breaker(new ArrayList<>());
            dictionaries.conductingEquipmentDictionary.put(id2, breaker);

        }
    }

    private void LoadConductors(Connection connection) throws SQLException {
        String query2 = "SELECT * FROM ConductingEquipment ce JOIN Conductor c on ce.equipment_id = c.conductor_id WHERE ce.type = 'Conductor'";
        PreparedStatement preparedStatement2 = connection.prepareStatement(query2);

        ResultSet resultSet2 = preparedStatement2.executeQuery();

        while (resultSet2.next()) {

            int id1 = resultSet2.getInt("conductor_id");
            int length1 = resultSet2.getInt("length");
            Conductor conductor = new Conductor(new ArrayList<>(),length1);
            dictionaries.conductingEquipmentDictionary.put(id1, conductor);

        }
    }

    private void LoadNodes(Connection connection) throws SQLException {
        String query1 = "SELECT * FROM ConnectivityNode";
        PreparedStatement preparedStatement1 = connection.prepareStatement(query1);

        ResultSet resultSet = preparedStatement1.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("node_id");

            ConnectivityNode node = new ConnectivityNode( new ArrayList<>());
            dictionaries.nodeDictionary.put(id, node);

        }
    }


}
