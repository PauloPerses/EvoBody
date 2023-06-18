package br.itb.projeto.evobody.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.itb.projeto.evobody.model.entity.Usuario;


public interface UsuarioRepository 
		   extends JpaRepository<Usuario, Integer> {
	
	List<Usuario> findByEmail(String email);
	
	Usuario findById(int id);

}



