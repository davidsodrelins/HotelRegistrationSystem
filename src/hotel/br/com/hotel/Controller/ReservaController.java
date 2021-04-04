
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Pagamento;
import hotel.br.com.hotel.Model.Quarto;
import hotel.br.com.hotel.Model.Reserva;

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
        
            return reserva;
    }
}
