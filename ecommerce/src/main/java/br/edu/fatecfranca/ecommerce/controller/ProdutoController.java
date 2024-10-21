
package br.edu.fatecfranca.ecommerce.controller;


import br.edu.fatecfranca.ecommerce.dto.ProdutoDTO;
import br.edu.fatecfranca.ecommerce.model.Produto;
import br.edu.fatecfranca.ecommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos(){
        return new ResponseEntity<>(produtoService.listarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id){
        Optional produto = produtoService.buscarPorId(id);
        if(produto.isPresent()){
            return new ResponseEntity<>(produto.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Produto não encontrado", HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody ProdutoDTO produtoDTO){
        return new ResponseEntity<>(produtoService.salvar(produtoDTO), HttpStatus.CREATED);
    }

}
