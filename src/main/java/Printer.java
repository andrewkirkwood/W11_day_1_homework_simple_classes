public class Printer {
    private String name;
    private Integer numberOfSheets;

    public Printer(String name, Integer numberOfSheets) {
        this.name = name;
        this.numberOfSheets = numberOfSheets;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfSheets() {
        return numberOfSheets;
    }

    public void print(Integer numberOfPages, Integer numberOfCopies){
        Integer totalAmountOfPagesToPrint = numberOfPages * numberOfCopies;
        if (totalAmountOfPagesToPrint <= this.numberOfSheets ) {
            this.numberOfSheets -= totalAmountOfPagesToPrint;
        }
    }
}
