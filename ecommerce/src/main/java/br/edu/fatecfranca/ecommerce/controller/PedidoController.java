package br.edu.fatecfranca.ecommerce.controller;

import br.edu.fatecfranca.ecommerce.dto.PedidoDTO;
import br.edu.fatecfranca.ecommerce.model.Pedido;
import br.edu.fatecfranca.ecommerce.repository.PedidoRepository;
import br.edu.fatecfranca.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody PedidoDTO pedidoDTO){
        try {
            return new ResponseEntity<>(pedidoService.salva(pedidoDTO), HttpStatus.OK);
        }
        catch(IllegalArgumentException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
