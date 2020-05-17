package simutation_feux;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Car extends JPanel implements ActionListener
{
       private static final long serialVersionUID = 1L;
       private int numeroVehicule;
       private boolean roule=true;
       private Color couleurVehicule;
       private int vitesseVehicule=50;
       Timer tm= new Timer(vitesseVehicule, this);
       int x=0, velX=2,y=0, velY=2;
       public Car(int num, Color clr, int vitesse, int x, int y){
    	   this.numeroVehicule = num;
           this.couleurVehicule = clr;
           this.vitesseVehicule = vitesse;
           this.x = x;
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
     public int getX() {
           return x;
     }
     public void setX(int x) {
           this.x = x;
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
     public void setRoule(boolean roule) {
         this.roule = roule;       // true le vehicule marche
                                    //false pour l'arret de vehicule
  }
       public void paint(Graphics g)
       {      super.paint(g);
              g.setColor(Color.red);
              g.fillOval(210 , 5+x, 25, 25);
              g.fillOval(240 , 5+x, 25, 25);
              g.fillOval(210 , 40+x, 25, 25);       
              g.fillOval(240 , 40+x, 25, 25);
              g.setColor(Color.green);
              g.fillRect(225 , x, 25, 70);
              g.setColor(Color.black);
              g.drawRect(230 , 15+x, 15, 35);
         	  tm.start();
       }
      public void actionPerformed(ActionEvent e)
      {
       x+=velX;
       repaint();
      }
       public static void main(String[] args)
       {
             Car car1 = new Car(1, Color.green, 50, 0,0);
             JFrame jf = new JFrame();
             //car1.move1();
             jf.setTitle("Car");
             jf.setSize(600, 600);
             jf.setVisible(true);
             jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jf.add(car1); // Not a proper way, but it still works.
       }
}