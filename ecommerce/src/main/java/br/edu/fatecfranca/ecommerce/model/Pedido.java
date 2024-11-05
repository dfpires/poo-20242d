package br.edu.fatecfranca.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
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
    @JsonManagedReference  // Define o lado "pai" da relação
    private List<ItemPedido> itens = new ArrayList<>(); // inicializa a lista
}
