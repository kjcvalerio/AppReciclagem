
package reciclagem;

public class ListaDuplamenteEncadeada {
    Node primeiro;
    Node ultimo;
    int tamanho;

    public ListaDuplamenteEncadeada() {
        tamanho = 0;
    }

    public void Inserir_no_inicio(Material material) {
        Node node = new Node(material);
        node.material = material;
        node.anterior = null;
        node.proximo = primeiro;
        if (primeiro != null) {
            primeiro.anterior = node;
        }
        primeiro = node;
        if (tamanho == 0) {
            ultimo = primeiro;
        }
        tamanho++;
    }
    
     public Material Remover_no_principio() {
         
        Material material = this.primeiro.material;
        
        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.primeiro = this.primeiro.proximo;
            this.primeiro.anterior = null;
        }
        tamanho --;
        return material;
    }
     
  public Material Remover_no_meio(int pos) {
        
      if (pos < 0 || pos >= tamanho || primeiro == null) {
            return null;
        } else if (pos == 0) {
            return Remover_no_principio();
        } else if (pos == tamanho - 1) {
            return Remover_no_ultimo();
        }
        Node local = primeiro;
        for (int i = 0; i < tamanho; i++) {
            local = local.proximo;
        }
        if (local.anterior != null) {
            local.anterior.proximo = local.proximo;
        }
        if (local.proximo != null) {
            local.proximo.anterior = local.anterior;
        }
        tamanho--;
        return local.material;
    }
  
  public Material Remover_no_ultimo() {

        Material material = this.ultimo.material;

        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.ultimo = ultimo.proximo;
            ultimo.anterior = ultimo;
            this.ultimo = null;
        }
        tamanho -= 1;
        return material;
    }
  
   public Material remove_na_posicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException();
        }
        if (posicao == 0) {
            return Remover_no_principio();
        }
        if (posicao == tamanho - 1) {
            return Remover_no_ultimo();
        }
        Node auxiliar = this.primeiro;
        
        for (int i = 0; i < posicao; i++) {
            auxiliar = auxiliar.proximo;
            auxiliar.anterior.proximo = auxiliar.proximo;
            auxiliar.proximo.anterior = auxiliar.anterior;
        }
        tamanho -= 1;
        return auxiliar.material;
    }


     public String toString() {
        String str = "(" + "Tamanho da Lista: " + tamanho + "):    \n\n";
        Node local = primeiro;

        for (int i = 0; i < tamanho; i++) {
            str += " \n Tipo de material: " + local.material.getTipoDeMaterial() + "";
            str += " \n Origem: " + local.material.getOrigemDoMaterial() + "";
            str += "\n Dados do depositario: " + local.material.getDep().toString();
            str += "\n Dados da Fabrica: " + local.material.getFabr().toString();
            str += "\n Dados do Operador: " + local.material.getOpr().toString();
            local = local.proximo;
        }
        return str;
    }
     
      public boolean estaVazia(){
        return this.tamanho == 0;
    }
}
