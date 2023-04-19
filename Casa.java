import java.util.Calendar;
import java.util.List;

/** 
 * Classe Casa: herança da classe Imovel
 */

public class Casa extends Imovel{

    //#region variaveis
    private static final double aliquota = 0.005;
    private double valorAluguel;
    private double valorSeguroAnual;
    private static final double MAX_DESCON = 0.3;


    //#region construtor da classe Casa chamando o construtor da classe Mãe(Imovel)
    public Casa(double valorVenda,String endereco, int anoConstrucao, List<Beneficios> beneficio, double valorSeguroAnual){
        super(valorVenda, endereco, anoConstrucao, beneficio);
        this.valorSeguroAnual = valorSeguroAnual;
    }

    @Override
    /**
     * Confere se o imovel contem ou não beneficios.
     * Em caso de desconto em imoveis antigos acima de 15 anos, ignora e aplica-se o desconto máximo permitido(30%).
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
        //conferir se a construção possui mais de 5 anos para passar o desconto
        int idadeCasa = anoAtual - anoConstrucao;
        double desconto = Math.min(0.1 * Math.floor(idadeCasa / 5), MAX_DESCON);
        valorAluguel *= (1 - desconto);
        return valorAluguel;
    }

    @Override
     /**
      * Valor total a ser pago: valor do aluguel + parcela do seguro anual
      * @return O valor total a ser pago, incluindo uma parcela do seguro, num double.
      */
    public double totalSerPagoAluguel(){
        double total;
        total = aluguel() + (valorSeguroAnual/12);
        return total;
    }
}
