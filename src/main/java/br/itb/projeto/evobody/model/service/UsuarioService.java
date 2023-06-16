package br.itb.projeto.evobody.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.evobody.model.entity.Usuario;
import br.itb.projeto.evobody.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}

}
