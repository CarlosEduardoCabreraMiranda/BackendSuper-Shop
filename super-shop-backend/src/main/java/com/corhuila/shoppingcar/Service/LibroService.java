package com.corhuila.shoppingcar.Service;

import com.corhuila.shoppingcar.Entity.Libro;
import com.corhuila.shoppingcar.IRepository.ILibroRepository;
import com.corhuila.shoppingcar.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository repository;

    @Override
    public List<Libro> findAll() {return repository.findAll();}

    @Override
    public Optional<Libro> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Libro save(Libro libro) {
        return repository.save(libro);
    }

    @Override
    public void update(Libro libro, Long id) {
       /*Optional<Autor>*/Optional<Libro> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (ps.isPresent()){
            Libro libroUpdate = ps.get();
            libroUpdate.setTitulo(libro.getTitulo());
            libroUpdate.setIsbn(libro.getIsbn());
            libroUpdate.setGenero(libro.getGenero());
            libroUpdate.setAnioPublicacion(libro.getAnioPublicacion());
            libroUpdate.setSinopsis(libro.getSinopsis());
            libroUpdate.setAutor(libro.getAutor());
            //Actualizar el objeto cliente
            repository.save(libroUpdate);
        }else{
            System.out.println("No existe el libro");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
