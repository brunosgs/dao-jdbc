package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class MainProgram {

	public static void main(String[] args) {
		Department department = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, department);
		
		System.out.println(department);
		System.out.println(seller);
	}

}
