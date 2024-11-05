package com.example.praksa.dataclasses;

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


}
