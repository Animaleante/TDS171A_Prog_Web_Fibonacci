package com.diogo.opet.fibonacci;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Classe que guardara as informacoes de uma sequencia
 * @author Diogo S. Moraes
 *
 */
public class FibonnacciInfo
{
    /**
     * Atributo para salvar a data que foi criada a sequencia
     */
    private Date data;
    /**
     * Atributo para salvar a lista de resultados da sequencia
     */
    private List<Integer> resultados;

    /**
     * Construtor da classe que recebe a lista de resultados, e cria a data usando o hoario atual
     * @param resultados
     */
    public FibonnacciInfo(List<Integer> resultados)
    {
        this.resultados = resultados;
        this.data = new Date();
    }

    /**
     * Metodo para imprimir a data e resultados da sequencia
     */
    public void print()
    {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(ft.format(this.data));
        for (int i = 0; i < resultados.size(); i++)
        {
            String spacing = "";
            for(int j = 0; j < i; j++ ) {
                spacing += "  ";
            }
            System.out.println(spacing+resultados.get(i));
        }
    }

    /**
     * @return the data
     */
    public Date getData()
    {
        return data;
    }
    /**
     * @param pData the data to set
     */
    public void setData(Date pData)
    {
        data = pData;
    }
    /**
     * @return the resultados
     */
    public List<Integer> getResultados()
    {
        return resultados;
    }
    /**
     * @param pResultados the resultados to set
     */
    public void setResultados(List<Integer> pResultados)
    {
        resultados = pResultados;
    }
}
