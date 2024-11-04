package com.example.praksa.dataclasses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Conductor extends ConductingEquipment{

    @Getter
    @Setter
    public int length;

    public Conductor(List<Terminal> terminals, int length){
        super(terminals);
        this.length = length;
    }

}
