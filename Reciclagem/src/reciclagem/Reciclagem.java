package reciclagem;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Reciclagem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDuplamenteEncadeada Residuos = new ListaDuplamenteEncadeada();
      

        int opcao = 0;

        do {
            String opcoes = JOptionPane.showInputDialog(null, "ESCOLHA UMA DAS OPÇÕES\n"
                    + "1 -  Registar Material Normal"
                    + "\n2 - Registar Material Especial"
                    + "\n3 - Mostrar a quantidade de Material"
                    + "\n4 - Excluir no Início"
                    + "\n5 - Excluir no Meio"
                    + "\n6 - Excluir no Final"
                    + "\n7 - Listar"
                    + "\n8 - Sair");
            opcao = Integer.parseInt(opcoes);
            System.out.println("Selecione umas das opções...");

            switch (opcao) {
                case 1: {

                    String tipoMaterial = JOptionPane.showInputDialog(null, "Introduza o Tipo de Material: ");
                    String origem_de_material = JOptionPane.showInputDialog(null, "Introduza a Origem do Material: ");
                    String nomeDepositario = JOptionPane.showInputDialog(null, "Introduza o nome do depositario: ");
                    String IdDepositario = JOptionPane.showInputDialog(null, "Introduza o ID do depositario: ");
                    String nomeFabrica = JOptionPane.showInputDialog(null, "Introduza o nome da Fabrica: ");
                    String localizacaoFabrica = JOptionPane.showInputDialog(null, "Introduza a localização da Fabrica: ");
                    String nomeOperador = JOptionPane.showInputDialog(null, "Introduza o nome do Operador: ");
                    String idOperador = JOptionPane.showInputDialog(null, "Introduza o ID do operador: ");

                    Depositario dep = new Depositario(nomeDepositario, IdDepositario);
                    Fabrica fabr = new Fabrica(nomeFabrica, localizacaoFabrica);
                    OperadorDeMaquina opr = new OperadorDeMaquina(nomeOperador, idOperador);

                    Material obj = new Material(tipoMaterial, origem_de_material, dep, fabr, opr);

                    Residuos.Inserir_no_inicio(obj);

                    JOptionPane.showMessageDialog(null, "O Material foi cadastrado com sucesso!");

                    break;
                }
                case 2: {

                    String tipoMaterial = JOptionPane.showInputDialog(null, "Introduza o Tipo de Material: ");
                    String origem_de_material = JOptionPane.showInputDialog(null, "Introduza a Origem do Material: ");
                    String nomeDepositario = JOptionPane.showInputDialog(null, "Introduza o nome do depositario: ");
                    String IdDepositario = JOptionPane.showInputDialog(null, "Introduza o ID do depositario: ");
                    String nomeFabrica = JOptionPane.showInputDialog(null, "Introduza o nome da Fabrica: ");
                    String localizacaoFabrica = JOptionPane.showInputDialog(null, "Introduza a localização da Fabrica: ");
                    String nomeOperador = JOptionPane.showInputDialog(null, "Introduza o nome do Operador: ");
                    String idOperador = JOptionPane.showInputDialog(null, "Introduza o ID do operador: ");

                    Depositario dep = new Depositario(nomeDepositario, IdDepositario);
                    Fabrica fabr = new Fabrica(nomeFabrica, localizacaoFabrica);
                    OperadorDeMaquina opr = new OperadorDeMaquina(nomeOperador, idOperador);

                    Material obj = new Material(tipoMaterial, origem_de_material, dep, fabr, opr);

                    Residuos.Inserir_no_inicio(obj);

                    JOptionPane.showMessageDialog(null, "O Material foi cadastrado com sucesso!");

                    break;
                }

                case 3: {
                    if (Residuos.tamanho == 0) {
                        JOptionPane.showMessageDialog(null, "A lista está vazia");
                    } else {
                        JOptionPane.showMessageDialog(null, "O total de Materiais é: " + Residuos.tamanho);
                    }
                    break;
                }

                case 4: {
                    
                   if(Residuos.tamanho ==0){
                       JOptionPane.showMessageDialog(null, "Impossível remover, a lista está vazia");
                   } else{
                         Residuos.Remover_no_principio();
                   }
                  

                    break;

                }

                case 5: {
                    int index;
                    String posicao;
                    posicao = JOptionPane.showInputDialog(null, "Introduza a posiçao que deseja eliminar");
                    index = Integer.parseInt(posicao);
                    Residuos.remove_na_posicao(index);
                    JOptionPane.showMessageDialog(null, "O Material foi removido!");

                    if (Residuos.tamanho == 0) {
                        JOptionPane.showMessageDialog(null, "O sua lista encontra-se vazia!");
                    }
                }

                case 6: {
                    if (Residuos.tamanho == 0) {
                        JOptionPane.showMessageDialog(null, "Impossível Remover, A lista encontra-se vazia!");
                    } else {
                        Residuos.Remover_no_ultimo();
                        JOptionPane.showMessageDialog(null, "A remoção no fim foi realizada com sucesso!");
                    }
                    break;
                }

                case 7: {
                    if (Residuos.tamanho == 0) {
                        JOptionPane.showMessageDialog(null, "A lista encontra-se vazia!");
                    } else {
                        JOptionPane.showMessageDialog(null, "A lista encontra-se vazia!" + Residuos.toString());
                    }
                    break;
                }

                case 8: {
                    System.exit(9);
                }

                default:
                    JOptionPane.showMessageDialog(null, "Volte Sempre!");
            }

        } while (opcao != 9);
    }
}
