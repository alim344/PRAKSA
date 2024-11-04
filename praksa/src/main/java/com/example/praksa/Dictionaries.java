package com.example.praksa;

import com.example.praksa.dataclasses.ConductingEquipment;
import com.example.praksa.dataclasses.ConnectivityNode;
import com.example.praksa.dataclasses.Terminal;
import lombok.Getter;
import lombok.Setter;

import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionaries {

   @Getter
   @Setter
   public  Dictionary<Integer, ConductingEquipment> conductingEquipmentDictionary = new Hashtable<Integer, ConductingEquipment>();

   @Getter
   @Setter
   public Dictionary<Integer, Terminal> terminalDictionary = new Hashtable<>();

   @Getter
   @Setter
   public Dictionary<Integer, ConnectivityNode> nodeDictionary = new Hashtable<>();




}
