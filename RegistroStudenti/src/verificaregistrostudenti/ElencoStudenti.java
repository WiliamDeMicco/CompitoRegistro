package verificaregistrostudenti;
import java.util.ArrayList;
public class ElencoStudenti {
	//public void add(ArrayList<String> studenti) {
	//}
	ArrayList<String> studenti = new ArrayList<String>();
		//creo arraylist per elenco degli studenti
		public ElencoStudenti() {
				studenti = new ArrayList<>();
				//return;
		}
	//qui creo un metodo per aggiungere uno studente all'arrayList ElencoStudenti(studenti)
		public void aggiungiStudente(Studente name) {
				name.add(studenti);
		}
			
	//creo metodo per aggiungere all'elenco uno studente
		public void visualizzaElenco(String visualizzaElenco){
			System.out.println("Elenco degli studenti: ");
			for(String studente : studenti) {
				//if(studente.visualizzaElenco()) { //NOTA 1:qui non capisco l'errore.. sia che metto il nome dell'arraylist, sia che metto qualsiasi altro tipo di metodo, non me lo riconosce
					System.out.println(studente); //NOTA 2: anche provando a creare un override, per esclusione, in classe studente non riesce a leggermelo..
				}
			
			
		}
		public void getMatricola(String codiceMatricola) {
			System.out.println("la matricola è associata allo studente: " + studenti);
			
		}
		public void visualizzaElenco(Studente studente) {
			
			
		}

}
