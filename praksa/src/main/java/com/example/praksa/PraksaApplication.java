package com.example.praksa;

import com.example.praksa.dataclasses.ConnectivityNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.praksa.Builder;
import com.example.praksa.Service;

import java.sql.SQLException;
import java.util.Dictionary;
import java.util.Enumeration;

@SpringBootApplication
public class PraksaApplication {



	public static void main(String[] args) throws SQLException {
		SpringApplication.run(PraksaApplication.class, args);
		Service service = new Service();
		service.LoadData();

		int length = service.GetLength(7);
		System.out.println("Udaljenost kvara od trafostanice je: " + length	+ "m");
    }

}
