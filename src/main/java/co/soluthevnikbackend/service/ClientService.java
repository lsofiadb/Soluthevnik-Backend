package co.soluthevnikbackend.service;

import co.soluthevnikbackend.model.Client;
import co.soluthevnikbackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client findById(Long id){
        return clientRepository.findById(id).get();
    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

}
