package analizadorLexico;

import java.util.ArrayList;

public class PalabrasReservadas {
	
	
	private ArrayList<String> listaPR = new ArrayList<String>();
	
	public PalabrasReservadas() {
		listaPR.add("IF");
		listaPR.add("THEN");
		listaPR.add("ELSE");
		listaPR.add("ENDIF");
		listaPR.add("PRINT");
		listaPR.add("FUNC");
		listaPR.add("RETURN");
		listaPR.add("BEGIN");
		listaPR.add("END");
		listaPR.add("BREAK");
		listaPR.add("ULONG");
		listaPR.add("DOUBLE");
		listaPR.add("REPEAT");
		listaPR.add("UNTIL");
	};
	
	public void addPR(String p) {
		listaPR.add(p);
	}
	
	public boolean isPalabraReservada(String l) {
		return listaPR.contains(l);
	}

}