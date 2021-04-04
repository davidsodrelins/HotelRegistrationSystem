
package hotel.br.com.hotel.Model;
/*
 * @author CarlaRegina-Dev
 */
public class TipoQuarto {
     private String descricao;
     
     public TipoQuarto(String descricao) {
        this.descricao = descricao;
    }

    public TipoQuarto() {
        
    }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }    
}
