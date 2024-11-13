package br.com.passos.arquiteturaspring.montadora;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chave {

    private Montadora montadora;
    private String tipo;

}
