package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class MainProgram {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("--- Teste 1: Seller findById ---");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n--- Teste 2: Seller findByDepartment ---");
		Department department = new Department(2, null);
		List<Seller> listSeller = sellerDao.findByDepartment(department);

		for (Seller sellerObj : listSeller) {
			System.out.println(sellerObj);
		}

		System.out.println("\n--- Teste 3: Seller findAll ---");
		listSeller = sellerDao.findAll();

		for (Seller sellerObj : listSeller) {
			System.out.println(sellerObj);
		}

	}

}
