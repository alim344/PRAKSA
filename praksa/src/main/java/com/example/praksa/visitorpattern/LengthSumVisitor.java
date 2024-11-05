package com.example.praksa.visitorpattern;
import com.example.praksa.dataclasses.Breaker;
import com.example.praksa.dataclasses.Conductor;
import com.example.praksa.visitorpattern.EVisitor;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

public class LengthSumVisitor implements EVisitor {
    private int totalLength = 0;

    @Override
    public void visit(Conductor conductor) {
        totalLength += conductor.getLength();
    }

    @Override
    public void visit(Breaker breaker) {
        totalLength +=0;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }



}
