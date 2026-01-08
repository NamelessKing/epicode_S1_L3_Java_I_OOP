package es1;
/*
Esercizio #1
Creare una classe Rettangolo che permetta di rappresentare dei rettangoli.
Per ogni rettangolo deve essere possibile specificare altezza e larghezza in fase di costruzione dell'istanza e devono
essere realizzati metodi per calcolare perimetro ed area.
Realizzare un metodo stampaRettangolo che, dato un Rettangolo, stampi a video area e perimetro.
Realizzare un metodo stampaDueRettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la somma delle aree e dei perimetri.
Scrivere un main che utilizzi tutte queste funzioni.
* */
public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(4.0, 6.0);

        System.out.println("Rettangolo 1:");
        RectanglePrinter.printRectangle(rect1);

        System.out.println("\nRettangolo 2:");
        RectanglePrinter.printRectangle(rect2);

        System.out.println("\nDue Rettangoli:");
        RectanglePrinter.printTwoRectangles(rect1, rect2);
    }
}
