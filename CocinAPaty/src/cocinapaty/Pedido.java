/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinapaty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Jorge
 */
public class Pedido 
{
    String ruta1="Archivos/Pedido.txt";
    String[][] pedidos;
    BufferedReader pedido;
    Pedido()
    {
        pedidos[50][4] = new String();
    }
    
    public void generaCompImp()
    {
        int opc=0;
        pedido = cargaAr(ruta1);
        String l=leeAr(pedido);
        String[] datosPedido;
        while(l!=null)
        {
            datosPedido=l.split("-");
            l=leeAr(pedido);
            for(int j =0;j < 4;j++)
                pedidos[opc][j] = datosPedido[j];
            opc++;
        }
    }
    public boolean getValorComp(int imp, int val)
    {
        if(pedidos[imp][val].compareTo("true")==0)
        return true;
        else
        return false;
    }
    public static BufferedReader cargaAr(String nombre)
    {
        BufferedReader a=null;	 
        try
        {
            a = new BufferedReader(new FileReader(nombre));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("el archivo no existe");
            System.exit(0);
        }

        return a;
    } 
 
    public static  String leeAr(BufferedReader d)
    {
        String linea = "";
        try
        {
            linea =d.readLine();
        }
        catch (IOException e)
        {
            System.out.println("I/O Error");
            System.exit(0);
        }
        String data; 
        if((linea != null))
        {
            data = linea;
            return data; 
        }
        else
        {
            return null;
        }
    }
}
