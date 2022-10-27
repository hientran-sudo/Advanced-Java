package lab.Practice.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lab.Practice.models.Product;
import lab.Practice.services.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController {
	@Autowired
	ProductService service;
	
	@PostMapping("/api/v1/products")
	public Product addProduct(@RequestBody Product p) {
		return service.addProduct(p);		
	}
	
	@GetMapping("/api/v1/products")
	public ArrayList<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@PatchMapping("/api/v1/products/{id}")
	public void updateProduct(@PathVariable("id") Integer id, @RequestBody Product pro) {
		service.updateProduct(id, pro);
	}
	
	@DeleteMapping("api/v1/products/{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		service.deleteProduct(id);
	}
	

}
