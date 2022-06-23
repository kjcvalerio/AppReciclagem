
package reciclagem;

public class Material {

    private String tipoDeMaterial;
    private String origemDoMaterial;
    private Depositario dep;
    private Fabrica fabr;
    private OperadorDeMaquina opr;

    public OperadorDeMaquina getOpr() {
        return opr;
    }

    public void setOpr(OperadorDeMaquina opr) {
        this.opr = opr;
    }

    @Override
    public String toString() {
        return  "Tipo de Material: " + tipoDeMaterial + " "
                + "\n Origem do Material: " + origemDoMaterial + 
                ", dep=" + dep + ", fabr=" + fabr + ", opr=" + opr + '}';
    }

    

    public Fabrica getFabr() {
        return fabr;
    }

    public void setFabr(Fabrica fabr) {
        this.fabr = fabr;
    }
    

    
    public Material(String tipoDeMaterial, String origemDoMaterial, Depositario dep,Fabrica fabr, OperadorDeMaquina opr ){
        setTipoDeMaterial( tipoDeMaterial);
        setOrigemDoMaterial( origemDoMaterial);
        setDep( dep);
        setFabr(fabr);
        setOpr(opr);
}

    public String getTipoDeMaterial() {
        return tipoDeMaterial;
    }

    public void setTipoDeMaterial(String tipoDeMaterial) {
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public String getOrigemDoMaterial() {
        return origemDoMaterial;
    }

    public void setOrigemDoMaterial(String origemDoMaterial) {
        this.origemDoMaterial = origemDoMaterial;
    }

    public Depositario getDep() {
        return dep;
    }

    public void setDep(Depositario dep) {
        this.dep = dep;
    }

   

    
    
    
    
  
}
