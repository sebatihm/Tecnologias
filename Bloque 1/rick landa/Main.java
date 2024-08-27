import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true){
            System.out.println("Escoge una opcion:");
            System.out.println("1 : Sumar");
            System.out.println("2 : Resta");
            System.out.println("3 : Multiplicacion");
            System.out.println("4 : Dividir");
            System.out.println("5 : Salir");
            int choice = sc.nextInt();

            if(choice == 5){
                System.out.println("Saliendo");
                break;
            }

            System.out.println("Ingrese el numero 1: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el numero 2: ");
            int num2 = sc.nextInt();


            switch (choice) {
                case 1:
                    calculator.setOperation(new BasicOperations.Addition());
                    break;
                case 2:
                calculator.setOperation(new BasicOperations.Substract());
                    break;
                case 3:
                calculator.setOperation(new BasicOperations.Multiplication());
                    break;
                case 4:
                calculator.setOperation(new BasicOperations.Division());
                    break;
                
                default:
                    System.out.println("xdddddd");
                    break;
            }

            try {
                int result = calculator.calculate(num1, num2);
                System.out.println("El resultado de la operacion es: " + result + "\n\ns");
            } catch (Exception e) {
                System.out.println("Hubo un error " + e);
            }
        }

    }
}
