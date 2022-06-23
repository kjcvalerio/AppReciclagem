package reciclagem;

public class OperadorDeMaquina {

    private String nomeDoOperador;
    private String idDoOperador;

    public OperadorDeMaquina(String nomeDoOperador, String idDoOperador){
        setNomeDoOperador(nomeDoOperador);
        setIdDoOperador(idDoOperador);
    }
    
    public String getNomeDoOperador() {
        return nomeDoOperador;
    }

    public void setNomeDoOperador(String nomeDoOperador) {
        this.nomeDoOperador = nomeDoOperador;
    }

    public String getIdDoOperador() {
        return idDoOperador;
    }

    public void setIdDoOperador(String idDoOperador) {
        this.idDoOperador = idDoOperador;
    }

    @Override
    public String toString() {
        return "OperadorDeMaquina{" + "nomeDoOperador=" + nomeDoOperador + ", idDoOperador=" + idDoOperador + '}';
    }

}
