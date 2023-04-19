import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Beneficios b1 = new Beneficios("piscina", 300);
        Beneficios b2 = new Beneficios("area de lazer", 250);
        Beneficios b3 = new Beneficios("garagem dupla", 200);
        Beneficios b4 = new Beneficios("elevador", 150);


        List<Beneficios> beneficioCasa1 = new LinkedList<>();
        beneficioCasa1.add(b1);
        beneficioCasa1.add(b2);
        beneficioCasa1.add(b3);

        List<Beneficios> beneficioCasa2 = new LinkedList<>();
        beneficioCasa2.add(b4);


        Imobiliaria imb = new Imobiliaria();

        Proprietario proprietario1 = new Proprietario("Cadu");
        Proprietario proprietario2 = new Proprietario("João");
        Proprietario proprietario3 = new Proprietario("Mateus");
        Proprietario proprietario4 = new Proprietario("Larissa");
        Proprietario proprietario5 = new Proprietario("Ana");
    
        
        Imovel ap = new Apartamento(100000, "Rua dos bobos n° 1", 2023, beneficioCasa2 , 0);
        Imovel ap1 = new Apartamento(100000, "Rua dos bobos n° 1", 2023, beneficioCasa2 , 0);

        Imovel c = new Casa(100000, "Rua dos bobos n° 0", 2023, null, 1200);
        Imovel c1 = new Casa(100000, "Rua dos bobos n° 0", 2017, null, 1200);
        Imovel c2 = new Casa(100000, "Rua dos bobos n° 0", 2011, null, 1200);
        Imovel c3 = new Casa(100000, "Rua dos bobos n° 0", 2005, null, 1200);
        Imovel c4 = new Casa(100000, "Rua dos bobos n° 0", 2000, null, 1200);


        System.out.println(ap.aluguel());
        // System.out.println(c.aluguel());
        // System.out.println(c1.aluguel());
        // System.out.println(c2.aluguel());
        // System.out.println(c3.aluguel());
        // System.out.println(c4.aluguel());
         
        // imb.addProprietario(proprietario1);
        // imb.addProprietario(proprietario2);
        // imb.addProprietario(proprietario3);
        // imb.addProprietario(proprietario4);
        // imb.addProprietario(proprietario5);


        //  imb.mostrarListaProprietarios();
        // System.out.println("==========================================================");

        // proprietario1.addImovel(c);
        // proprietario1.addImovel(ap);
        // proprietario2.addImovel(ap1);


        // proprietario1.imoveisDeste();
        // System.out.println("==========================================================");
        // proprietario2.imoveisDeste();
        // System.out.println("==========================================================");

        // System.out.println(imb.valorArrecadadoProprietario("Cadu"));
        // System.out.println("==========================================================");
        // System.out.println(imb.valorArrecadadoProprietario("João"));
     }
}
