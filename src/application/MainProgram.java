package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class MainProgram {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			SellerDao sellerDao = DaoFactory.createSellerDao();

			System.out.println("--- TESTE 1: Seller findById ---");
			Seller seller = sellerDao.findById(3);
			System.out.println(seller);
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("\n--- TESTE 2: Seller findByDepartment ---");
			Department department = new Department(2, null);
			List<Seller> listSeller = sellerDao.findByDepartment(department);

			for (Seller sellerObj : listSeller) {
				System.out.println(sellerObj);
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("\n--- TESTE 3: Seller findAll ---");
			listSeller = sellerDao.findAll();

			for (Seller sellerObj : listSeller) {
				System.out.println(sellerObj);
			}
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("\n--- TESTE 4: Seller insert ---");
			Seller insertSeller = new Seller(null, "Maria Joaquina", "mariJoq@gmail.com", new Date(), 2806.47,
					department);
			sellerDao.insert(insertSeller);
			System.out.println("Inserted! New id = " + insertSeller.getId());
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("\n--- TESTE 5: Seller update ---");
			seller = sellerDao.findById(1);
			seller.setName("Marta Wayne");
			sellerDao.update(seller);
			System.out.println("Update completed!");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			System.out.println("\n--- Teste 6: Seller delete ---");
			System.out.print("Enter id for delete test: ");
			int id = scan.nextInt();

			sellerDao.deleteById(id);
			System.out.println("Delete completed!");
		}
	}

}
