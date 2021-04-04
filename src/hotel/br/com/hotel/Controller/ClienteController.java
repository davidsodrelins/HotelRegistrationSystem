
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Endereco;

/*
 * @author carla
 */
public class ClienteController {
    
    public Cliente salvarCliente(String nomeCliente, String cpfCliente, String emailCliente, int telefone, String dataNascimento, Endereco endereco){
        Cliente cliente = new Cliente();
            cliente.setNomeCliente(nomeCliente);
            cliente.setCpfCliente(cpfCliente);
            cliente.setEmailCliente(emailCliente);
            cliente.setTelefone(telefone);
            cliente.setDataNascimento(dataNascimento);
            cliente.setEndereco(endereco);

            return cliente;
    }
}
