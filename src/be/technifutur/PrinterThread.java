package be.technifutur;

public class PrinterThread extends  Thread{

    private CharPrinter printer;

    public PrinterThread(CharPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.start();
    }
}
