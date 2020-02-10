public class Printer {
    private String name;
    private Integer numberOfSheets;
    private Integer toner;

    public Printer(String name, Integer numberOfSheets, Integer toner) {
        this.name = name;
        this.numberOfSheets = numberOfSheets;
        this.toner = toner;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfSheets() {
        return numberOfSheets;
    }

    public void print(Integer numberOfPages, Integer numberOfCopies){
        Integer totalAmountOfPagesToPrint = numberOfPages * numberOfCopies;
        if (totalAmountOfPagesToPrint <= this.numberOfSheets && totalAmountOfPagesToPrint <= this.toner) {
            this.numberOfSheets -= totalAmountOfPagesToPrint;
            this.toner -= totalAmountOfPagesToPrint;
        }
    }

    public Integer getToner() {
        return toner;
    }
}
