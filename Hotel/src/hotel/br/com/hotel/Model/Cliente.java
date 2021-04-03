
package hotel.br.com.hotel.Model;
/*
 * @author CarlaRegina-Dev
 */
public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private String emailCliente;
    private int telefone;
    private String dataNascimento;  
    private Endereco endereco;

    public Cliente(String nomeCliente, String cpfCliente, String emailCliente, int telefone, String dataNascimento, Endereco endereco) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
    
        public String getNomeCliente() {
            return nomeCliente;
        }

        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        public String getCpfCliente() {
            return cpfCliente;
        }

        public void setCpfCliente(String cpfCliente) {
            this.cpfCliente = cpfCliente;
        }

        public String getEmailCliente() {
            return emailCliente;
        }

        public void setEmailCliente(String emailCliente) {
            this.emailCliente = emailCliente;
        }

        public int getTelefone() {
            return telefone;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        public String getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
}
