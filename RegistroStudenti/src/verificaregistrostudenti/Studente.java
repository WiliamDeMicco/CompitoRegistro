package verificaregistrostudenti;

import java.util.ArrayList;

public class Studente {
	
	private String name;
	private String surname;
	private String matricola;
	private String visualizzaElenco;
	
	 public Studente(String name, String surname, String matricola) {
	        this.name = name;
	        this.surname = surname;
	        this.matricola = matricola;
	        }
	 public String getName() {
	        return name;
	    }
	    public String getSurname() {
	        return surname;
	    }
	    public String getMatricola() {
	    	return matricola;
	    }
	    public String getVisualizzaElenco() {
	        return visualizzaElenco;
        }
		//public void add(Studente name) {	
		//}
	    public void add(ArrayList<String> studenti) {
		}
	    @Override
	    public String toString() {
	    	return "Nome: " + name + "Cognome: " + surname + "Matricola: " + matricola + "Elenco: " + visualizzaElenco;
	    	
	    	
	    	
	    }
}
