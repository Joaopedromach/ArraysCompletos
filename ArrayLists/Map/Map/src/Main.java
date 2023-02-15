import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<String,String> aluno = new HashMap<>();

        aluno.put("Nome","Joao");
        aluno.put("Idade","17");
        aluno.put("Media","8,5");

        System.out.println(aluno);

        //keyset retorna todas as classes
        System.out.println(aluno.keySet());

        //values retorna todos os valores

        System.out.println(aluno.values());

        List <Map> listaAlunos = new ArrayList<>();



        Map<String,String> aluno2 = new HashMap<>();

        aluno2.put("Nome","Maria");
        aluno2.put("Idade","18");
        aluno2.put("Media","9,5");
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));

    }


}