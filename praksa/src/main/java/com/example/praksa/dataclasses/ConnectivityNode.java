package com.example.praksa.dataclasses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ConnectivityNode {

    public int id;

    @Getter
    @Setter
    public List<Terminal> terminals;

    public ConnectivityNode( List<Terminal> terminals) {

        this.terminals = terminals;
    }

    public ConnectivityNode(){}

    @Override
    public String toString() {
        return "ConnectivityNode{" +
                "id=" + id +

                '}';
    }
}
