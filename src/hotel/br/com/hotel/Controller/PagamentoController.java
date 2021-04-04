
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Pagamento;

/*
 * @author CarlaRegina-Dev
 */
public class PagamentoController {
    
    public Pagamento salvarPagamento(int dataPagamento, double valorPagamento){
        Pagamento pagamento = new Pagamento();
            pagamento.setDataPagamento(dataPagamento);
            pagamento.setValorPagamento(valorPagamento);
            
            return pagamento;
    }
}
