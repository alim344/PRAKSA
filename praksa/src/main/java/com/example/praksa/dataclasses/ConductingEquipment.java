package com.example.praksa.dataclasses;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ConductingEquipment {

    public int id;
    @Setter
    @Getter
    public List<Terminal> terminals;

    public ConductingEquipment( List<Terminal> terminals) {
        this.terminals = terminals;
    }

    public ConductingEquipment(){}


}
