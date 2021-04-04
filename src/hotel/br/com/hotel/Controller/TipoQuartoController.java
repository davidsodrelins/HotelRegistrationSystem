
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.TipoQuarto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



/*
 * @author CarlaRegina-Dev
 */
public class TipoQuartoController {

    public TipoQuarto salvarTipoQuarto(String descricao) {
        TipoQuarto tipoQuarto = new TipoQuarto();
            tipoQuarto.setDescricao(descricao);
            
            salvarTxt(tipoQuarto);
            return tipoQuarto;
    }
    private void salvarTxt(TipoQuarto tipoQuarto){
        try {
            FileWriter fw = new FileWriter ("TipoQuarto.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Descrição: "+tipoQuarto.getDescricao());
            pw.flush();
            pw.close();
            fw.close(); 
        }
        catch (IOException e) {
           System.out.println(e);
        }
    }
    
}
