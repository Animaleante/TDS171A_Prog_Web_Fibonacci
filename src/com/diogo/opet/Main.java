package com.diogo.opet;

import java.util.ArrayList;
import java.util.List;

import com.diogo.opet.fibonacci.Fibonacci;
import com.diogo.opet.fibonacci.FibonnacciInfo;
import com.diogo.opet.utils.Leitor;

/**
 * Classe que exibe o menu, e executa as acoes do programa
 * @author Diogo S. Moraes
 *
 */
public class Main
{
    /**
     * Atributo que guarda a lista de objetos que contem as sequencias
     */
    List<FibonnacciInfo> lista;

    /**
     * Método ponto de entrada do programa
     * @param args
     */
    public static void main(String[] args)
    {
        new Main();
    }

    /**
     * Construtor da classe Main
     */
    public Main()
    {
        lista = new ArrayList<FibonnacciInfo>();

        int op = -1;
        while(op != 4) {
            op = menu();
        }
    }

    /**
     * Metodo que escreve o menu, pega a opção do usuario e executa a acao correspondente
     * @return
     */
    public int menu() {
        System.out.println(" --- MENU ---");
        System.out.println("1 - Nova sequencia");
        System.out.println("2 - Listar sequencias");
        System.out.println("3 - Limpar sequencias");
        System.out.println("4 - Sair");

        int op = Leitor.readInt("Entre com a opção desejada: ");
        switch(op) {
            case 1:
                novaSequencia();
                break;
            case 2:
                listarSequencias();
                break;
            case 3:
                limparSequencias();
                break;
            case 4:
                break;
            default:
                System.out.println("Opção invalida");
        }

        return op;
    }

    /**
     * Metodo que pega um valor maximo, e executa o algoritomo de Fibonacci caso seja possivel
     */
    private void novaSequencia()
    {
        int val = Leitor.readInt("Entre com o valor máximo da sequencia: ");
        if(val <= 0) {
            System.out.println("Valor invalido inserido");
            return;
        }
        FibonnacciInfo fi = Fibonacci.run(val);
        lista.add(fi);
    }

    /**
     * Metodo que imprime as sequencias ja feitas
     */
    private void listarSequencias()
    {
        if(lista.size() == 0) {
            System.out.println("Não existem sequencias registradas.");
        } else {
            for (int i = 0; i < lista.size(); i++)
            {
                lista.get(i).print();
            }
        }
    }

    /**
     * Metodo que limpa a lista de sequencias salvas
     */
    private void limparSequencias()
    {
        lista = new ArrayList<FibonnacciInfo>();
    }
}