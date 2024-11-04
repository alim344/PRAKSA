package com.example.praksa;

import com.example.praksa.dataclasses.ConnectivityNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.praksa.Builder;

import java.sql.SQLException;
import java.util.Dictionary;
import java.util.Enumeration;

@SpringBootApplication
public class PraksaApplication {



	public static void main(String[] args) throws SQLException {
		SpringApplication.run(PraksaApplication.class, args);
		Builder b = new Builder();
		b.build();
    }

}
