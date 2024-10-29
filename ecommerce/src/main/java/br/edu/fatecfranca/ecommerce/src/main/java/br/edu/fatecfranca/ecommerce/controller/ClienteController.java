package br.edu.fatecfranca.ecommerce.controller;
import br.edu.fatecfranca.ecommerce.dto.ClienteDTO;
import br.edu.fatecfranca.ecommerce.dto.ProdutoDTO;
import br.edu.fatecfranca.ecommerce.model.Cliente;
import br.edu.fatecfranca.ecommerce.model.Produto;
import br.edu.fatecfranca.ecommerce.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos(){
        return new ResponseEntity<>(clienteService.listarTodos(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id){
        Optional cliente = clienteService.buscarPorId(id);
        if(cliente.isPresent()){
            return new ResponseEntity<>(cliente.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Cliente não encontrado", HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody ClienteDTO clienteDTO){
        return new ResponseEntity<>(clienteService.salvar(clienteDTO), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id){
        Cliente aux = clienteService.remove(id);
        if ( aux != null) {
            return new ResponseEntity<>(aux, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Cliente não encontrado", HttpStatus.NOT_FOUND);
        }
    }
    @PatchMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO){
        Cliente aux = clienteService.atualizar(id, clienteDTO);
        if ( aux != null) {
            return new ResponseEntity<>(aux, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Cliente não encontrado", HttpStatus.NOT_FOUND);
        }
    }
}
