package com.reuso.entities.state.anuncio;

import com.reuso.entities.Anuncio;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LIBERADO")
public class Liberado extends EstadoAnuncioBase {
	
	public Liberado(Long id) {
		super(id);
	}

	@Override
	public void publicar(Anuncio anuncio) {
		System.out.println("Anúncio já está liberado e publicado.");
	}

	@Override
	public void bloquear(Anuncio anuncio) {
		anuncio.setEstado(new Bloqueado(this.getId()));
		System.out.println("\n------------------------\n");
		System.out.println("Anúncio bloqueado.\n");
		System.out.println(anuncio);
		System.out.println("\n------------------------");
	}

	@Override
	public void editar(Anuncio anuncio, String titulo, String descricao) {
		anuncio.setTitulo(titulo);
		anuncio.setDescricao(descricao);
		System.out.println("\n------------------------\n");
		System.out.println("Anúncio editado.\n");
		System.out.println(anuncio);
		System.out.println("\n------------------------");
	}

	@Override
	public void vendido(Anuncio anuncio) {
		anuncio.setEstado(new Vendido(this.getId()));
		System.out.println("\n------------------------\n");
		System.out.println("Anúncio vendido.\n");
		System.out.println(anuncio);
		System.out.println("\n------------------------");
	}

	@Override
	public String estado() {
		return "Liberado";
	}

}
