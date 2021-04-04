
package hotel.br.com.hotel.Controller;

import hotel.br.com.hotel.Model.TipoQuarto;
/*
 * @author CarlaRegina-Dev
 */
public class TipoQuartoController {

    public TipoQuarto salvarTipoQuarto(String descricao) {
        TipoQuarto tipoQuarto = new TipoQuarto();
            tipoQuarto.setDescricao(descricao);
            
            return tipoQuarto;
    }
    
    
}
