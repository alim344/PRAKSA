package com.example.praksa.dataclasses;

import com.example.praksa.visitorpattern.EVisitor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public abstract class  ConductingEquipment {

    public int id;
    @Setter
    @Getter
    public List<Terminal> terminals;

    public ConductingEquipment( List<Terminal> terminals) {
        this.terminals = terminals;
    }

    public ConductingEquipment(){}

    public abstract boolean  isBreaker();
    public abstract void accept(EVisitor visitor);

    @Override
    public String toString() {
        String s =  "ConductingEquipment{" +
                "id=" + id;
                return s;
    }
}
