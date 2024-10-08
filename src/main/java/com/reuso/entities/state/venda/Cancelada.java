package com.reuso.entities.state.venda;

import com.reuso.entities.Venda;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CANCELADA")
public class Cancelada extends EstadoVendaBase{

	@Override
    public void realizarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda cancelada não pode ser publicada");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public void cancelarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda já está cancelada.");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public void extornarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda cancelada não pode ser extornada.");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public String getEstado() {
        return "Venda Cancelada";
    }

}
