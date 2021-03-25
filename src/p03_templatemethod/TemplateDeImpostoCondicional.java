package p03_templatemethod;

abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {

        if (deveAplicarAMaximaTaxacao(orcamento) ) {
            // codigio ...
            // .....
            return aplicaAMaximaTaxacao(orcamento);
        } else {
            // codigo
            return aplicaMinimaTaxacao(orcamento);
        }
    }

    protected abstract boolean deveAplicarAMaximaTaxacao(Orcamento orcamento );

    protected abstract double aplicaMinimaTaxacao(Orcamento orcamento) ;

    protected abstract double aplicaAMaximaTaxacao(Orcamento orcamento);



}
