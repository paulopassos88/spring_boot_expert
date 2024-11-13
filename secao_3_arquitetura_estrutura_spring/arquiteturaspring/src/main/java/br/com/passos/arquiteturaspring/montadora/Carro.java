package br.com.passos.arquiteturaspring.montadora;

import lombok.*;
import java.awt.*;

@Getter
@Setter
@ToString
public class Carro {

    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor){
        this.motor = motor;
    }

    public CarroStatus darIgnicao(Chave chave) {
        if (chave.getMontadora() != this.montadora){
            return new CarroStatus("Nao possivel ligar o carro com essa chave");
        }

        return new CarroStatus("Carro ligado e rodando com o motor " +motor);
    }

}
