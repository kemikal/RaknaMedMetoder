import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Ange två nummer: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        printNumbers(num1, num2);
        int sum = add(num1, num2);
        int max = max(num1, num2);

        System.out.println("Summan av talen är: " + sum);
        System.out.println("Det högsta talet är: " + max);
    }

    // Skriv ut de angivna talen
    public static void printNumbers(int num1, int num2) {
        System.out.println("Du skrev " + num1 + " och " + num2);
    }

    // Räkna ihop de angivna talen och returnera summan
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Multiplicerar de angivna talen och returnerar summan
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Räkna ut det högsta numret av de två angivna talen
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }
}
