import estudo.anjinho.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Carro> listacarros = new ArrayList<>();

        listacarros.add(new Carro("Ford"));
        listacarros.add(new Carro("Chevrolet"));
        listacarros.add(new Carro("Fiat"));
        listacarros.add(new Carro("Toyota"));

        System.out.println(listacarros.contains(new Carro("Ford")));

        System.out.println(listacarros.get(2));

        System.out.println(listacarros.indexOf(new Carro("Fiat")));

        System.out.println(listacarros.remove(2));


        System.out.println(listacarros);





    }
}