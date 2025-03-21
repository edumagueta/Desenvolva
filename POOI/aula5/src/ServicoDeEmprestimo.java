package POOI.aula5.src;

import java.time.LocalDateTime;

class ServicoDeEmprestimo {

    static final int TOLERANCIA_ENTREGA_EM_HORAS = 2;

    ReciboEmprestimo iniciarEmprestimo(Livro livro, Locador locador) {
        return ReciboEmprestimoFactory.criarRecibo(livro, locador);
    }

     ReciboDeDevolucao finalizarEmprestimo(ReciboEmprestimo reciboEmprestimo) {
         LocalDateTime dataHoraMaximaDeEntrega = LocalDateTime.now().plusHours(TOLERANCIA_ENTREGA_EM_HORAS);
         if(reciboEmprestimo.dataPrevistaDeDevolucao.isBefore(dataHoraMaximaDeEntrega)){
             return new ReciboDeDevolucao(reciboEmprestimo, LocalDateTime.now());
         } else {
             return new ReciboDeDevolucao(reciboEmprestimo, LocalDateTime.now(), "Entrega fora do prazo, passível de multa");
         }
    }
}