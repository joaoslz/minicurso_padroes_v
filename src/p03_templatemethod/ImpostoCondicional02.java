package p03_templatemethod;

public class ImpostoCondicional02 extends TemplateDeImpostoCondicional {
    @Override
    protected boolean deveAplicarAMaximaTaxacao(Orcamento orcamento ) {
        return  (orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento));
    }

    @Override
    protected double aplicaMinimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double aplicaAMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for(Item item : orcamento.getItens()) {
            if(item.getValor() > 100) return true;
        }
        return false;
    }
}
