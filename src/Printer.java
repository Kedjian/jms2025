public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel < 0) {
            return -1;
        } else if (tonerLevel > 100) {
            return -1;
        } else {
            tonerLevel += tonerAmount;
        } return tonerLevel;
    }

    public int printPages(int pagesToPrint) {
        int jobPages = (duplex) ? (pagesToPrint / 2) + (pagesToPrint % 2) : pagesToPrint;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
