package br.edu.fatecfranca.ecommerce.controller;

import br.edu.fatecfranca.ecommerce.model.Pedido;
import br.edu.fatecfranca.ecommerce.repository.PedidoRepository;
import br.edu.fatecfranca.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> listarTodos(){
        return new ResponseEntity<>(pedidoService.listaTodos(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id){
        Optional<Pedido> pedido = pedidoService.buscaPorId(id);
        if (pedido.isPresent()){
            return new ResponseEntity<>(pedido.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
