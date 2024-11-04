package br.edu.fatecfranca.ecommerce.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PedidoDTO {
    private Long idCliente;
    private String status;
    private LocalDate data;
    private List<ItemPedidoDTO> itens;

}
