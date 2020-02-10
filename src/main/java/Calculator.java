public class Calculator {
    private String name;

    public Calculator(String inputName){
        this.name = inputName;
    }
    public int add(int valueOne, int valueTwo){
        return valueOne + valueTwo;
    }

    public String getName() {
        return name;
    }
}
