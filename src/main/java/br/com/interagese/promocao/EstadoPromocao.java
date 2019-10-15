package br.com.interagese.promocao;

public enum EstadoPromocao {

    PENDENTE("PENDIENTE", "P"),
    ACEITA("ACEPTADA", "A"),
    REJEITADA("RECHAZADA", "R");

    private final String valorScanntech;
    private final String valorInterage;

    private EstadoPromocao(String valorScanntech, String valorInterage) {
        this.valorScanntech = valorScanntech;
        this.valorInterage = valorInterage;
    }

    public String getValorInterage() {
        return valorInterage;
    }

    public String getValorScanntech() {
        return valorScanntech;
    }

}
