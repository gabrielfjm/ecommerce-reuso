package com.reuso.entities.state.venda;

import com.reuso.entities.Venda;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("EM_PROCESSAMENTO")
public class EmProcessamento extends EstadoVendaBase {

	@Override
	public void realizarVenda(Venda venda) {
		venda.setEstadoVenda(new Realizada());
		System.out.println("\n----------------\n");
		System.out.println("Venda Realizada.");
		System.out.println(venda);
		System.out.println("\n----------------\n");
	}

	@Override
	public void cancelarVenda(Venda venda) {
		venda.setEstadoVenda(new Cancelada());
		System.out.println("\n----------------\n");
		System.out.println("Venda cancelada.");
		System.out.println(venda);
		System.out.println("\n----------------\n");
	}

	@Override
	public void extornarVenda(Venda venda) {
		System.out.println("\n----------------\n");
		System.out.println("Venda não pode ser extornada porque não foi realizada.");
		System.out.println(venda);
		System.out.println("\n----------------\n");
	}

	@Override
	public String getEstado() {
		return "Venda Em Processamento";
	}

}
