
package hotel.br.com.hotel.Model;
/*
 * @author CarlaRegina-Dev
 */
public class Reserva {
    private Quarto quarto;
    private String dataInicio;
    private String dataFim;
    private boolean status;
    private Pagamento pagamento;
    private Cliente cliente;
    
    public Reserva(Quarto quarto, String dataInicio, String dataFim, boolean status, Pagamento pagamento, Cliente cliente) {
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.pagamento = pagamento;
        this.cliente = cliente;
    }

    public Reserva() {
        
    }
        public Quarto getQuarto() {
            return quarto;
        }

        public void setQuarto(Quarto quarto) {
            this.quarto = quarto;
        }

        public String getDataInicio() {
            return dataInicio;
        }

        public void setDataInicio(String dataInicio) {
            this.dataInicio = dataInicio;
        }

        public String getDataFim() {
            return dataFim;
        }

        public void setDataFim(String dataFim) {
            this.dataFim = dataFim;
        }

        public boolean getStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public Pagamento getPagamento() {
            return pagamento;
        }

        public void setPagamento(Pagamento pagamento) {
            this.pagamento = pagamento;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }   
}
