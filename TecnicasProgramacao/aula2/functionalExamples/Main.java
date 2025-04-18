package TecnicasProgramacao.aula2.functionalExamples;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        for (int index = 1; index < 101; index++) {
//            if (index % 2 == 0) {
//                System.out.println("O número é " + index);
//            }
//        }

        // [tipo] [nome] [atribuição de valor]
//        String name = "William";

//        IntFunction<String> converter = new ConversorDeInteiro();
//        System.out.println(converter.apply(5));
//
//        IntFunction<String> converter2 = new IntFunction<String>() {
//            // Implementação anonima
//            @Override
//            public String apply(int numero) {
//                return "O numero é: " + numero;
//            }
//        };
//        System.out.println(converter2.apply(5));

        // [tipo]           [nome]       [atribução de valor]
        // função = [(variaveis) -> código executável]
        IntFunction<String> converter3 = (numero) -> "O numero é: " + numero;
        System.out.println(converter3.apply(5));

        IntPredicate par = numero -> numero % 2 == 0;

        IntStream.range(1, 101)
                .filter(par)
                .mapToObj(converter3)
                .forEach(System.out::println);

        // Dado que possuo um BigDecimal implemente a conversão para string.
        // Deve ser utilizado a interface Function
        Function<BigDecimal, String> bigDecimalConverter = (numero) -> numero.toString();
        var bigDecimal = BigDecimal.TEN;
        var text = bigDecimalConverter.apply(bigDecimal);
        System.out.println(text);

        // Dado que possuo uma string que representa a data no formato dd/MM/yy
        // escreva um conversor para o tipo LocalDate
        // Deve ser utilizado a interface Function
        // Function -> conversões
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        Function<String, LocalDate> dateConverter = (dateAsString) -> LocalDate.parse(dateAsString, dateFormatter);
        var date = dateConverter.apply("14/03/25");
        System.out.println(date);

        // Predicate -> filtros (o retorno é um boolean que informa se a expressão foi atendida)
        Predicate<String> nomesCom4Caracteres = (nome) -> nome.length() == 4;
        var tem4caracteres = nomesCom4Caracteres.test("William");
        System.out.println(tem4caracteres);

        // Consumer -> recebe uma info e trabalha com ela
        Consumer<String> imprimeNome = (nome) -> System.out.println(nome);
        imprimeNome.accept("William César dos Santos");

        // Supplier -> fornece um dado para a aplicação
        Supplier<String> meuNome = () -> "William César dos Santos";
        System.out.println(meuNome.get());
    }
}