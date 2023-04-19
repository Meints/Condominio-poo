import java.util.Calendar;
import java.util.List;

/** 
 * Classe Apartamento: herança da classe Imovel
 */

public class Apartamento extends Imovel{

    //#region variaveis

    private static final double aliquota = 0.004;
    private double valorAluguel;
    private double taxaMensal;


    //#region construtor da classe Apartamento chamando o construtor da classe Mãe(Imovel)
    public Apartamento(double valorVenda, String endereco, int anoConstrucao, List<Beneficios> beneficio, double taxaMensal) {
        super(valorVenda, endereco, anoConstrucao, beneficio);
        this.taxaMensal = taxaMensal;
    }

    @Override
    /**
     * Confere se o imovel contem ou não beneficios.
     * Em caso de desconto em imoveis antigos acima de 30 anos, ignora e aplica-se o desconto máximo permitido(30%).
     * @return O valor do aluguel do imóvel.
     */
    public double aluguel() {

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        
        valorAluguel = valorVenda * aliquota;
        //conferindo se a lista de beneficios está com itens
        if (beneficio != null) {
            for (Beneficios beneficio : beneficio) {
                valorAluguel += beneficio.getPrecoBeneficio();
            }
        }
        
        //conferindo se o apartamento possui mais de 5 anos para passar o desconto
        int idade = anoAtual - anoConstrucao;
        double[] valoresDeAluguel = { 1.0, 0.95, 0.9, 0.85, 0.8, 0.75, 0.7 };
        int indice = Math.min(idade / 5, valoresDeAluguel.length - 1);
        this.valorAluguel *= valoresDeAluguel[indice];
        return valorAluguel;
    }

    @Override
    /**
      * Valor total a ser pago: valor do aluguel + taxa mensal do condomínio
      * @return O valor total a ser pago, incluindo a taxa mensal do condomínio, num double.
      */
    public double totalSerPagoAluguel(){
        double total;
        total = aluguel() + taxaMensal;
        return total;
    }
}
