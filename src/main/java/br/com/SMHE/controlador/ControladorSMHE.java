package br.com.SMHE.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/views")
public class ControladorSMHE {

	@RequestMapping("/controller")
	public ModelAndView Hello() {
		String message = "I am ilive!";
		return new ModelAndView("/views/controller", "message", message);
	}

}
