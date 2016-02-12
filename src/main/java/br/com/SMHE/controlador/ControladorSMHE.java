package br.com.SMHE.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class ControladorSMHE {
	@RequestMapping("/world")
	public String Hello(){
		return "Hello World";
	}
}
