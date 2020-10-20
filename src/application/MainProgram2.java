package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class MainProgram2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("---- TESTE 1: Department findAll");
		List<Department> listDepartments = departmentDao.findAll();

		for (Department department : listDepartments) {
			System.out.println(department);
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------\n");

		System.out.println("---- TESTE 2: Department insert ----");
		Department insertDepartment = new Department(null, "Contabilidade");

		departmentDao.insert(insertDepartment);
		System.out.println("Inserted! New id = " + insertDepartment.getId());
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------\n");

		System.out.println("---- TESTE 3: Department findById ----");
		Department departmentFind = departmentDao.findById(2);
		System.out.println(departmentFind);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------\n");

		System.out.println("---- TESTE 4: Department update");
		departmentFind = departmentDao.findById(7);
		departmentFind.setName("Diretoria");
		departmentDao.update(departmentFind);
		System.out.println("Update completed!");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("---- TESTE 5: Department delete");
		departmentDao.deleteById(9);
	}

}
