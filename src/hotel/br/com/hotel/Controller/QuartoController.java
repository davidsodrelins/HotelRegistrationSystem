
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.Quarto;
import hotel.br.com.hotel.Model.TipoQuarto;

/*
 * @author CarlaRegina-Dev
 */
public class QuartoController {
    
    public Quarto salvarQuarto(int numeroQuarto, int andarQuarto, TipoQuarto tipoQuarto){
        Quarto quarto = new Quarto();
            quarto.setNumeroQuarto(numeroQuarto);
            quarto.setAndarQuarto(andarQuarto);
            quarto.setTipoQuarto(tipoQuarto);
        
            return quarto;
    }
}