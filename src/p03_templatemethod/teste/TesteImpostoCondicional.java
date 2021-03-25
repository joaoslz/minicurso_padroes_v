package p03_templatemethod.teste;

import p03_templatemethod.ImpostoCondicional01;
import p03_templatemethod.Orcamento;

public class TesteImpostoCondicional {

    public static void main(String[] args) {
        ImpostoCondicional01 imposto = new ImpostoCondicional01();

        Orcamento orcamento = new Orcamento(80);

        double valorImposto = imposto.calcula(orcamento );
        System.out.println(valorImposto );


    }
}
