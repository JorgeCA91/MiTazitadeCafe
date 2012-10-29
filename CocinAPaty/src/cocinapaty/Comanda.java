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
public class Comanda 
{
    String ruta1="Archivos/Comanda.txt";
    String[][] comandas;
    BufferedReader comanda;
    Comanda()
    {
        comandas[50][1] = new String();
    }
    
    public void generaCompImp()
    {
        int opc=0;
        comanda = cargaAr(ruta1);
        String l=leeAr(comanda);
        String[] datosPedido;
        while(l!=null)
        {
            datosPedido=l.split("-");
            l=leeAr(comanda);
            for(int j =0;j < 1;j++)
                comandas[opc][j] = datosPedido[j];
            opc++;
        }
    }
    public boolean getValorComp(int imp, int val)
    {
        if(comandas[imp][val].compareTo("true")==0)
        return true;
        else
        return false;
    }
    public void  escribe(String p,BufferedWriter bw) 
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
