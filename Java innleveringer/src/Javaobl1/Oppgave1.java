package Javaobl1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave1 {

	public static void main(String[] args) {
		
			int inntekt = parseInt(showInputDialog("Skriv inntekt"));
			
			double netto1 = inntekt+(inntekt*0.017);
			double netto2 = inntekt-(inntekt*0.04);
			double netto3 = inntekt-(inntekt*0.132);
			double netto4 = inntekt-(inntekt*0.162);
		
			
			if (inntekt <= 184800)
				showMessageDialog(null,"Du er i Trinn 0 og betaler ingen Trinnskatt");
			else if (inntekt <= 260100)
				showMessageDialog(null, "Du er i Trinn 1 og betaler 1,7% Trinnskatt"+"Før skatt; "+inntekt+ " Etter Skatt: " + netto1);
			else if (inntekt <= 651250)
				showMessageDialog(null, "Du er i Trinn 2 og betaler 4,0% Trinnskatt"+"Før skatt; "+inntekt+ " Etter Skatt: " + netto2);
			else if (inntekt <= 1021500)
				showMessageDialog(null, "Du er i Trinn 3 og betaler 13,2% Trinnskatt"+"Før skatt; "+inntekt+ " Etter Skatt: " + netto3);
			else if (inntekt > 1021500)
				showMessageDialog(null, "Du er i Trinn 4 og betaler 16,2% Trinnskatt "+"Før skatt; "+inntekt+ " Etter Skatt: " + netto4);
				
	}

}
