package p03_templatemethod;

public class CalculadorDeImpostosOld {

    public void realizaCalculo(Orcamento orcamento, String imposto){

        if( "ICMS".equals(imposto) ) {

            double icms = new ICMS().calcula(orcamento );
            System.out.println(icms);

        } else if( "ISS".equals(imposto) ) {

            double iss = new ISS().calcula(orcamento );
            System.out.println(iss);
        } else if (false) {
            // PIS COFINS, IRPF, ...
        } else {
            //...
        }

    }
}
