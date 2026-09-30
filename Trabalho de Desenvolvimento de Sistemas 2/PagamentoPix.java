public class PagamentoPix extends Pagamento {

    private String ChavePix;

    public PagamentoPix(double valor, String ChavePix) {
        super(valor);
        this.ChavePix = ChavePix;
    }

    @Override
    public boolean processar() {
        System.out.println("Gerando QR Code para o PIX...");
        return true;
    }
}