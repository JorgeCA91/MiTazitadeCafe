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
public class Productos 
{
    String ruta1="Archivos/Productos.txt";
    String[][] productos;
    BufferedReader producto;
    Productos()
    {
        productos[50][2] = new String();
    }
    
    public void generaCompImp()
    {
        int opc=0;
        producto = cargaAr(ruta1);
        String l=leeAr(producto);
        String[] datosProducto;
        while(l!=null)
        {
            datosProducto=l.split("-");
            l=leeAr(producto);
            for(int j =0;j < 2;j++)
                productos[opc][j] = datosProducto[j];
            opc++;
        }
    }
    public boolean getValorComp(int imp, int val)
    {
        if(productos[imp][val].compareTo("true")==0)
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
