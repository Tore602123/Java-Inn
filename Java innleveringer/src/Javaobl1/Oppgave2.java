package Javaobl1;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

	public class Oppgave2 {
		
	public static void main(String[] args) {
		for(int in=1; in<=10; in++) {
			int poeng = parseInt(showInputDialog("Poeng på prøve "+ in ));	
			if(poeng<0 ||poeng>100){
	        showMessageDialog(null,"Feil");
	        in -=1;
			}
			else if(poeng < 39 )
				showMessageDialog(null,poeng+" poeng gir karakter F");
			else if (poeng <= 49 )
				showMessageDialog(null,poeng+" poeng gir karakter E");
			else if (poeng <= 59)
				showMessageDialog(null,poeng+" poeng gir karakter D");
			else if (poeng <=79)
				showMessageDialog(null,poeng+" poeng gir karakter C");
			else if (poeng <=89)
				showMessageDialog(null,poeng+" poeng gir karakter B");
			else if (poeng <=100)
				showMessageDialog(null,poeng+" poeng gir karakter A");	
	    }
		}

}