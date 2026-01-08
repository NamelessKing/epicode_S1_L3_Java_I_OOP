package es2;

/*
Esercizio #2
Scrivere un'applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare.

Si devono quindi rappresentare i dati relativi ad una carta SIM, ed in particolare:
il numero di telefono
il credito disponibile in euro
la lista delle ultime 5 chiamate effettuate
Per ciascuna Chiamata deve essere rappresentata la durata in minuti e il numero chiamato

La classe SIM dovrà fornire le seguenti funzionalità:
un costruttore che crea una SIM con numero di telefono passato come parametro, credito a 0 e lista delle chiamate vuota
una funzione per la stampa dei dati della SIM

Scrivere un main che crei una istanza di SIM e ne stampi i dati.
* */
public class Main {
    public static void main(String[] args) {

        SimCard sim = new SimCard("3331234567");

        sim.topUp(20.0);

        sim.addCall(new Call(3, "3401112222"));
        sim.addCall(new Call(5, "3479998888"));
        sim.addCall(new Call(2, "3205554444"));

        System.out.println(sim.getDetails());
    }
}
