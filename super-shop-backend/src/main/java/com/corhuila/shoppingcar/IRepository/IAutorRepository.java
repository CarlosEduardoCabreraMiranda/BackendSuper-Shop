package com.corhuila.shoppingcar.IRepository;

import com.corhuila.shoppingcar.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long> {

}
