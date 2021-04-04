
package hotel.br.com.hotel.Model;
/*
 * @author CarlaRegina-Dev
 */
public class Pagamento {
    private int dataPagamento;
    private double valorPagamento;

    public Pagamento(int dataPagamento, double valorPagamento) {
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
    }

    public Pagamento() {
        
    }

        public int getDataPagamento() {
            return dataPagamento;
        }

        public void setDataPagamento(int dataPagamento) {
            this.dataPagamento = dataPagamento;
        }

        public double getValorPagamento() {
            return valorPagamento;
        }

        public void setValorPagamento(double valorPagamento) {
            this.valorPagamento = valorPagamento;
        }
}
