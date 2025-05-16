public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
 
    public int subtract(int a, int b) {
        return a - b;
    }
 
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3)); // 8
        System.out.println(calculator.subtract(5, 3)); // 2
    }
