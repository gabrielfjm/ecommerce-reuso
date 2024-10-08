package com.reuso.entities.state.anuncio;

import com.reuso.entities.Anuncio;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BLOQUEADO")
public class Bloqueado extends EstadoAnuncioBase {
	
	public Bloqueado(Long id) {
		super(id);
	}
	
	@Override
	public void publicar(Anuncio anuncio) {
		System.out.println("\n------------------------\n");
		System.out.println("Não é possível publicar um anúncio bloqueado.\n");
		System.out.println(anuncio);
		System.out.println("\n------------------------");
	}

	@Override
	public void bloquear(Anuncio anuncio) {
		System.out.println("\n------------------------\n");
		System.out.println("Anúncio já está bloqueado.\n");
		System.out.println(anuncio);
		System.out.println("\n------------------------");
	}

	@Override
	public void vendido(Anuncio anuncio) {
		System.out.println("\n------------------------\n");
		System.out.println("Não é possível vender um anúncio bloqueado.\n");
		System.out.println(anuncio);
		System.out.println("\n------------------------");
	}

	@Override
	public void editar(Anuncio anuncio, String titulo, String descricao) {
		System.out.println("\n------------------------\n");
		System.out.println("Não é possível editar um anúncio bloqueado.\n");
		System.out.println(anuncio);
		System.out.println("\n------------------------");
	}

	@Override
	public String estado() {
		return "Bloqueado";
	}
}
