package br.edu.fatecfranca.helloworld2.controller;

import br.edu.fatecfranca.helloworld2.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProdutoController {

    // simular um banco de dados contendo os produtos
    private static final Map<Long, Produto> produtos = new HashMap<>();
    static {
        produtos.put(1L, new Produto(1L, "Notebook", 3500));
        produtos.put(2L, new Produto(2L, "Celular", 2000));
        produtos.put(3L, new Produto(3L, "Tablet", 1500));
    }

    @GetMapping("/produtos/{id}")
    public Produto findById(@PathVariable Long id) {
        Produto produto =  produtos.get(id);
        if (produto != null) {
            return produto;
        }
        else {
            return new Produto(0L, "Produto não encontrado", 0);
        }
    }
    @GetMapping("/produtos")
    public Map<Long, Produto> findAll() {
        return produtos;
    }

    @PostMapping("/produtos")
    public Produto add(@RequestBody Produto produto) {
        produtos.put(produto.getId(), produto);
        return produto;
    }

    @DeleteMapping("/produtos/{id}")
    public String delete(@PathVariable Long id) {
        Produto produto = produtos.remove(id);
        if (produto != null) {
            return "Removido com sucesso";
        }
        else {
            return "Produto não foi encontrado";
        }
    }

    @PutMapping("/produtos/{id}")
    public String update(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produtoExistente = produtos.get(id);
        if (produtoExistente != null){
            produtoExistente.setNome(produto.getNome());
            produtoExistente.setPreco(produto.getPreco());
            produtos.put(id, produtoExistente);
            return "Produto atualizado com sucesso";
        }
        else {
            return "Produto não existe";
        }
    }
}
