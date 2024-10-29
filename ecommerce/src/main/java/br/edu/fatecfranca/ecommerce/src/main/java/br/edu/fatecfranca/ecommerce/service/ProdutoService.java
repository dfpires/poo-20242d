package br.edu.fatecfranca.ecommerce.service;

import br.edu.fatecfranca.ecommerce.model.Produto;
import br.edu.fatecfranca.ecommerce.dto.ProdutoDTO;
import br.edu.fatecfranca.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    // injeção de dependência - não precisa instanciar objeto para chamar seus métodos
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public Produto salvar(ProdutoDTO produtoDTO){
        Produto produto = new Produto();
        produto.setNome(produtoDTO.getNome());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setPreco(produtoDTO.getPreco());
        produto.setUrl_imagem(produtoDTO.getUrl_imagem());
        return produtoRepository.save(produto);

    }

    public Produto remove(Long id){
        Optional<Produto> produto = produtoRepository.findById(id);
        if(produto.isPresent()){
            produtoRepository.delete(produto.get());
            return produto.get();
        }
        return null; // não encontrou produto para remover
    }
    public Produto atualizar(Long id, ProdutoDTO produtoDTO){
        Optional<Produto> produto = produtoRepository.findById(id);
        if(produto.isPresent()){
            produto.get().setNome(produtoDTO.getNome());
            produto.get().setDescricao(produtoDTO.getDescricao());
            produto.get().setPreco(produtoDTO.getPreco());
            produto.get().setUrl_imagem(produtoDTO.getUrl_imagem());
            return produtoRepository.save(produto.get()); // atualiza e não cria, pois produto tem ID
        }
        return null;
    }
}
