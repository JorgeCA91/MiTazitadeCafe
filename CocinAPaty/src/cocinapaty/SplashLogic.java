/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinapaty;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;

/**
 *
 * @author Jorge
 */
public final class SplashLogic 
{
    
    final SplashScreen splash ;
  //texto que se muestra a medida que se va cargando el screensplah
  final String[] texto = {"Gimme the power" ,"configuration", "library",
                          "files XYZ","forms","iconos","properties",
                          "XML files", "X-files", "anonymous",
                          "database" ,"server","wtf!",
                          ""};
  public SplashLogic() 
  {
      splash = SplashScreen.getSplashScreen();
  }
  
  public void animar()
   {
        if (splash != null)
        {
            Graphics2D g = splash.createGraphics();
            for(int i=1; i<texto.length; i++)
            {                       
                //se pinta texto del array
                g.setColor( new Color(4,52,101));//color de fondo
                g.fillRect(300, 250,200,12);//para tapar texto anterior
                g.setColor(Color.white);//color de texto 
                g.drawString("Loading "+texto[i-1]+"...", 300, 260);                
                g.setColor(Color.green);//color de barra de progeso
                g.fillRect(298, 265,(i*218/texto.length), 12);//la barra de progreso
                //se pinta una linea segmentada encima de la barra verde
                float dash1[] = {2.0f};
                BasicStroke dashed = new BasicStroke(9.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,5.0f, dash1, 0.0f);
                g.setStroke(dashed);
                g.setColor(Color.GREEN);//color de barra de progeso
                g.setColor( new Color(4,52,101));
                g.drawLine(300,270, 500, 270);                
                //se actualiza todo
                splash.update();
                try 
                {
                    Thread.sleep(321);
                } 
                catch(InterruptedException e) { }
            }
            splash.close();
        }
        //una vez terminada la animación se muestra la aplicación principal
         try 
         {
             new Bienvenida().setVisible(true);
         }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
   }   
}