package br.itb.projeto.evobody.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.itb.projeto.evobody.model.entity.Usuario;
import br.itb.projeto.evobody.model.service.UsuarioService;

@Controller
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	@GetMapping("/index")
	public String index() {
		List<Usuario> usuarios = usuarioService.findAll();
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getEmail());
		}
			
		return "index";
	}
	






	
}
	