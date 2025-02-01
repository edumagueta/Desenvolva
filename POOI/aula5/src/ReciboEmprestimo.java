package POOI.aula5.src;

import java.time.LocalDateTime;

class ReciboEmprestimo {

    ReciboEmprestimo(Livro livro, Locador locador) {
        this.livro = livro;
        this.locador = locador;
    }

    LocalDateTime dataDeInicio;
    Livro livro;
    Locador locador;
    LocalDateTime dataPrevistaDeDevolucao;
}
