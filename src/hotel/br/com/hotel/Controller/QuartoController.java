
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Cliente;
import hotel.br.com.hotel.Model.Quarto;
import hotel.br.com.hotel.Model.TipoQuarto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @author CarlaRegina-Dev
 */
public class QuartoController {
    
    public Quarto salvarQuarto(int numeroQuarto, int andarQuarto, TipoQuarto tipoQuarto){
        Quarto quarto = new Quarto();
            quarto.setNumeroQuarto(numeroQuarto);
            quarto.setAndarQuarto(andarQuarto);
            quarto.setTipoQuarto(tipoQuarto);
            
            salvarTxt(quarto);
            return quarto;
    }
    
    private void salvarTxt(Quarto quarto){
        try {
            FileWriter fw = new FileWriter ("Quarto.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Número do quarto: "+quarto.getNumeroQuarto());
            pw.println("Andar: "+quarto.getAndarQuarto());
            
            pw.flush();
            pw.close();
            fw.close(); 
        }
        catch (IOException e) {
           System.out.println(e);
        }
    }
}