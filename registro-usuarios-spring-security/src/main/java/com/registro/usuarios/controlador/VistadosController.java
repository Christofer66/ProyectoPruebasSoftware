package com.registro.usuarios.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VistadosController {
	
	@RequestMapping("/vistados")
	public String vistados(){
		return "Mamá&bebé";
	}

}
