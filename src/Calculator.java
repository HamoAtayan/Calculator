public class Calculator {

    public static void main(String[] args) {
        Sum(2, 3);
        Sub(20, 10);
        Multiple(8, 7);
        Divide(3, 2);
    }

    public static void Sum(int FirstNumber, int SecondNumber) {
        System.out.println(FirstNumber + " + " + SecondNumber + " = " + (FirstNumber + SecondNumber));
    }

    public static void Sub(int FirstNumber, int SecondNumber) {
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + (FirstNumber - SecondNumber));
    }

    public static void Multiple(int FirstNumber, int SecondNumber) {
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + FirstNumber * SecondNumber);
    }

    public static void Divide(double FirstNumber, double SecondNumber) {
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + (FirstNumber / SecondNumber));
    }
}
