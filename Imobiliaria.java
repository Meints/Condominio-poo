import java.util.*;

/**
 * Classe Imobiliaria
 * Usando: encapsulamento, construtores
 */

public class Imobiliaria {

    //#region variavies
    private List<Imovel> imoveis;
    private int tamanhoListaImov = 0;
    private int tamanhoListaProp = 0;
    private List<Proprietario> proprietarios;


    //#region construtor, criando um novo nó na lista de imóveis
    //criando um novo nó na lista de proprietarios
    public Imobiliaria(){
        this.imoveis = new LinkedList<>();
        this.proprietarios = new LinkedList<>();
    }

    /**
     * Adiciona imoveis a lista de imoveis. Só será executado se passar como parâmetro um tipo de imovel(Casa ou Apartamento).
     * @param imovel Imovel a ser adicionado na lista
     */
    public void addLista(Imovel imovel){
        this.imoveis.add(imovel);
        tamanhoListaImov++;
    }

    /**
     * Adiciona proprietarios a lista de proprietarios. Só será executado se passar como parâmetro corretamente.
     * @param proprietario Proprietario a ser adicionado na lista
     */
    public void addProprietario(Proprietario proprietario){
        this.proprietarios.add(proprietario);
        tamanhoListaProp++;
    }

    /**
     * Mostra a lista com todos os imoveis presentes nesta
     */
    public void mostrarListaImoveis(){
        System.out.println("Contém " + tamanhoListaImov + " imóveis na lista!");
        for(Imovel imovel : imoveis){   
            System.out.println(imovel.toString());
        }
    }

    /**
     * Mostra a lista com todos os proprietários presentes nesta
     */
    public void mostrarListaProprietarios(){
        System.out.println("Contém " + tamanhoListaProp + " proprietários na lista da imobiliária!");
        for(Proprietario proprietarios : proprietarios){   
            System.out.println(proprietarios.getNome());
        }
    }

   /**
    * Faz o cálculo da comissão recebida (12%) pela imobiliaria pelo valor do aluguel.
    * @param imovel Imovel que deseja saber a comissão recebida pela imobiliaria
    * @return A comissão, num float.
    */
    public float comissao(Imovel imovel){
        float total;
        total = (float) (imovel.aluguel() * 0.12);
        return total;
    }

    /**
     * Pega todos os imoveis da lista e confere qual foi o ganho total da imobiliaria pelas suas comissões.
     * @return Valor total recebido pelas comissões, num float.
     */
    public float ganhoTotalImobiliaria(){
        float total = 0;
        for (Imovel imovel : imoveis) {
           total += comissao(imovel);
        }
        return total;
    }

    /**
     * Faz o cálculo dos ganhos e mostra para o proprietário dos imoveis. Tanto o valor bruto quanto o valor líquido.
     * @param nome identificador do proprietário.
     * Retorna a mensagem. Formato:
     * Nome do proprietário: <nome>
     * Proprietário conta com <contImovel> imóveis
     * Valor Bruto arrecadado: R$ <valorBruto> 
     * Valor Líquido recebido: R$ <valorLiquido>
     * @return String no formato indicado.
     */public String valorArrecadadoProprietario(String nome){
        float valorBruto = 0, valorLiquido = 0;
        int contImovel = 0;
        for (Proprietario proprietarios : proprietarios) {
            if (nome == proprietarios.getNome()) {
                for (Imovel imovel : proprietarios.getImovel()) {
                    valorBruto += imovel.aluguel();
                    contImovel++;
                }
            }
        }
        valorLiquido = valorBruto - (valorBruto * 0.12f);
        
        return "Nome do Proprietário: " + nome + "\nProprietário conta com " + contImovel + " imóveis " + "\nValor Bruto arrecadado: R$" + valorBruto + "\nValor Líquido recebido: R$" + valorLiquido;
    }
    
}
