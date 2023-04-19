import java.util.List;

/**
 * Classe Imovel: abstrata, podendo apenas ser herdada
 * Usando: protected para sua filhas terem acesso aos atributos
 */

public abstract class Imovel{

    //#region variáveis

    protected double valorVenda;
    protected String endereco;
    protected int anoConstrucao;
    protected List<Beneficios> beneficio;


    //#region construtor

    public Imovel(double valorVenda, String endereco, int anoConstrucao, List<Beneficios> beneficio){
        this.valorVenda = valorVenda;
        this.endereco = endereco;
        this.anoConstrucao = anoConstrucao;
        this.beneficio = beneficio;
    }

    /**
     * Métodos abstrato para suas filhas herdarem e sobrescreverem
     */

    public abstract double aluguel();

    public abstract double totalSerPagoAluguel();
    

    @Override
    /**
     * Retorna o imóvel. Formato:
     * Tipo do Imóvel <class>
     * <endereco> valor: <valorVenda> ano de construção: <anoConstrucao>
     * @return String no formato indicado.
     */
    public String toString() {
        return "\nTipo do Imóvel: " + this.getClass().getSimpleName() + "\n" + endereco + " valor: " + valorVenda + " ano de construção: " + anoConstrucao;
    }
}