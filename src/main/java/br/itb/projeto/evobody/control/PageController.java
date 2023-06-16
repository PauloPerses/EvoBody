package br.itb.projeto.evobody.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class PageController {
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}

}






