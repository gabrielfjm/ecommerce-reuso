package com.reuso.entities.state.venda;

import com.reuso.entities.Venda;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("EXTORNADA")
public class Extornada extends EstadoVendaBase{
	@Override
    public void realizarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda extornada não pode ser publicada");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public void cancelarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda extornada não pode ser cancelada.");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public void extornarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda já foi extornada.");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public String getEstado() {
        return "Venda Extornada";
    }
}
