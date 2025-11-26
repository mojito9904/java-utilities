import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mojito{

    //////////////////////////////////////////////////
    ///////////  LETTURA DI UN INTERO (int)
    /**
     * Legge da tastiera un numero intero.
     * Continua a chiedere finché non viene inserito un valore valido.
     *
     * @param information Messaggio mostrato all'utente
     * @return numero intero letto
     */
    public static int IntPut(String information ){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        System.out.println(information);

        int data = 0;
        boolean error = true;

        while (error) {
            try {
                String read = keyboard.readLine();
                data = Integer.parseInt(read);
                error = false; // input corretto
            } catch (Exception e) {
                System.err.println("Errore: " + e);
                error = true;
            }
        }
        return data;
    }


    //////////////////////////////////////////////////
    ///////////  LETTURA DI UN FLOAT (float)
    /**
     * Legge da tastiera un numero float.
     * Ripete la richiesta finché l'input non è valido.
     *
     * @param information Messaggio per l’utente
     * @return numero float letto
     */
    public static float FloatPut(String information){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        System.out.println(information);

        float data = 0;
        boolean error = true;

        while (error) {
            try {
                String read = keyboard.readLine();
                data = Float.parseFloat(read);
                error = false;
            } catch (Exception e) {
                System.err.println("Errore: " + e);
                error = true;
            }
        }
        return data;
    }


    //////////////////////////////////////////////////
    ///////////  LETTURA DI UNA STRINGA (String)
    /**
     * Legge una stringa da tastiera senza ulteriori controlli.
     *
     * @param information Messaggio mostrato all’utente
     * @return stringa letta
     */
    public static String StringPut(String information){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        System.out.println(information);

        String data = "";
        boolean error = true;

        while (error) {
            try {
                data = keyboard.readLine();
                error = false;
            } catch (Exception e) {
                System.err.println("Errore: " + e);
                error = true;
            }
        }
        return data;
    }


    //////////////////////////////////////////////////
    ///////////  LETTURA DI UN DOUBLE (double)
    /**
     * Legge un numero double da tastiera con gestione degli errori.
     *
     * @param information Messaggio per l’utente
     * @return numero double letto
     */
    public static double DoublePut(String information){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        System.out.println(information);

        double data = 0;
        boolean error = true;

        while (error) {
            try {
                String read = keyboard.readLine();
                data = Double.parseDouble(read);
                error = false;
            } catch (Exception e) {
                System.err.println("Errore: " + e);
                error = true;
            }
        }
        return data;
    }


    //////////////////////////////////////////////////
    ///////////  LETTURA DI UN BOOLEAN (yes/no)
    /**
     * Legge un valore booleano chiedendo "yes/no".
     * Accetta solo "yes" o "no" (case insensitive).
     *
     * @param information Messaggio mostrato all’utente
     * @return true se utente inserisce "yes", false se "no"
     */
    public static boolean getBoolean(String information){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(input);
        System.out.println(information);

        boolean result = true;
        boolean error = true;

        while (error) {
            try {
                System.out.println("yes/no");
                String read = keyboard.readLine().toUpperCase();

                if (read.equals("YES")) {
                    result = true;
                    error = false;
                } else if (read.equals("NO")) {
                    result = false;
                    error = false;
                } else {
                    System.out.println("Input non valido. Inserire yes/no.");
                }

            } catch (Exception e) {
                System.err.println("Errore: " + e );
                error = true;
            }
        }
        return result;
    }


    //////////////////////////////////////////////////
    ///////////  MENU DI SCELTA (opzioni)
    /**
     * Visualizza un menu numerato e ritorna l'indice dell’opzione scelta.
     *
     * @param args Elenco dinamico di opzioni (varargs)
     * @return indice dell'opzione scelta (1-based)
     */
    public static int menu (String... args){
        int data = -1;

        // Ripete finché scelta non valida
        while (data < 0 || data >= args.length){
            for (int i = 0; i < args.length; i++){
                System.out.println("[" + (i + 1) + "] " + args[i]);
            }
            data = IntPut("");
            data--; // Converte input umano (1-based) in indice (0-based)
        }
        return data;
    }
}
