package br.com.SMHE.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.SMHE.dao.FabricanteDAO;
import br.com.SMHE.entity.Fabricante;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {
	@RequestMapping(method = RequestMethod.GET)
	public List<Fabricante> listar(){
		FabricanteDAO dao = new FabricanteDAO();
		List<Fabricante> resultado = dao.listar();
		return resultado;
	}
}
