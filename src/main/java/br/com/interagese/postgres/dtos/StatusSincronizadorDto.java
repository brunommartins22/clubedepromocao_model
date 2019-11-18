package br.com.interagese.postgres.dtos;

import br.com.interagese.promocao.enuns.Envio;

public class StatusSincronizadorDto {

    private final boolean executando;
    private final Envio envio;
    private final String log;

    public StatusSincronizadorDto(boolean executando, Envio envio,String log) {
        this.executando = executando;
        this.envio = envio;
        this.log=log;
    }

    public boolean isExecutando() {
        return executando;
    }

    public Envio getEnvio() {
        return envio;
    }

    public String getLog() {
        return log;
    }

  
}
