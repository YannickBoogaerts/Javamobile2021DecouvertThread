package be.technifutur;

public class Test3 {

    public static void main(String[] args) {
        CharPrinter printer = new CharPrinter('-', 80, 50);
        CharPrinter printer2 = new CharPrinter('+', 80, 50);
        CharPrinter printer3 = new CharPrinter('*', 100, 50);

        Thread thread1 = new Thread(printer);
        Thread thread2 = new Thread(printer2);

        thread1.start();
        thread2.start();
        new Thread(printer3).start();
        System.out.println("c'est fini");
    }
}
