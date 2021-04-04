
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Pagamento;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @author CarlaRegina-Dev
 */
public class PagamentoController {
    
    public Pagamento salvarPagamento(String dataPagamento, double valorPagamento){
        Pagamento pagamento = new Pagamento();
            pagamento.setDataPagamento(dataPagamento);
            pagamento.setValorPagamento(valorPagamento);
            
            salvarTxt(pagamento);
            return pagamento;
    }
    
    private void salvarTxt(Pagamento pagamento){
        try {
            FileWriter fw = new FileWriter ("Pagamento.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Data do pagamento: "+pagamento.getDataPagamento());
            pw.println("Valor: "+pagamento.getValorPagamento());
            pw.flush();
            pw.close();
            fw.close(); 
        }
        catch (IOException e) {
           System.out.println(e);
        }
    }
}
