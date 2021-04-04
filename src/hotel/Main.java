
package hotel;

import hotel.br.com.hotel.Controller.ClienteController;
import hotel.br.com.hotel.Controller.EnderecoController;
import hotel.br.com.hotel.Controller.TipoQuartoController;
import hotel.br.com.hotel.Controller.PagamentoController;
import hotel.br.com.hotel.Controller.QuartoController;
import hotel.br.com.hotel.Controller.ReservaController;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Endereco;
import hotel.br.com.hotel.Model.TipoQuarto;
import hotel.br.com.hotel.Model.Pagamento;
import hotel.br.com.hotel.Model.Quarto;
import hotel.br.com.hotel.Model.Reserva;


/*
 * @author CarlaRegina-Dev
 */
public class Main {

    public static void main(String[] args) {  
        
        EnderecoController enderecoController = new EnderecoController();
        Endereco endereco = new Endereco();
        endereco = enderecoController.salvarEndereco(41500701,"Vila Bosque Feliz",20,"","São Cristóvão","Salvador","Bahia","Brasil");
        
        ClienteController clienteController = new  ClienteController();
        Cliente cliente = new Cliente();
        cliente = clienteController.salvarCliente("Maria","632.617.070-20","yunjie4206@uorak.com",338462362,"24/09/1987",endereco);
        
        TipoQuartoController tipoQuartoController = new  TipoQuartoController();
        TipoQuarto tipoQuarto = new  TipoQuarto();
        tipoQuarto = tipoQuartoController.salvarTipoQuarto("Suite Presidencial");
         
        QuartoController quartoController = new QuartoController();
        Quarto quarto = new Quarto();
        quarto = quartoController.salvarQuarto(22,2, tipoQuarto);
        
        PagamentoController pagamentoController = new PagamentoController();
        Pagamento pagamento = new Pagamento();
        pagamento = pagamentoController.salvarPagamento("28/08/21",22.00f);
        
        ReservaController reservaController = new ReservaController();
        Reserva reserva = new Reserva();
        reserva = reservaController.salvarReserva(quarto,"10/08/21","28/08/21",true,pagamento,cliente);
    } 
}
