import java.awt.Color;
import java.util.Vector;
import javax.swing.JFrame;

public class Simulation extends JFrame{
	private static RéseauRoutier R1 = new RéseauRoutier();
	static FeuRouge FeuRouge1= new FeuRouge(1, Color.red);
	public Simulation(){
		
		add(R1);
		add(FeuRouge1);
	}
	public static void main(String[] args) {
		Simulation S = new Simulation();
		S.setVisible(true);
		S.setSize(1000, 1000);
	}
}
