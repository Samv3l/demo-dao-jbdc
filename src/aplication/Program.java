package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.enteties.Department;
import model.enteties.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("----- Tste Seller FindById ------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("----- Teste Seller FindByDepartment------");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.fingByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
			
		System.out.println("----- Teste Seller FindAll------");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
			
		System.out.println("----- Teste Seller Insert------");
		sellerDao.insert(seller);
		
		System.out.println("----- Teste Seller Update------");
		seller = sellerDao.findById(1);
		seller.setName("olga");
		sellerDao.update(seller);
		System.out.println(seller);
		
	}

}
