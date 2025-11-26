import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Mojito - Classe di utilità per la gestione dell'input da console.
 * Fornisce metodi per leggere e validare valori di tipo primitivo e stringhe,
 * oltre a un semplice sistema di menu interattivo.
 *
 * Tutti i metodi sono statici: la classe non richiede istanziazione.
 */
public class Mojito {

    /** Lettore condiviso per tutte le operazioni di input */
    private static final BufferedReader keyboard =
            new BufferedReader(new InputStreamReader(System.in));

    // ------------------------------------------------------------
    // Metodo interno:
    // ------------------------------------------------------------
    /**
     * Legge una riga da tastiera gestendo eventuali errori di I/O.
     *
     * @return la riga letta
     */
    private static String readLine() {
        while (true) {
            try {
                return keyboard.readLine();
            } catch (IOException e) {
                System.err.println("Errore di input: " + e.getMessage());
            }
        }
    }

    // ------------------------------------------------------------
    // INPUT DI INTERI (int)
    // ------------------------------------------------------------
    /**
     * Legge un intero da console con validazione del formato.
     *
     * @param message messaggio mostrato all'utente
     * @return valore intero inserito correttamente
     */
    public static int IntPut(String message) {
        System.out.println(message);

        while (true) {
            try {
                return Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                System.err.println("Valore non valido. Inserisci un numero intero.");
            }
        }
    }

    // ------------------------------------------------------------
    // INPUT DI FLOAT
    // ------------------------------------------------------------
    /**
     * Legge un valore float da console con validazione del formato.
     *
     * @param message messaggio mostrato all'utente
     * @return valore float corretto
     */
    public static float FloatPut(String message) {
        System.out.println(message);

        while (true) {
            try {
                return Float.parseFloat(readLine());
            } catch (NumberFormatException e) {
                System.err.println("Valore non valido. Inserisci un numero decimale (float).");
            }
        }
    }

    // ------------------------------------------------------------
    // INPUT DI DOUBLE
    // ------------------------------------------------------------
    /**
     * Legge un valore double da console con validazione del formato.
     *
     * @param message messaggio mostrato all'utente
     * @return valore double corretto
     */
    public static double DoublePut(String message) {
        System.out.println(message);

        while (true) {
            try {
                return Double.parseDouble(readLine());
            } catch (NumberFormatException e) {
                System.err.println("Valore non valido. Inserisci un numero decimale (double).");
            }
        }
    }

    // ------------------------------------------------------------
    // INPUT DI STRINGHE
    // ------------------------------------------------------------
    /**
     * Legge una stringa da console.
     *
     * @param message messaggio mostrato all'utente
     * @return stringa inserita
     */
    public static String StringPut(String message) {
        System.out.println(message);
        return readLine();
    }

    // ------------------------------------------------------------
    // INPUT DI BOOLEAN (yes/no)
    // ------------------------------------------------------------
    /**
     * Legge un valore booleano tramite input "yes/no".
     *
     * @param message messaggio mostrato all'utente
     * @return true se l'utente inserisce "yes" o "y", false per "no" o "n"
     */
    public static boolean getBoolean(String message) {
        System.out.println(message + " (yes/no)");

        while (true) {
            String input = readLine().trim().toLowerCase();

            switch (input) {
                case "yes":
                case "y":
                    return true;

                case "no":
                case "n":
                    return false;

                default:
                    System.err.println("Risposta non valida. Scrivi YES oppure NO.");
            }
        }
    }

    // ------------------------------------------------------------
    // MENU INTERATTIVO
    // ------------------------------------------------------------
    /**
     * Mostra un menu numerato e restituisce l’indice (0-based) della scelta fatta dall’utente.
     *
     * @param options elenco delle opzioni del menu
     * @return indice dell'opzione scelta (0-based)
     */
    public static int menu(String... options) {

        if (options.length == 0) {
            throw new IllegalArgumentException("Il menu deve contenere almeno un'opzione.");
        }

        while (true) {

            // Mostra le opzioni
            for (int i = 0; i < options.length; i++) {
                System.out.println("[" + (i + 1) + "] " + options[i]);
            }

            // Legge la scelta
            int choice = IntPut("Seleziona un'opzione:");

            // Controlla che la scelta sia valida
            if (choice >= 1 && choice <= options.length) {
                return choice - 1; // converte in indice 0-based
            }

            System.err.println("Scelta non valida. Riprova.");
        }
    }

}
