package p02_chainofresponsability;

public interface Desconto {
  double desconta(Orcamento orcamento);
  void setProximo(Desconto proximo);
}
