package br.com.passos.arquiteturaspring.montadora;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Motor {

    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double preco;
    private Double litragem;
    private TipoMotor tipoMotor;

}
