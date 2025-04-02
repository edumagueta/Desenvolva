package TecnicasProgramacao.aula3.filesExamples.persistence;

import java.util.stream.Stream;

public interface SearchByName<T> {

    Stream<T> search(String name);

}
