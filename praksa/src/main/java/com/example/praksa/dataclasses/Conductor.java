package com.example.praksa.dataclasses;

import com.example.praksa.visitorpattern.EVisitor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Conductor extends ConductingEquipment{

    @Getter
    @Setter
    public int length;

    public Conductor(int id,List<Terminal> terminals, int length){
        super(terminals);
        super.id = id;
        this.length = length;
    }

    @Override
    public boolean isBreaker() {
        return false;
    }

    @Override
    public void accept(EVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "length=" + length +
                '}';
    }
}
