package com.springBoot.gestionBiblioteca.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import com.springBoot.gestionBiblioteca.model.Libro;
import com.springBoot.gestionBiblioteca.repository.LibroRepository;
import com.springBoot.gestionBiblioteca.repository.StatusRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class LibroServiceImpTest {
    StatusRepository statusRepository;
    LibroRepository libroRepository;
    LibroServiceImp libroServiceImp;

    private Libro libro;

    @BeforeEach
    void SetUp(){
        statusRepository = mock(StatusRepository.class);
        libroRepository = mock(LibroRepository.class);
        libroServiceImp = new LibroServiceImp(statusRepository,libroRepository);
    }

    @Test
    @DisplayName("Libros disponibles")
    void disponibles() {
        LibroRepository repository = mock(LibroRepository.class);
        LibroService service = new LibroServiceImp(repository);
        List<Libro> datos = Arrays.asList(new Libro());

        when(repository.findAll()).thenReturn(datos);
        List<Libro> libro = service.disponibles();
    }

    @Test
    @DisplayName("Estado prestamo")
    void estado() {
    }

    @Test
    @DisplayName("Guardar libro")
        void save(){
    }
}