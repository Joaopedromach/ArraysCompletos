import estudo.anjinho.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listacarros = new ArrayList<>();

        listacarros.add(new Carro("Toyota"));
        listacarros.add(new Carro("Chevrolet"));
        listacarros.add(new Carro("Ford"));

        System.out.println(listacarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 =new Carro("Ford");
        Carro carro2 =new Carro("chevrolet");

        System.out.println(carro1.equals(carro2));



    }
}