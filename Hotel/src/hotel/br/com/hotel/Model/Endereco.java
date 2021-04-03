
package hotel.br.com.hotel.Model;
/*
 * @author CarlaRegina-Dev
 */
public class Endereco {
    private int cep;
    private String rua;
    private int numeroCasa;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;  

    public Endereco(int cep, String rua, int numeroCasa, String complemento, String bairro, String cidade, String estado, String pais) {
        this.cep = cep;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }
    
        public int getCep() {
            return cep;
        }

        public void setCep(int cep) {
            this.cep = cep;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumeroCasa() {
            return numeroCasa;
        }

        public void setNumeroCasa(int numeroCasa) {
            this.numeroCasa = numeroCasa;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }
}
