package Berminghamshoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Berminghamshoes.Model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
   
}
