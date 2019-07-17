package br.com.alura.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository repository;

	public Iterable<Convidado> obterTodos() {
		Iterable<Convidado> convidados = repository.findAll();

		return convidados;
	}

	public void save(Convidado novoConvidado) {
		repository.save(novoConvidado);
	}
	
}
