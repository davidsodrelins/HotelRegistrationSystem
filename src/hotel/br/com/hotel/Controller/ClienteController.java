
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Endereco;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @author CarlaRegina-Dev
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

            salvarTxt(cliente);
            return cliente;        
    }
    private void salvarTxt(Cliente cliente){
        try {
            FileWriter fw = new FileWriter ("Cliente.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: "+cliente.getNomeCliente());
            pw.println("CPF: "+cliente.getCpfCliente());
            pw.println("Email: "+cliente.getEmailCliente());
            pw.println("Telefone: "+cliente.getTelefone());
            pw.println("Data de Nascimento: "+cliente.getDataNascimento());
            
            pw.flush();
            pw.close();
            fw.close(); 
        }
        catch (IOException e) {
           System.out.println(e);
        }
    }
}
   

