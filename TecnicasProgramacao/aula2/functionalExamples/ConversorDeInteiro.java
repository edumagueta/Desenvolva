package TecnicasProgramacao.aula2.functionalExamples;

import java.util.function.IntFunction;

public class ConversorDeInteiro implements IntFunction<String> {

    @Override
    public String apply(int value) {
        return "O número é: " + value;
    }

}
