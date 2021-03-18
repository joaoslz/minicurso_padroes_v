package p02_chainofresponsability;

public class SemDesconto implements Desconto {

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        throw new IllegalStateException("A regra SemDesconto não pode ter o próximo");


    }
}
