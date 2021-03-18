package p02_chainofresponsability;

public class CalculadorDeDescontos {
  public double calcula(Orcamento orcamento) {
    // regras de desconto
    Desconto d1 = new DescontoPorCincoItens();
    Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
    Desconto d3 = new SemDesconto();

    // configuro o chain
    d1.setProximo(d2);
    d2.setProximo(d3);

    return d1.desconta(orcamento);

  }
}


/*
public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento) {
    // verifica primeira regra de possível desconto


    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return orcamento.getValor() * 0.07;
    }

    // verifica terceira, quarta, quinta regra de
    // possível desconto  ...
    // um monte de ifs daqui pra baixo
  }
}
*/
