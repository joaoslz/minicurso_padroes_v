package p02_chainofresponsability;

public class TestaDescontos {

  public static void main(String[] args) {
    CalculadorDeDescontos calculador = new CalculadorDeDescontos();
     
      Orcamento orcamento = new Orcamento(90.0);

      orcamento.adiciona(new Item("CANETA", 25.0));
      orcamento.adiciona(new Item("LAPIS", 25.0));
      orcamento.adiciona(new Item("Borracha", 20.0));
      orcamento.adiciona(new Item("Papel A4", 20.0));
 //     orcamento.adiciona(new Item("Papel A3", 201.0));

      double desconto = calculador.calcula(orcamento);
 
      System.out.println(desconto);
 
  }
}
