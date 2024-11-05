package com.example.praksa;

import com.example.praksa.dataclasses.*;
import com.example.praksa.visitorpattern.LengthSumVisitor;
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

        LengthSumVisitor visitor = new LengthSumVisitor();
        int num = FindPath(id, visitor);

//       if(num == 0){
//           return 0;
//        }
//       return visitor.getTotalLength();
        return num;

    }


    //MOJ NAMESTENI

//    private int FindPath(int id, LengthSumVisitor visitor){
//
//
//        Queue<Terminal> queue = new LinkedList<>();
//        Set<Terminal> visited = new HashSet<>();
//       // List<Conductor> path = new ArrayList<>();
//
//
//        ConductingEquipment broken_conductor = (Conductor) builder.dictionaries.conductingEquipmentDictionary.get(id);
//
//        Terminal broken_terminal = broken_conductor.terminals.get(0);
//        visited.add(broken_terminal);
//        ConnectivityNode first_node = broken_terminal.connectivityNode;
//        Terminal min = broken_terminal;
//        for(Terminal t: first_node.terminals){
//            if(t.id < min.id){
//                min = t;
//            }
//        }
//
//
//        queue.add(min);
//
//
//        while(!queue.isEmpty()){
//
//            Terminal current_terminal = queue.poll();
//
//            ConductingEquipment current_equipment = current_terminal.conductingEquipment;
//
//            if(current_equipment.isBreaker()){
//                current_equipment.accept(visitor);
//                return 1;
//            }
//
//            //path.add((Conductor) current_equipment);
//           current_equipment.accept(visitor);
//
//            Terminal second_terminal = new Terminal();
//
//            for(Terminal term: current_equipment.terminals){
//                if(term != current_terminal){
//                    second_terminal = term;
//                }
//            }
//
//            ConnectivityNode second_node = second_terminal.connectivityNode;
//
//            List<Terminal> terminals = second_node.terminals;
//
//
//            Terminal min_terminal = terminals.isEmpty() ? null : terminals.get(0);
//
//            for(Terminal t: terminals){
//                // Ensure min_terminal is initialized before comparing
//                if(min_terminal == null || t.id < min_terminal.id) {
//                    min_terminal = t; // Update to the terminal with the smaller ID
//                }
//            }
//
//            queue.add(min_terminal);
//            if(!visited.contains(second_terminal)){
//                visited.add(second_terminal);
//            }
//
//        }
//
//        return 0;
//    }

   //BFS

    private int FindPath(int id, LengthSumVisitor visitor){
        Queue<ConductingEquipment> queue = new LinkedList<>();
        Map<ConductingEquipment, Integer> distanceMap = new HashMap<>();  // Track distance from start to each node

        Conductor broken_conductor = (Conductor) builder.dictionaries.conductingEquipmentDictionary.get(id);

        queue.add(broken_conductor);
        distanceMap.put(broken_conductor, 0);  // Start distance from itself is 0

        while (!queue.isEmpty()) {
            ConductingEquipment current = queue.poll();
            int currentDistance = distanceMap.get(current);

            // Check if we've reached the breaker (root of the tree)
            if (current.isBreaker() ) {
                return currentDistance;  // Total path length
            }

            // Traverse through each terminal and connected nodes
            for (Terminal terminal : current.terminals) {
                ConnectivityNode node = terminal.connectivityNode;

                // For each node, visit other terminals and their connected equipment
                for (Terminal connectedTerminal : node.terminals) {
                    ConductingEquipment nextEquipment = connectedTerminal.conductingEquipment;
                    if (!distanceMap.containsKey(nextEquipment)) {  // Check if unvisited
                        visitor.setTotalLength(0);
                        nextEquipment.accept(visitor);  // Apply the visitor pattern

                        int newDistance = currentDistance + visitor.getTotalLength();
                        distanceMap.put(nextEquipment, newDistance);
                        queue.add(nextEquipment);
                    }
                }
            }
        }

        return 0;

    }





}
