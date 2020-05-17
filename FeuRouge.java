import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FeuRouge extends JPanel{
	private static final long serialVersionUID = 1L;
	Color defaultColor;   // Couleur par défaut du label
	Color blinkingColor;  // Couleur de clignotement
	private Color couleurFeu= Color.gray;
	private int numeroRouteFeu;
	private int duréeAllumage=500;
	private boolean etatFeu;
	Timer timer ;	
	public FeuRouge(int numeroRouteFeu,Color coulreurFeu){
		super();
		this.setBounds(10, 10, 10, 10);
		this.blinkingColor = coulreurFeu;
	    this.defaultColor  = getCouleurFeu ();
		this.numeroRouteFeu = numeroRouteFeu;
		timer = createTimer (duréeAllumage);
		timer.start ();
	}
	public Color getCouleurFeu() {
		return couleurFeu;
	}
	public void setCouleurFeu(Color couleurFeu) {
		this.couleurFeu = couleurFeu;
	}
	public int getNumeroRouteFeu() {
		return numeroRouteFeu;
	}
	public void setNumeroRouteFeu(int numeroRouteFeu) {
		this.numeroRouteFeu = numeroRouteFeu;
	}
	public boolean isEtatFeu() {
		return etatFeu;
	}
	public void setEtatFeu(boolean etatFeu) {
		this.etatFeu = etatFeu;
	}
	public void paintComponent(Graphics g){
		g.setColor(couleurFeu);
		if(this.getNumeroRouteFeu()==1){
			g.fillOval(340,250, 15,15);
			}
		else if(this.getNumeroRouteFeu()==2) {
			g.fillOval(310,505, 15,15);
		}
		else if(this.getNumeroRouteFeu()==3) {
			g.fillOval(565,540, 15,15);
		}else if(this.getNumeroRouteFeu()==4) {
			g.fillOval(600,280, 15,15);
		}
		repaint();
	}
	private Timer createTimer (int duréeAllumage)
	  {
		 ActionListener action = new ActionListener ()
	      {
	        // Méthode appelée à chaque tic du timer
	        public void actionPerformed (ActionEvent event)
	        {
	          // Inversion de la couleur
	          if (getCouleurFeu().equals(defaultColor)){            
	        	 setCouleurFeu(blinkingColor);
	          }else 
	        	  //if (getCouleurFeu().equals(Color.gray))
	        	  {
	        	 setCouleurFeu(defaultColor);
	        }
        } 	
    };
	      return new Timer (duréeAllumage, action);
	  } 

}