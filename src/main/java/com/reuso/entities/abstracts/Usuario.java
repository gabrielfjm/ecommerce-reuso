package com.reuso.entities.abstracts;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.reuso.entities.Telefone;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Usuario {
	
	private Long id;
    private String nomeCompleto;
    private String email;
    private String senha;
    private Date dataNascimento;
    private List<Telefone> telefones = new ArrayList<>();

    public Usuario(){

    }

    public Usuario(Long id, String nomeCompleto, String email, String senha, Date dataNascimento) {
    	this.id = id;
    	this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    /* Método para adicionar telefone
    public void addTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    // Método para remover telefone
    public void removeTelefone(Telefone telefone) {
        telefones.remove(telefone);
    }

    // Método para listar telefones
    public void listarTelefones() {
        System.out.println("Telefones de " + nomeCompleto + ":");
        for (Telefone telefone : telefones) {
            System.out.println(telefone);
        }
    }*/
}
