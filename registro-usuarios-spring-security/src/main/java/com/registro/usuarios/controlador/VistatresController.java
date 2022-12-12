package com.registro.usuarios.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VistatresController {
	
	@RequestMapping("/vistatres")
	public String vistatres() {
		return "Bienestar";
	}

}
