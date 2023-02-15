import estudo.anjinho.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Toyota"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Zino"));
        hashSetCarros.add(new Carro("Aalio"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros= new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Toyota"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Zino"));
        treeSetCarros.add(new Carro("Aalio"));

        System.out.println(treeSetCarros);


    }
}