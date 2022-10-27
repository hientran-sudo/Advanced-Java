package lab.Practice.repository;

import org.springframework.data.repository.CrudRepository;

import lab.Practice.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
