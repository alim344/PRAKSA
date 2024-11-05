package com.example.praksa;

import com.example.praksa.dataclasses.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;


public class Service {

    public Builder builder = new Builder();

    public Service(){}

    public void  LoadData() throws SQLException {

        String url = "jdbc:h2:mem:testdb"; // Update with your actual database URL
        String user = "sa";
        String password = "";



        try (Connection connection = DriverManager.getConnection(url, user, password)){

            builder.LoadConductors(connection);
            builder.LoadBreakers(connection);
            builder.LoadNodes(connection);
            builder.LoadTerminals(connection);

        }



    }


    public int GetLength(int id){


        List<Conductor> path_conductors =  FindPath(id);
        int total_lenght = 0;

        for(Conductor conductor : path_conductors){
            total_lenght += conductor.getLength();
        }


        return total_lenght;
    }

    private List<Conductor> FindPath(int id) {

        Queue<Terminal> queue = new LinkedList<>();
        Set<Terminal> visited = new HashSet<>();
        List<Conductor> path = new ArrayList<>();

        Conductor broken_conductor = (Conductor) builder.dictionaries.conductingEquipmentDictionary.get(id);



        if(broken_conductor == null){
            return null;
        }

       Terminal broken_terminal = broken_conductor.getTerminals().get(0);


        queue.add(broken_terminal);
        visited.add(broken_terminal);

        while (!queue.isEmpty()) {

            Terminal current_terminal = queue.poll();
            ConductingEquipment current_equipment = current_terminal.getConductingEquipment();

            if(current_equipment.isBreaker()){
                return path;
            }

            ConnectivityNode current_node = current_terminal.getConnectivityNode();

            List<Terminal> next_terminals = current_node.getTerminals();

            for(Terminal terminal: next_terminals){
                if(!visited.contains(terminal) && !path.contains(terminal)){
                    queue.add(terminal);

                    Conductor next_conductor =(Conductor) terminal.getConductingEquipment();
                    if(next_conductor instanceof Conductor){
                        path.add(next_conductor);
                    }
                }
            }



        }


        return Collections.emptyList();

    }







}
