package br.edu.fatecfranca.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tb_item_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float preco;
    private Integer qtde;
    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name="id_pedido")
    @JsonBackReference  // Define o lado "filho" da relação
    private Pedido pedido;
}
