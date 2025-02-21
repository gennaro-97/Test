import java.util.Scanner;

public class Esercizio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente l'intervallo di numeri
        System.out.print("Inserisci il numero iniziale: ");
        int inizio = scanner.nextInt();

        System.out.print("Inserisci il numero finale: ");
        int fine = scanner.nextInt();

        // Variabile per la somma
        int somma = 0;

        // Contatore per i numeri pari stampati
        int contatore = 0;

        // Ciclo per i numeri da 'inizio' a 'fine'
        for (int i = inizio; i <= fine; i++) {
            // Verifica se il numero è pari
            if (i % 2 == 0) {
                System.out.print(i + " "); // Stampa il numero pari
                somma += i; // Aggiunge il numero pari alla somma
                contatore++; // Incrementa il contatore

                if (contatore % 10 == 0) {
                    System.out.println(); // Vai a capo dopo 10 numeri
                }
            }
        }

        // Stampa la somma dei numeri pari
        System.out.println("\nLa somma dei numeri pari nell'intervallo è: " + somma);

        scanner.close();

    }
}