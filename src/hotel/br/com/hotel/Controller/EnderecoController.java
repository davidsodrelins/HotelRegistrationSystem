
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Endereco;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
 * @author CarlaRegina-Dev
 */
public class EnderecoController {
    
    public Endereco salvarEndereco(int cep, String rua, int numeroCasa, String complemento, String bairro, String cidade, String estado, String pais){
        Endereco endereco = new Endereco();
            endereco.setCep(cep);
            endereco.setRua(rua);
            endereco.setNumeroCasa(numeroCasa);
            endereco.setComplemento(complemento);
            endereco.setBairro(bairro);
            endereco.setCidade(cidade);
            endereco.setEstado(estado);
            endereco.setPais(pais);
            
            salvarTxt(endereco);
            return endereco;
    }
    private void salvarTxt(Endereco endereco){
        try {
           FileWriter fw = new FileWriter ("Endereco.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("CEP: "+endereco.getCep());
            pw.println("Rua: "+endereco.getRua());
            pw.println("Número da Casa: "+endereco.getNumeroCasa());
            pw.println("Complemento: "+endereco.getComplemento());
            pw.println("Bairro: "+endereco.getBairro());
            pw.println("Cidade: "+endereco.getCidade());
            pw.println("Estado: "+endereco.getEstado());
            pw.println("País: "+endereco.getPais());
            
            pw.flush();
            pw.close();
            fw.close(); 
        }
        catch (IOException e) {
           System.out.println(e);
        }
    }
}
