package TecnicasProgramacao.aula3.filesExamples.service.impl;

import TecnicasProgramacao.aula3.filesExamples.model.Customer;
import TecnicasProgramacao.aula3.filesExamples.persistence.Reader;
import TecnicasProgramacao.aula3.filesExamples.persistence.SearchByName;
import TecnicasProgramacao.aula3.filesExamples.persistence.Writer;
import TecnicasProgramacao.aula3.filesExamples.service.RegisterCustomerUseCase;
import TecnicasProgramacao.aula3.filesExamples.service.SearchCustomerUseCase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CustomerService implements RegisterCustomerUseCase, SearchCustomerUseCase {

    private Writer<Customer> customerWriter;
    private Reader<Customer> customerReader;
    private SearchByName<Customer> searchByName;

    public CustomerService(Writer<Customer> customerWriter, Reader<Customer> customerReader, SearchByName<Customer> searchByName) {
        this.customerWriter = customerWriter;
        this.customerReader = customerReader;
        this.searchByName = searchByName;
    }

    @Override
    public void save(Customer customer) {
        if (customer == null) {
            throw new IllegalStateException("Customer não pode ser nulo");
        }
        customerWriter.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        if (id == null) {
            throw new IllegalStateException("Id não pode ser nulo");
        }
        return customerReader.read(id);
    }

    @Override
    public List<Customer> list() {
        return customerReader.read()
                .sorted(Comparator.comparing(Customer::getId))
                .toList();
    }

    @Override
    public List<Customer> searchByName(String name) {
        return searchByName.search(name)
                .sorted(Comparator.comparing(Customer::getName))
                .toList();
    }

}
