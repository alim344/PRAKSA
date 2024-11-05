package com.example.praksa;

import com.example.praksa.dataclasses.*;
import org.antlr.v4.runtime.atn.SemanticContext;

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
        int length = 0;
        for(Conductor conductor : path_conductors){
             length += conductor.length;
        }

        return length;
    }


    private List<Conductor> FindPath(int id){

        Queue<Terminal> queue = new LinkedList<>();
        Set<Terminal> visited = new HashSet<>();
        List<Conductor> path = new ArrayList<>();


        ConductingEquipment broken_conductor = (Conductor) builder.dictionaries.conductingEquipmentDictionary.get(id);

        Terminal broken_terminal = broken_conductor.terminals.get(0);
        visited.add(broken_terminal);
        ConnectivityNode first_node = broken_terminal.connectivityNode;
        Terminal min = broken_terminal;
        for(Terminal t: first_node.terminals){
            if(t.id < min.id){
                min = t;
            }
        }


        queue.add(min);


        while(!queue.isEmpty()){

            Terminal current_terminal = queue.poll();

            ConductingEquipment current_equipment = current_terminal.conductingEquipment;

            if(current_equipment.isBreaker()){
                return path;
            }

            path.add((Conductor) current_equipment);

            Terminal second_terminal = new Terminal();

            for(Terminal term: current_equipment.terminals){
                if(term != current_terminal){
                    second_terminal = term;
                }
            }

            ConnectivityNode second_node = second_terminal.connectivityNode;

            List<Terminal> terminals = second_node.terminals;


            Terminal min_terminal = terminals.isEmpty() ? null : terminals.get(0);

            for(Terminal t: terminals){
                // Ensure min_terminal is initialized before comparing
                if(min_terminal == null || t.id < min_terminal.id) {
                    min_terminal = t; // Update to the terminal with the smaller ID
                }
            }

            queue.add(min_terminal);
            if(!visited.contains(second_terminal)){
                visited.add(second_terminal);
            }

        }

        return Collections.EMPTY_LIST;
    }



}
