package com.example.praksa.visitorpattern;

import com.example.praksa.dataclasses.Breaker;
import com.example.praksa.dataclasses.Conductor;

public interface EVisitor {

    void visit(Conductor conductor);
    void visit(Breaker breaker);

}
