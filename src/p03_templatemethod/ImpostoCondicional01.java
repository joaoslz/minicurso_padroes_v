package p03_templatemethod;

public class ImpostoCondicional01 extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveAplicarAMaximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() > 500);
    }

    @Override
    protected double aplicaMinimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double aplicaAMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
}
