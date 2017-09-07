package com.diogo.opet.fibonacci;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diogo S. Moraes
 *
 */
public class FibonnacciInfo
{
    /**
     *
     */
    private Date data;
    /**
     *
     */
    private List<Integer> resultados;

    /**
     *
     * @param resultados
     */
    public FibonnacciInfo(List<Integer> resultados)
    {
        this.resultados = resultados;
        this.data = new Date();
    }

    /**
     *
     */
    public void print()
    {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(ft.format(this.data));
        for (int i = 0; i < resultados.size(); i++)
        {
            System.out.println("\t"+resultados.get(i));
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
