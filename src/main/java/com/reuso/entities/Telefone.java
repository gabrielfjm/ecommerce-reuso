package com.reuso.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_telefone")
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String ddi;
    private String ddd;
    private String numero;
    
    @ManyToOne
	@JoinColumn(name = "pf_id")
	private PessoaFisica pessoaFisica;
    
    @ManyToOne
   	@JoinColumn(name = "pj_id")
   	private PessoaJuridica pessoaJuridica;
    
    public Telefone() {
    }

    public Telefone(Long id, String ddi, String ddd, String numero, PessoaFisica pessoaFisica) {
        this.id = id;
    	this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.pessoaFisica = pessoaFisica;
        this.pessoaJuridica = null;
    }
    
    public Telefone(Long id, String ddi, String ddd, String numero, PessoaJuridica pessoaJuridica) {
        this.id = id;
    	this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.pessoaFisica = null;
        this.pessoaJuridica = pessoaJuridica;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddi=" + ddi + ", ddd=" + ddd + ", numero=" + numero + "]";
	}
}
