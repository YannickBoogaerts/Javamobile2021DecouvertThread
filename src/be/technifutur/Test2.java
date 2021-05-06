package be.technifutur;

public class Test2 {

    public static void main(String[] args) {
        CharPrinter printer = new CharPrinter('-',80,20);
        CharPrinter printer2 = new CharPrinter('+',80,20);

        PrinterThread thread1 = new PrinterThread(printer);
        PrinterThread thread2 = new PrinterThread(printer2);

        thread1.start();
        thread2.start();
        System.out.println("c'est fini");
    }
}
