package com.corhuila.shoppingcar.IRepository;

import com.corhuila.shoppingcar.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends MongoRepository<Autor, String> {

}
