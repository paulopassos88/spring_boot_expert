package br.com.passos.arquiteturaspring.montadora.config;

import br.com.passos.arquiteturaspring.montadora.Motor;
import br.com.passos.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfig {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(200);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(3.0);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    @Primary
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(400);
        motor.setCilindros(null);
        motor.setModelo("XPTO-03");
        motor.setLitragem(null);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

}
