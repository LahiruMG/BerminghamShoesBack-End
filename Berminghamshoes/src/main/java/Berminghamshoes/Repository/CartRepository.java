package Berminghamshoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Berminghamshoes.Model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
  
}
