package br.edu.fatecfranca.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

// lombok - cria os construtores, getters e setter
@Data
// indica que a classe é uma entidade de banco de dados
@Entity
// indica que a classe é uma tabela chamada tb_pedido
@Table(name="tb_pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_cliente") // chave estrangeira/
    private Cliente cliente; // cliente que fez o pedido

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens;
}
