/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinapaty;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Jorge
 */
public class Productos 
{
    String ruta1="Productos.txt";
    String[][] productos = new String[50][2];
    BufferedReader producto;
    Productos()
    {
    }
    
    public void generaProd()
    {
        int opc=0;
        producto = cargaAr(ruta1);
        String l=leeAr(producto);
        String[] datosProducto;
        while(l!=null)
        {
            datosProducto=l.split("-");
            l=leeAr(producto);
                for(int j =0;j<2;j++)
                    productos[opc][j] = datosProducto[j];
            opc++;
        }
    }
    public static void  escribe(String p,BufferedWriter bw) 
{try 
 {
  PrintWriter salida;
  salida = new PrintWriter(bw);
  salida.print("\n");
  salida.print(p);
  salida.close();
 }
 catch(Exception e) 
 {System.out.println("I/O Error");
  System.exit(0);
 }
}
    public String getValorComp(int pro, int pre)
    {
        String valor = productos[pro][pre];
        return valor;
        
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
