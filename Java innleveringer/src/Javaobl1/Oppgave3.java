package Javaobl1;
	import static java.lang.Integer.*;
	import static javax.swing.JOptionPane.*;
public class Oppgave3 {
	
	public static void main(String[] args){
		int tall = parseInt(showInputDialog("Skriv inn n-fakultet: "));
		if(tall==0) {
			showMessageDialog(null, 0);
	}
		else {
		int fak=1;
	    for(int i=2;i<=tall;i++) {
	    	fak=fak*i;
	    }
	    showMessageDialog(null,tall+ " Fakultet "+ " = "+ fak);
		}
}
}