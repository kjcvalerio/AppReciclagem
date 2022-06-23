
package reciclagem;

public class Fabrica {
    
    String nomeDaFabrica;
    String localDaFabrica;
    
     public Fabrica(String nomeDaFabrica, String localDaFabrica){
        setNomeDaFabrica(nomeDaFabrica);
        setLocalDaFabrica(localDaFabrica);
    }

    @Override
    public String toString() {
        return "Fabrica{" + "nomeDaFabrica=" + nomeDaFabrica + ", localDaFabrica=" + localDaFabrica + '}';
    }

    public String getNomeDaFabrica() {
        return nomeDaFabrica;
    }

    public void setNomeDaFabrica(String nomeDaFabrica) {
        this.nomeDaFabrica = nomeDaFabrica;
    }

    public String getLocalDaFabrica() {
        return localDaFabrica;
    }

    public void setLocalDaFabrica(String localDaFabrica) {
        this.localDaFabrica = localDaFabrica;
    }


   
    
}
