package Berminghamshoes.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Berminghamshoes.Model.Product;
import Berminghamshoes.Repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

   
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null);
	}

   
}
