package es3;

import java.time.LocalDate;
import java.util.Arrays;

/*
Esercizio #3
Scrivere un'applicazione che simula il funzionamento di un e-commerce.
Si devono quindi rappresentare i dati relativi i seguenti elementi:

Articolo
codice articolo
descrizione articolo
prezzo
numero pezzi disponibili a magazzino

Cliente
codice cliente
nome e cognome
email
data iscrizione

Carrello
Cliente associato
elenco articoli (Articolo[])
totale costo articoli
* */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "Mario Rossi", "mario.rossi@example.com", LocalDate.now());

        Product laptop = new Product("P100", "Laptop 15''", 899.99, 10);
        Product mouse = new Product("P200", "Mouse wireless", 29.99, 25);
        Product backpack = new Product("P300", "Zaino per laptop", 49.99, 15);
        Product keyboard = new Product("P400", "Tastiera meccanica", 79.99, 12);
        Product monitor = new Product("P500", "Monitor 27''", 299.99, 8);

        Cart cart = new Cart(customer, 5);
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(mouse); // duplicate allowed: represents quantity
        cart.addProduct(backpack);
        cart.addProduct(keyboard);

        boolean addedOverflow = cart.addProduct(monitor); // expected false: cart full

        System.out.println("Carrello di " + cart.getCustomer().getFullName());
        System.out.println("Totale articoli: " + cart.getTotalCost());
        System.out.println("Contenuto carrello: " + Arrays.toString(cart.getProducts()));
        System.out.println("Aggiunta extra (monitor) riuscita? " + addedOverflow);

        Product[] snapshot = cart.getProducts();
        snapshot[0] = null; // prova che la copia non altera il carrello interno
        System.out.println("Copia modificata: " + Arrays.toString(snapshot));
        System.out.println("Carrello invariato: " + Arrays.toString(cart.getProducts()));
        System.out.println("toString() carrello: " + cart);
    }
}
