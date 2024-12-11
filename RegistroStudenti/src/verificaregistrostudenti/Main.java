package verificaregistrostudenti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        ElencoStudenti elenco = new ElencoStudenti();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi Studente");
            System.out.println("2. Visualizza Studenti");
            System.out.println("3. Ricerca studente per matricola");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            
            
            switch (scelta) {
            case 1:
                // Aggiunta di uno studente all'elenco
                System.out.print("Nome studente: ");
                String nome = scanner.nextLine();
                System.out.print("Cognome studente: ");
                String cognome = scanner.nextLine();
                System.out.print("Matricola studente: ");
                String matricola = scanner.nextLine();
                Studente studente = new Studente(nome, cognome, matricola);
                elenco.aggiungiStudente(studente);
                System.out.println("Studente aggiunto all'elenco");
                break;
                
            case 2:
                // Visualizza gli studenti facenti parte dell'elenco
            	String nome1 = scanner.nextLine();
            	String cognome1 = scanner.nextLine();
            	String matricola1 = scanner.nextLine();
            	 Studente studente1 = new Studente(nome1, cognome1, matricola1);
               elenco.visualizzaElenco(studente1);//NOTA: Mi sto confondendo con le diverse variabili tra le classi, sperando che stia facendo giusto
                break;
                
            case 3:
                // Ricerca dello studente utilizzando la matricola
                System.out.println("inserisci il codice matricola per fare una ricerca nell'elenco: ");
                String codiceMatricola = scanner.nextLine();
                elenco.getMatricola(codiceMatricola);
                break;
                
            case 4:
            	System.out.println("Stai uscendo dal programma...");
            	System.exit(0);
            	break;
            	
            	
           default: 
            	System.out.println("Opzione non valida!");
            }
        }
	}
}
