import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio13 {
    
    // ArrayList per memorizzare i nomi e le password degli utenti
    static ArrayList<String> nomiRegistrati = new ArrayList<>();
    static ArrayList<String> passwordRegistrate = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            // Menu principale
            System.out.println("\n--- Menu Gestione Utenti ---");
            System.out.println("1. Registrati");
            System.out.println("2. Effettua il login");
            System.out.println("3. Modifica i tuoi dati");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la newline rimasta nel buffer

            switch (scelta) {
                case 1:
                    registrazione(scanner);
                    break;
                case 2:
                    accedere(scanner);
                    break;
                case 3:
                    System.out.println("NON L'HO IMPLEMENTATO");
                    // Qui andrà il metodo per modificare i dati
                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida! Riprova.");
            }
        } while (scelta != 0);

        scanner.close();
    }

    // Metodo per la registrazione dell'utente
    public static void registrazione(Scanner scanner) {
        // Chiediamo all'utente di inserire il nome
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        // Chiediamo di inserire la password
        System.out.print("Inserisci la tua password: ");
        String password = scanner.nextLine();

        // Aggiungiamo il nome e la password agli ArrayList
        nomiRegistrati.add(nome);
        passwordRegistrate.add(password);

        // Conferma della registrazione
        System.out.println("Registrazione completata con successo!");
        System.out.println("Nome: " + nome);
        System.out.println("Password: " + password);
    }

    // Metodo per effettuare il login
    public static void accedere(Scanner scanner) {
        // Chiediamo all'utente di inserire il nome
        System.out.print("Inserisci il tuo nome: ");
        String nomeInserito = scanner.nextLine();

        // Chiediamo di inserire la password
        System.out.print("Inserisci la tua password: ");
        String passwordInserita = scanner.nextLine();

        // Controlliamo se il nome e la password sono presenti negli ArrayList
        if (nomiRegistrati.contains(nomeInserito) && passwordRegistrate.contains(passwordInserita)) {
            int indice = nomiRegistrati.indexOf(nomeInserito);
            if (passwordRegistrate.get(indice).equals(passwordInserita)) {
                System.out.println("Login effettuato con successo!");
            } else {
                System.out.println("Nome utente o password errati. Riprova.");
            }
        } else {
            System.out.println("Nome utente o password errati. Riprova.");
        }
    }
}
