package p03_templatemethod;

public class ISS implements Imposto {

  @Override
  public double calcula(Orcamento orcamento) {
      return orcamento.getValor() * 0.06;
  }
 
}
