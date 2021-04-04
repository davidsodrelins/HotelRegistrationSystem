
package hotel.br.com.hotel.Model;
/*
 * @author CarlaRegina-Dev
 */
public class Pagamento {
    private String dataPagamento;
    private double valorPagamento;

    public Pagamento(String dataPagamento, double valorPagamento) {
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }

    public Pagamento() {
        
    }

        public String getDataPagamento() {
            return dataPagamento;
        }

        public void setDataPagamento(String dataPagamento) {
            this.dataPagamento = dataPagamento;
        }

        public double getValorPagamento() {
            return valorPagamento;
        }

        public void setValorPagamento(double valorPagamento) {
            this.valorPagamento = valorPagamento;
        }
}
