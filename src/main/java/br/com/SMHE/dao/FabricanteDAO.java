package br.com.SMHE.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.SMHE.entity.Fabricante;

public class FabricanteDAO {
	private List<Fabricante> fabricante;
	
	public List<Fabricante> listar(){
		fabricante = new ArrayList<>();
		fabricante.add(new Fabricante(1L, "Fabricante 1"));
		fabricante.add(new Fabricante(2L, "Fabricante 2"));
		fabricante.add(new Fabricante(3L, "Fabricante 3"));
		fabricante.add(new Fabricante(4L, "Fabricante 4"));
		fabricante.add(new Fabricante(5L, "Fabricante 5"));
		fabricante.add(new Fabricante(6L, "Fabricante 6"));
		
		return fabricante;
	}
	
}
