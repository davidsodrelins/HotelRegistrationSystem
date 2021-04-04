
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Endereco;
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

            return endereco;
    }
}
