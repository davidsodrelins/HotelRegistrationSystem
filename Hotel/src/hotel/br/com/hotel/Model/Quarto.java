
package hotel.br.com.hotel.Model;
/*
 * @author CarlaRegina-Dev
 */
public class Quarto {
    private int numeroQuarto;
    private int andarQuarto;
    private TipoQuarto tipoQuarto;

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

        public void setNumeroQuarto(int numeroQuarto) {
            this.numeroQuarto = numeroQuarto;
        }

        public int getAndarQuarto() {
            return andarQuarto;
        }

        public void setAndarQuarto(int andarQuarto) {
            this.andarQuarto = andarQuarto;
        }

        public TipoQuarto getTipoQuarto() {
            return tipoQuarto;
        }

        public void setTipoQuarto(TipoQuarto tipoQuarto) {
            this.tipoQuarto = tipoQuarto;
        }


        public Quarto(int numeroQuarto, int andarQuarto, TipoQuarto tipoQuarto) {
            this.numeroQuarto = numeroQuarto;
            this.andarQuarto = andarQuarto;
            this.tipoQuarto = tipoQuarto;
        }
}
