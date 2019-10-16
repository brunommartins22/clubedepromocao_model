
package br.com.interagese.promocao.enuns;

public enum StatusEnvio {
    
    ENVIADO("E"), ERRO("R"), PENDENTE("P");
    
    private final String valor;

    private StatusEnvio(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
}
