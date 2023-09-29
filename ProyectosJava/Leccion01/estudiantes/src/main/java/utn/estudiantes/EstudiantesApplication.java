package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner { //esta implementacion es para que pueda levantar por consola la app, por el metodo run
	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class); // esto es para enviar la info a la consola.

	String nl = System.lineSeparator(); // hace un salto de linea

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion...");
		//Levantar la fabrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("aplicacion finalizada!");
	}

	@Override //metodo run de la interface
	//aqui va la logica de negocio
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el metodo run de Spring..."+nl);
	}
}
