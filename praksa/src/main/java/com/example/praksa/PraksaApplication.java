package com.example.praksa;

import com.example.praksa.dataclasses.ConnectivityNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.praksa.Builder;
import com.example.praksa.Service;

import java.sql.SQLException;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;

@SpringBootApplication
public class PraksaApplication {



	public static void main(String[] args) throws SQLException {
		SpringApplication.run(PraksaApplication.class, args);
		Service service = new Service();
		service.LoadData();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an id of a broken conductor: ");
		int number = 0;
		if (scanner.hasNextInt()) { // Check if the next input is an int
			 number = scanner.nextInt();
		}

		int length = service.GetLength(number);
		System.out.println("Udaljenost kvara od trafostanice je: " + length	+ "m");
    }

}
