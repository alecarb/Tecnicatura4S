package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiante;
//se le pasa entre <> la clase y el tipo de dato de la llave primaria
//No es necesario agregar la anotacion @Repository porque ya extiende de la clase JpaRepository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
}
