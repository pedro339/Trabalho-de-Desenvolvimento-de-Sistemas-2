public class Main {

    public static void main(String[] args) {

        GatewayPagamento gateway = new GatewayPagamento();

        PagamentoPix pix = new PagamentoPix(
                159.50,
                "pedro@email.com"
        );

        PagamentoCartao cartao = new PagamentoCartao(
                6000.00,
                "1234567890",
                "Pedro Motta"
        );

        System.out.println("PAGAMENTO PIX");
        gateway.realizarCobranca(pix);

        System.out.println();

        System.out.println("PAGAMENTO CARTAO");
        gateway.realizarCobranca(cartao);
    }
}