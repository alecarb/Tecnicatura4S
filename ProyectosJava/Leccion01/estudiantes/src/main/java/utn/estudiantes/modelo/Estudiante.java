package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//boilerplate - Repetitivo
@Data // crea los get y set
@NoArgsConstructor // agrega el constructor vacio
@AllArgsConstructor // constructor con argumnetos
@ToString //metodo ToString
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valor de llave autoincremental
    private Integer idEstudiante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
