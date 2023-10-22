package tiago.projectlabAPIdesafio.service;

import tiago.projectlabAPIdesafio.model.Client;

public interface UserService {
    Client findByiD(Long id);

    Client createClient(Client clientToCreate);

}
