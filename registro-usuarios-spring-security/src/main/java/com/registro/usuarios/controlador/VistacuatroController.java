package com.registro.usuarios.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VistacuatroController {
	
	@RequestMapping("/vistacuatro")
	public String vistacuatro() {
	return "Dermocosmetica";
	}
}
