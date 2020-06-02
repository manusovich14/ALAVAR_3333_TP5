package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Alavar3333Tp5Application implements CommandLineRunner {
	@Autowired 
	IUsuarioService usuarioService;
	@Autowired 
	Usuario usuario;

	public static void main(String[] args) {
		SpringApplication.run(Alavar3333Tp5Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		usuario.setApellido("Alavar");
		usuario.setDireccion("Av Mitre 234");
		usuario.setDni(38469753);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1994, 07, 11));
		usuario.setId(1);
		usuario.setNombre("Emanuel");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
	}

}
