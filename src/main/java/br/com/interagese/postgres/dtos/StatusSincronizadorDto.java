
package br.com.interagese.postgres.dtos;

import br.com.interagese.promocao.enuns.Envio;

public class StatusSincronizadorDto {
    
    private final boolean executando;
    private final Envio envio;

    public StatusSincronizadorDto(boolean executando, Envio envio) {
        this.executando = executando;
        this.envio = envio;
    }

    public boolean isExecutando() {
        return executando;
    }

    public Envio getEnvio() {
        return envio;
    }
    
    
    
}
