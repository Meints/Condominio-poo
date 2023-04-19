/**
 * Classe Beneficios
 * Usando: encapsulamento, construtores
 */

public class Beneficios {

    //#region variáveis
    private String nomeBeneficio;
    private double precoBeneficio;


    //#region construtor
    public Beneficios(String nomeBeneficio, double precoBeneficio){
        this.nomeBeneficio = nomeBeneficio;
        this.precoBeneficio = precoBeneficio;
    }

    /**
     * Método para retornar o nome do benefício
     * @return String nome do beneficio
     */
    public String getNomeBeneficio() {
        return nomeBeneficio;
    }

    /**
     * Método para retornar o preço do benefício
     * @return double preço do beneficio
     */
    public double getPrecoBeneficio() {
        return precoBeneficio;
    }
}
