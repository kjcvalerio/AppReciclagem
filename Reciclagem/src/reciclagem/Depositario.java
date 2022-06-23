
package reciclagem;

public class Depositario {
    private String nomeDoDepositario;
    private String idDoDepositario;
    
    public Depositario(String nomeDoDepositario, String idDoDepositario){
        setNomeDoDepositario(nomeDoDepositario);
        setIdDoDepositario(idDoDepositario);
    }

    public String getNomeDoDepositario() {
        return nomeDoDepositario;
    }

    public void setNomeDoDepositario(String nomeDoDepositario) {
        this.nomeDoDepositario = nomeDoDepositario;
    }

    public String getIdDoDepositario() {
        return idDoDepositario;
    }

    public void setIdDoDepositario(String idDoDepositario) {
        this.idDoDepositario = idDoDepositario;
    }

    @Override
    public String toString() {
        return "Depositario{" + "nomeDoDepositario=" + nomeDoDepositario + ", idDoDepositario=" + idDoDepositario + '}';
    }
    
    
}
