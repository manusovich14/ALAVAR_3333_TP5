package ar.edu.unju.fi.repository;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Alavar3333Tp5Application;
import ar.edu.unju.fi.model.Usuario;


@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {
	
	@Autowired
	private Usuario usuario;

	public static Logger LOG = LoggerFactory.getLogger(Alavar3333Tp5Application.class);
	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("El usuario fue guardado "+ usuario.getApellido()+", "+ usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino el usuario de la bd");
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		LOG.info("Se modifico el usuario de la bd");
		return usuario;
	}

}
