package br.edu.fatecfranca.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb_cliente")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String username;
    private String email;
    private String senha;
}
