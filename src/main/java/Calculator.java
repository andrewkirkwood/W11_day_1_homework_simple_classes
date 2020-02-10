public class Calculator {
    private String name;

    public Calculator(String inputName){
        this.name = inputName;
    }

    public String getName() {
        return name;
    }

    public int add(int valueOne, int valueTwo){
        return valueOne + valueTwo;
    }

    public int subtract(int valueOne, int valueTwo){
        return valueOne - valueTwo;
    }

    public int multiply(int valueOne, int valueTwo){
        return valueOne * valueTwo;
    }
}
