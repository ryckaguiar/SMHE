package br.com.SMHE.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/views")
public class ControladorSMHE {

	@RequestMapping("/hello")
	@ResponseBody
	public ModelAndView Hello() {
		String message = "Ocorreu tudo bem";
		return new ModelAndView("/views/bemvindo.jsp", "hello", message);
	}

}
