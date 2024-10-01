package com.reuso.config;

import java.sql.Date;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.reuso.entities.PessoaFisica;
import com.reuso.entities.PessoaJuridica;
import com.reuso.entities.Telefone;
import com.reuso.repositories.PessoaFisicaRepository;
import com.reuso.repositories.PessoaJuridicaRepository;
import com.reuso.repositories.TelefoneRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;
	
	@Autowired
	private PessoaJuridicaRepository pessoaJuridicaRepository;
	
	@Override
	public void run(String... args) throws Exception {		
		
		PessoaFisica pf1 = new PessoaFisica(null, "Gabriel Felipe Jess Meira", "gabrielfjmeira@gmail.com", "senha123", Date.valueOf("2004-04-10"), "132.456.089-42");
		
		pessoaFisicaRepository.saveAll(Arrays.asList(pf1));
		
		PessoaJuridica pj1 = new PessoaJuridica(null, "PUC-PR", "pucpr@pucpr.com", "pucpr123", "75.103.192/0001-60");
		
		pessoaJuridicaRepository.saveAll(Arrays.asList(pj1));
		
		Telefone t1 = new Telefone(null, "+55", "(41)", "98496-1004", pf1);
		Telefone t2 = new Telefone(null, "+55", "(41)", "98522-6042", pj1);
		
		telefoneRepository.saveAll(Arrays.asList(t1, t2));	
		
		
	}	
}
