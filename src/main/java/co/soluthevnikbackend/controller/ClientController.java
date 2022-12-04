package co.soluthevnikbackend.controller;

import co.soluthevnikbackend.model.Client;
import co.soluthevnikbackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/findAll")
    public List<Client> findAll(){
        return clientService.findAll();
    }

}
