package tiago.projectlabAPIdesafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tiago.projectlabAPIdesafio.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
