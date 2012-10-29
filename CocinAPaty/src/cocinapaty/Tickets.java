/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinapaty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jorge
 */
public class Tickets 
{
    String ruta1="Archivos/Ticket.txt";
    String[][] tickets;
    BufferedReader ticket;
    Tickets()
    {
        tickets[50][5] = new String();
    }
    
    public void generaCompImp()
    {
        int opc=0;
        ticket = cargaAr(ruta1);
        String l=leeAr(ticket);
        String[] datosTicket;
        while(l!=null)
        {
            datosTicket=l.split("-");
            l=leeAr(ticket);
            for(int j =0;j < 5;j++)
                tickets[opc][j] = datosTicket[j];
            opc++;
        }
    }
    public boolean getValorComp(int imp, int val)
    {
        if(tickets[imp][val].compareTo("true")==0)
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