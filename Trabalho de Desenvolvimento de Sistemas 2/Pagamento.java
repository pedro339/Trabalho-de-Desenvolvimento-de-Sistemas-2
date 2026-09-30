import java.util.UUID;

public abstract class Pagamento {

    protected String idTransacao;
    protected double valor;
    protected String status;

    public Pagamento(double valor) {
        this.valor = valor;
        this.idTransacao = UUID.randomUUID().toString();
        this.status = "PENDENTE";
    }

    public void imprimirRecibo() {
        System.out.println("----- RECIBO -----");
        System.out.println("ID da Transacao: " + idTransacao);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("------------------");
    }

    public abstract boolean processar();
}