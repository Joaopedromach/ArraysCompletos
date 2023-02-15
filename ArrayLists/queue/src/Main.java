import estudo.anjinho.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queuCarros = new LinkedList<>();

        queuCarros.add(new Carro("Ford"));
        queuCarros.add(new Carro("Chevrolet"));
        queuCarros.add(new Carro("fiat"));

        System.out.println(queuCarros.add(new Carro("Peugeot")));

        //o offer e quase a mesma coisa que o add mas em vez do codigo dar erro ele retorna falso

        System.out.println(queuCarros);
        System.out.println(queuCarros.offer(new Carro("Renault")));

        System.out.println(queuCarros);

        //o peek pega o primeiro da lista
        System.out.println(queuCarros.peek());

        System.out.println(queuCarros);
        //o poll remove da lista
        System.out.println(queuCarros.poll());

        System.out.println(queuCarros);

        //o isEmpty diz que a minha fila nao esta vazia
        System.out.println(queuCarros.isEmpty());
        System.out.println(queuCarros);

        // o mais usado pelos programadores para saber quantos ainda estao na fila

        System.out.println(queuCarros.size());
        




    }
}