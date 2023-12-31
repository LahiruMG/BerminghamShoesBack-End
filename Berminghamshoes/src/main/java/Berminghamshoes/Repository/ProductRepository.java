package Berminghamshoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Berminghamshoes.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}