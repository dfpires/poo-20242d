package br.edu.fatecfranca.ecommerce.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    private String username;
    private String email;
    private String senha;
}
