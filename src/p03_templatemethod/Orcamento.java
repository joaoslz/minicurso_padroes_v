package p03_templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void adiciona(Item item) {
        itens.add(item );
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens );
    }
}
