package model.dao;

import java.util.List;

import model.enteties.Department;
import model.enteties.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> fingByDepartment(Department department);

}
