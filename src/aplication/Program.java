package aplication;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.enteties.Department;
import model.enteties.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "ola");
		
		Seller seller = new Seller(2, "Bob", "bob@gmail.com", new Date(), 3000.0, dp);
		
		SellerDao sellerDao = new DaoFactory().createSellerDao();
		
		System.out.println(seller);

	}

}
