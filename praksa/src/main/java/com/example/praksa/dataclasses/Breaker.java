package com.example.praksa.dataclasses;

import com.example.praksa.visitorpattern.EVisitor;

import java.util.List;

public class Breaker extends ConductingEquipment{

    public Breaker(int id, List<Terminal> terminals){
        super(terminals);
        super.id = id;
    }

    public Breaker(){}

    @Override
    public boolean isBreaker() {
        return true;
    }

    @Override
    public void accept(EVisitor visitor) {
        visitor.visit(this);
    }


}
