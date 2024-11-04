package br.edu.fatecfranca.ecommerce.dto;

import lombok.Data;

@Data
public class ItemPedidoDTO {

    private Long idProduto;
    private Integer qtde;
    private Float preco;
}
