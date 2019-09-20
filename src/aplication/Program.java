package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.enteties.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("----- Tste Seller FindById ------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
