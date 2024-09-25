package com.example.demo.service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public  void deleteProduct(int id){
        productRepository.deleteById(id);
       
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }
}
