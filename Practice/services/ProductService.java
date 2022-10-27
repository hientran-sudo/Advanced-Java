package lab.Practice.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.Practice.models.Product;
import lab.Practice.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository proRepo;
	ArrayList<Product> proList = new ArrayList<>();
	
	public Product addProduct(Product pro) {
		return proRepo.save(pro);
	}
	
	public ArrayList<Product> getAllProducts (){
		return (ArrayList<Product>) proRepo.findAll();
	}
	
	public Product updateProduct (Integer id, Product p) {
		Product old = proRepo.findById(id).get();
		old.setName(p.getName());
		return proRepo.save(p);
	}
	
	public void deleteProduct (Integer id) {
		proRepo.deleteById(id);
		
	}
	
	
	

}
