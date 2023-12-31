package Berminghamshoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Berminghamshoes.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  
}