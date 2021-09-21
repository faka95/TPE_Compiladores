package analizadorLexico;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TablaDeSimbolos {
    /* Tengo duda de si tenemos que crear una clase que represente un tipo, por que iria, _INTEGER,_FLOAT */
	private HashMap<String,Integer> simbolos; /* es la tabla de simbolos */
	
	/* Constructor, se inicializa en vacio */
	public TablaDeSimbolos(){
		this.simbolos = new HashMap<>();
	}
	
	/* Para agregar un simbolo */
	public void add(String lexema,Integer id) {
		if (!this.simbolos.containsKey(lexema))
			this.simbolos.put(lexema, id);
	}
	
	/* Obtener un simbolo */
	public Integer get(String id) {
		return this.simbolos.get(id);
	}

	/* Elimina un simbolo */
	public void remover(String id) {
		this.simbolos.remove(id);
	}
	
	public boolean isKey(String lexema) {
		return this.simbolos.containsKey(lexema);
	}
	
	/* Imprime por pantalla la tabla */
	public void imprimirTabla() {
		System.out.println("Tabla de Simbolos: ");
		Iterator it = simbolos.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry e = (Entry) it.next();
		    System.out.println("Lexema: " + e.getKey() + " ID: " + e.getValue());
		}
	}
}
