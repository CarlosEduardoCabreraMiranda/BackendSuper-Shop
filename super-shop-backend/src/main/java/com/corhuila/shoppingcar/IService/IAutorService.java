package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Entity.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> findAll(); // Devuelve una lista de autores
    Optional<Autor> findById(Long id); // Devuelve un autor por su id
    Autor save(Autor autor); // Guarda un autor
    void update(Autor autor, Long id); // Actualiza un autor
    void delete(Long id); // Elimina un autor
}
