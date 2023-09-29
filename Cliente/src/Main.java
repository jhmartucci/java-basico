import arquivos.Cliente;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("-------------- EXERCÍCIO MODULO 8 ----------------");
        System.out.println("--------------------------------------------------");
        System.out.println();

       Cliente cli1 = new Cliente("Mateus", "Celular", 1, 999.99);
       Cliente cli2 = new Cliente("Maria", "Mouse", 1, 11.90);
       Cliente cli3 = new Cliente("Cleusa", "Lápis", 1, 0.99);
       Cliente cli4 = new Cliente("Alencar", "TV", 1, 4389.49);
       Cliente cli5 = new Cliente("Beatriz", "Tenis Esportivo", 1, 438.99);
       Cliente cli6 = new Cliente("Alexandre", "Molinete", 2, 99.99);
       Cliente cli7 = new Cliente("Henrique", "Kit Teclado + Mouse", 1, 91.44);
       Cliente cli8 = new Cliente("Luiz", "Bala", 1, 0.10);
       Cliente cli9 = new Cliente("Eliseu", "Chaveiro Mercedes", 1, 5.99);
       Cliente cli10 = new Cliente("Camila", "Bicicleta", 1, 8999.99);



       List<Cliente> lista = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9,cli10);

        System.out.println("--------------- TODAS AS VENDAS ------------------");

       Stream<Cliente> stream = lista.stream().filter(cliente -> cliente.getValor() > 0);
       List<Cliente> todos = stream.collect(Collectors.toList());
       todos.forEach(i -> System.out.println(i.toString()));

        System.out.println();
       System.out.println("---------------- VENDA MENOR VALOR ---------------");

        Optional<Cliente> min = lista.stream().filter(cliente -> cliente.getValor() > 0).min(Comparator.comparingDouble(i-> i.getValor()));
        System.out.println(min);

       System.out.println();
       System.out.println("---------------- VENDA MAIOR VALOR ---------------");
        Optional<Cliente> max = lista.stream().filter(cliente -> cliente.getValor() > 0).max(Comparator.comparingDouble(i-> i.getValor()));
        System.out.println(max);

       System.out.println();

       System.out.println("---------------- VENDA MÉDIA VALOR ---------------");
       OptionalDouble media = lista.stream().filter(cliente -> cliente.getValor() > 0).mapToDouble(Cliente ::getValor).average();
        System.out.println(media);


    }


}
