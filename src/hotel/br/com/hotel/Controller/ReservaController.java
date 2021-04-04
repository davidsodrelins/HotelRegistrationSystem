
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Pagamento;
import hotel.br.com.hotel.Model.Quarto;
import hotel.br.com.hotel.Model.Reserva;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @author CarlaRegina-Dev
 */
public class ReservaController {
    
    public Reserva salvarReserva(Quarto quarto, String dataInicio, String dataFim, boolean status, Pagamento pagamento, Cliente cliente){
        Reserva reserva = new Reserva();
            reserva.setQuarto(quarto);
            reserva.setDataInicio(dataInicio);
            reserva.setDataFim(dataFim);
            reserva.setStatus(status);
            reserva.setPagamento(pagamento);
            reserva.setCliente(cliente);
            
            salvarTxt(reserva);
            return reserva;
    }
    
    private void salvarTxt(Reserva reserva){
        try {
            FileWriter fw = new FileWriter ("Reserva.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Checkin: "+reserva.getDataInicio());
            pw.println("Chekout: "+reserva.getDataFim());
             pw.println("Status: "+reserva.getStatus());
            
            pw.flush();
            pw.close();
            fw.close(); 
        }
        catch (IOException e) {
           System.out.println(e);
        }
    }
}
