package com.reuso.entities.state.venda;

import com.reuso.entities.Venda;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("REALIZADA")
public class Realizada extends EstadoVendaBase{

	@Override
    public void realizarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda já foi realizada.");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public void cancelarVenda(Venda venda) {
        System.out.println("\n----------------\n");
        System.out.println("Venda não pode ser cancelada, pois foi realizada.");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public void extornarVenda(Venda venda) {
        venda.setEstadoVenda(new Extornada());
        System.out.println("\n----------------\n");
        System.out.println("Venda extornada.");
        System.out.println(venda);
        System.out.println("\n----------------\n");
    }

    @Override
    public String getEstado() {
        return "Venda Realizada";
    }

}
