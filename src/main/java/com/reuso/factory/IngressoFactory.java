package com.reuso.factory;

import com.reuso.entities.Ingresso;
import com.reuso.entities.PessoaFisica;
import com.reuso.entities.PessoaJuridica;

public class IngressoFactory {
	public static Ingresso createIngresso(String tipo, Long id, String titulo, String descricao, int quantidade, float valor, boolean inteiro, PessoaFisica pessoaFisica, PessoaJuridica pessoaJuridica) {
        if (tipo.equalsIgnoreCase("i")) {
        	if(pessoaFisica != null) {
        		return new Ingresso(null, titulo, descricao, quantidade, valor, inteiro, pessoaFisica);
        	}else {
        		return new Ingresso(null, titulo, descricao, quantidade, valor, inteiro, pessoaJuridica);
        	}
        } else if (tipo.equalsIgnoreCase("m")) {
        	if(pessoaFisica != null) {
        		return new Ingresso(null, titulo, descricao, quantidade, valor/2, inteiro, pessoaFisica);
        	}else {
        		return new Ingresso(null, titulo, descricao, quantidade, valor/2, inteiro, pessoaJuridica);
        	}
        } else {
            throw new IllegalArgumentException("Tipo de ingresso desconhecido.");
        }
    }
}
