package com.diogo.opet.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que executa o algoritmo do Fibonacci
 * @author Diogo S. Moraes
 *
 */
public class Fibonacci
{
    /**
     * Metodo estatico que calcula o Fibonacci
     * @param maxValue
     * @return
     */
    public static FibonnacciInfo run(int maxValue) {
        int proximo = 0;
        int atual = 0;
        int anterior = 1;

        List<Integer> resultados = new ArrayList<Integer>();

        while(atual <= maxValue) {
            proximo = atual + anterior;
            anterior = atual;

            resultados.add(atual);
            atual = proximo;

        }

        return new FibonnacciInfo(resultados);
    }
}
