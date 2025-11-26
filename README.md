# Mojito Input Utility Class

# **Indice / Table of Contents**

-   Italiano
    -   [Descrione](#descrizione)
    -   [Come usarla](#come-usarla)
    -   [Esempi di utilizzo](#esempi-di-utilizzo)
    -   [Menu interattivo](#menu-interattivo)
-   English
    -   [Description](#description)
    -   [How to use](#how-to-use)
    -   [Usage examples](#usage-examples)
    -   [Interactive menu](#interactive-menu)


------------------------------------------------------------------------
## **Descrizione**
**Mojito** è una classe Java di utilità progettata per semplificare la
lettura dell'input da tastiera in modo sicuro e strutturato.\
La classe fornisce metodi statici per leggere dati di tipo:
-   `int`
-   `float`
-   `double`
-   `String`
-   `boolean` (yes/no)
-   menu interattivi con selezione numerica

Tutti i metodi gestiscono automaticamente errori di formato e continuano
a richiedere l'input fino a quando l'utente non inserisce un valore
valido.

------------------------------------------------------------------------

# **Come usarla**

1.  Inserisci il file `Mojito.java` nel tuo progetto.

2.  Importala:

    ``` java
    import Mojito;
    ```

3.  Richiama i metodi statici, ad esempio:

    ``` java
    int x = Mojito.IntPut("Inserisci un numero:");
    ```

------------------------------------------------------------------------

# **Esempi di utilizzo**

###  Leggere un intero

``` java
int eta = Mojito.IntPut("Inserisci la tua età:");
```

###  Leggere un double

``` java
double prezzo = Mojito.DoublePut("Prezzo del prodotto:");
```

###  Leggere una stringa

``` java
String nome = Mojito.StringPut("Come ti chiami?");
```

###  Leggere un boolean con yes/no

``` java
boolean conferma = Mojito.getBoolean("Vuoi continuare?");
```

------------------------------------------------------------------------

# **Menu interattivo**

``` java
int scelta = Mojito.menu(
    "Aggiungi elemento",
    "Rimuovi elemento",
    "Visualizza lista",
    "Esci"
);

System.out.println("Hai scelto l’opzione n° " + (scelta + 1));
```

------------------------------------------------------------------------
## **Description**

**Mojito** is a Java utility class designed to simplify safe and
structured keyboard input handling from the console.\
It provides static methods to read different data types:

-   `int`
-   `float`
-   `double`
-   `String`
-   `boolean` (yes/no)
-   interactive numbered menus

All methods automatically handle format errors and keep prompting until
correct input is provided.

The class uses a single shared `BufferedReader` for efficient input
reading.

------------------------------------------------------------------------

# **How to use**

1.  Add `Mojito.java` to your project.

2.  Import it:

    ``` java
    import Mojito;
    ```

3.  Call the provided static methods:

    ``` java
    int x = Mojito.IntPut("Enter a number:");
    ```

------------------------------------------------------------------------

# **Usage examples**

### Read an integer

``` java
int age = Mojito.IntPut("Enter your age:");
```

### Read a double

``` java
double price = Mojito.DoublePut("Enter product price:");
```

### Read a string

``` java
String name = Mojito.StringPut("Enter your name:");
```

### Read a yes/no boolean

``` java
boolean ok = Mojito.getBoolean("Do you want to continue?");
```

------------------------------------------------------------------------

# **Interactive menu**

``` java
int choice = Mojito.menu(
    "Add item",
    "Remove item",
    "Show list",
    "Exit"
);

System.out.println("You selected option #" + (choice + 1));
```
------------------------------------------------------------------------

