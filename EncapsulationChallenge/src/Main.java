public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);

        System.out.println("Pages printed: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(3);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(15);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}
