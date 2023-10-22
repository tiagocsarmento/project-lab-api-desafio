package tiago.projectlabAPIdesafio.service;

import org.springframework.stereotype.Service;
import tiago.projectlabAPIdesafio.model.Client;
import tiago.projectlabAPIdesafio.repository.ClientRepository;

import java.util.NoSuchElementException;


@Service
public class UserServiceImpl implements UserService{
    private final ClientRepository clientRepository;

    public UserServiceImpl (ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    @Override
    public Client findByiD(Long id) {
        return clientRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Client createClient(Client clientToCreate) {
        if (clientRepository.existsByName(clientToCreate.getName())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return clientRepository.save(clientToCreate);
    }
}
