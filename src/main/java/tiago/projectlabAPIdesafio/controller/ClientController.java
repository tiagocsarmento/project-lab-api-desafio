package tiago.projectlabAPIdesafio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tiago.projectlabAPIdesafio.model.Client;
import tiago.projectlabAPIdesafio.service.UserService;

import java.net.URI;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final UserService userService;

    public ClientController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id){
        var client = userService.findByiD(id);
        return ResponseEntity.ok(client);
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client clientToCreate) {
        var clientCreated = userService.createClient(clientToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(clientCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(clientCreated);
    }
}
