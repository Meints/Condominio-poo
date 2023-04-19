import java.util.*;

/**
 * Classe Proprietario
 * Usando: encapsulamento, construtores
 */
public class Proprietario {

    //#region variáveis
    private String nome;
    private List<Imovel> imDoPropr;

    //#region construtor
    public Proprietario(String nome) {
        this.nome = nome;
        imDoPropr = new LinkedList<Imovel>();
    }

    /**
     * Adiciona imoveis a lista de imoveis do proprietário. Só será executado se passar como parâmetro um tipo de imovel(Casa ou Apartamento).
     * @param imovel Imovel a ser adicionado na lista deste
     */
    public void addImovel(Imovel imovel) {
        this.imDoPropr.add(imovel);
    }

     /**
     * Mostra a lista com todos os imoveis de um dado proprietário
     */
    public void mostraImoveisDeste(){
        System.out.println("Imóveis de: " + this.nome);
        for (Imovel imovel : imDoPropr) {
            System.out.println(imovel.toString());
        }
    }

     /**
     * Método para retornar o nome do proprietário
     * @return String nome do proprietário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para retornar a lista de imóveis do proprietário
     * @return Imovel imóveis do proprietário
     */
    public List<Imovel> getImovel(){
        return this.imDoPropr;
    }
}