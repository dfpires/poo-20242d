package br.edu.fatecfranca.ecommerce.service;

import br.edu.fatecfranca.ecommerce.dto.ItemPedidoDTO;
import br.edu.fatecfranca.ecommerce.dto.PedidoDTO;
import br.edu.fatecfranca.ecommerce.model.Cliente;
import br.edu.fatecfranca.ecommerce.model.ItemPedido;
import br.edu.fatecfranca.ecommerce.model.Pedido;
import br.edu.fatecfranca.ecommerce.model.Produto;
import br.edu.fatecfranca.ecommerce.repository.ClienteRepository;
import br.edu.fatecfranca.ecommerce.repository.PedidoRepository;
import br.edu.fatecfranca.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Pedido> listaTodos(){
        return pedidoRepository.findAll();
    }
    public Optional<Pedido> buscaPorId(Long id){
        return pedidoRepository.findById(id);
    }
    public Pedido salva(PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido();
        // verifica se o usuário existe
        Cliente cliente = clienteRepository.findById(pedidoDTO.getIdCliente()).orElseThrow(
                () -> new IllegalArgumentException("Cliente não encontrado"));
        // define o id do cliente do pedido
        pedido.setCliente(cliente);
        // define o statis do pedido
        pedido.setStatus(pedidoDTO.getStatus());
        pedido.setData(pedidoDTO.getData());
        // salvar cada item do pedido
        for (ItemPedidoDTO itemPedidoDTO : pedidoDTO.getItens()) {
            // verifica se o produto existe
            Produto produto = produtoRepository.findById(itemPedidoDTO.getIdProduto()).orElseThrow(
                    () -> new IllegalArgumentException("Produto não encontrado"));
            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setProduto(produto);
            itemPedido.setQtde(itemPedidoDTO.getQtde());
            itemPedido.setPreco(itemPedidoDTO.getPreco());
            itemPedido.setPedido(pedido);
            // adiciona o itemPedido no vetor de Itens de pedido
            pedido.getItens().add(itemPedido);
        }
        return pedidoRepository.save(pedido);
    }

    public void excluir(Long id){
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
        }
        else {
            throw new IllegalArgumentException("Pedido não encontrado");
        }
    }
}
