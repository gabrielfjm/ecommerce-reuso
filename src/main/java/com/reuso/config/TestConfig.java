package com.reuso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.reuso.entities.Evento;
import com.reuso.entities.TipoEvento;
import com.reuso.repositories.EventoRepository;
import com.reuso.repositories.PessoaFisicaRepository;
import com.reuso.repositories.PessoaJuridicaRepository;
import com.reuso.repositories.TelefoneRepository;
import com.reuso.repositories.TipoEventoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;
	
	@Autowired
	private PessoaJuridicaRepository pessoaJuridicaRepository;
	
	@Autowired
	private TipoEventoRepository tipoEventoRepository;
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		TipoEvento te1 = new TipoEvento(null, "Jogo de Futebol");
//		TipoEvento te2 = new TipoEvento(null, "Show");
//		TipoEvento te3 = new TipoEvento(null, "Convenção");
//		tipoEventoRepository.saveAll(Arrays.asList(te1, te2, te3));
//		
//		Evento e1 = new Evento(null, "Brasil x Equador", "2024-11-10", te1);
//		Evento e2 = new Evento(null, "ExpoCampi 2024", "2024-10-27", te2);
//		eventoRepository.saveAll(Arrays.asList(e1, e2));
		
//		PessoaFisica pf1 = (PessoaFisica) UsuarioFactory.createUser("f", "Tiago Vieira Paulin", "tiagopaulin@gmail.com", "senha456","2002-04-10", "456.456.089-42");
//		PessoaJuridica pj1 = (PessoaJuridica) UsuarioFactory.createUser("j", "Tiago Vieira Paulin", "tiagopaulin@gmail.com", "senha456","", "81.243.735/0019-77");
//		pessoaFisicaRepository.saveAll(Arrays.asList(pf1));
//		pessoaJuridicaRepository.saveAll(Arrays.asList(pj1));
//		
//		Telefone t1 = new Telefone(null, "+55", "(41)", "98496-1004", pf1);
//		Telefone t2 = new Telefone(null, "+55", "(41)", "98522-6042", pj1);
//		
//		telefoneRepository.saveAll(Arrays.asList(t1, t2));		
		
	}	
}
