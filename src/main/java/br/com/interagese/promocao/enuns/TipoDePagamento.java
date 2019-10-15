package br.com.interagese.promocao.enuns;

public enum TipoDePagamento {

    DINHEIRO(9), CREDITO(10), CHEQUE(11), TICKET_ALIMENTACAO(12), DEBITO(13);
   
    private final int codigo;

    private TipoDePagamento(int codigo) {
        this.codigo = codigo;

    }

    public int getCodigo() {
        return codigo;
    }

}
