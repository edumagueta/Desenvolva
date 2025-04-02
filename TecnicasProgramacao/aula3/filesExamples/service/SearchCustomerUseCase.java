package TecnicasProgramacao.aula3.filesExamples.service;

import TecnicasProgramacao.aula3.filesExamples.model.Customer;

import java.util.List;
import java.util.Optional;

public interface SearchCustomerUseCase {

    Optional<Customer> findById(Long id);

    List<Customer> list();

    List<Customer> searchByName(String name);

}
