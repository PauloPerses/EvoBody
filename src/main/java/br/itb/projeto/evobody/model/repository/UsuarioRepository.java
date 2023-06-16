package br.itb.projeto.evobody.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.evobody.model.entity.Usuario;

@Repository
public interface UsuarioRepository 
		   extends JpaRepository<Usuario, Long> {

}



