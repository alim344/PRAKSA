package com.example.praksa.dataclasses;

import lombok.Getter;
import lombok.Setter;

public class Terminal {

    public int id;
    @Getter
    @Setter
    public ConductingEquipment conductingEquipment;

    @Getter
    @Setter
    public ConnectivityNode connectivityNode;

    public Terminal( ConductingEquipment conductingEquipment, ConnectivityNode connectivityNode) {

        this.conductingEquipment = conductingEquipment;
        this.connectivityNode = connectivityNode;
    }

    public Terminal(){}
}
