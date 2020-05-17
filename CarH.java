package simutation_feux;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import simutation_feux.Route;
public class CarH extends JPanel implements ActionListener
{
       private static final long serialVersionUID = 1L;
       private int numeroVehicule;
       private boolean roule=true;
       private Color couleurVehicule;
       private int vitesseVehicule=50;
       Timer tm= new Timer(vitesseVehicule, this);
       int y=0, velY=2;
       public CarH(int num, Color clr, int vitesse, int x, int y){
    	   this.numeroVehicule = num;
           this.couleurVehicule = clr;
           this.vitesseVehicule = vitesse;
           this.y=y;
       }
       public int getNumV() {
           return numeroVehicule;
     }
    
     public void setnumV(int num) {
           this.numeroVehicule = num;
     }
    
     public Color getClrV() {
           return couleurVehicule;
     }

     public void setClrV(Color clr) {
           this.couleurVehicule = clr;
     }
     public int getVitesse() {
           return vitesseVehicule;
     }
     public void setVitesse(int vitesse) {
           this.vitesseVehicule = vitesse;
     }
     
     public int getY() {
           return y;
     }
     public void setY(int y) {
           this.y = y;
     }
     public void move()
     {
         tm.start();
        
     }
     public void move1() {
    	 tm.start();
     }
       public void paint(Graphics g)
       {      super.paint(g);
       //Route.numeroRoute=1;
       
       		  g.setColor(Color.red);
              g.fillOval(5+y , 210, 25, 25);
              g.fillOval(5+y , 240, 25, 25);
              g.fillOval(40+y , 210, 25, 25);       
              g.fillOval(40+y , 240, 25, 25);
              g.setColor(Color.green);
              g.fillRect(y , 225, 70, 25);
              g.setColor(Color.black);
              g.drawRect(15+y , 230, 35, 15);
              }
       
      public void actionPerformed(ActionEvent e)
      {
       y+=velY;
       repaint();
      }
       public static void main(String[] args)
       {
             CarH car1 = new CarH(1, Color.green, 50, 0,0);
             JFrame jf = new JFrame();
             car1.move1();
             jf.setTitle("Car");
             jf.setSize(600, 600);
             jf.setVisible(true);
             jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jf.add(car1); // Not a proper way, but it still works.
       }
}