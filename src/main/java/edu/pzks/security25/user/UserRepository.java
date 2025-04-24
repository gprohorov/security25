package edu.pzks.security25.user;


/*
  @author   george
  @project   book-social-network
  @class  UserRepository
  @version  1.0.0 
  @since 04.10.24 - 20.45
*/


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
