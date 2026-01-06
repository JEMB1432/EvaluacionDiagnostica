import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        while (number != 0){
            number = numberIn("Ingrese un numero");

            if (number != 0) list.add(number);
            System.out.println(list);
            sum += number;
        }
        System.out.println("Suma: " + sum);
    }

    public static int numberIn(String messagge){
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        Integer number = 0;
        do{
            try{
                System.out.println(messagge);
                number = scanner.nextInt();
                exit = true;
            }catch (Exception e){
                System.out.println("Ingrese solo numeros");
                scanner.nextLine();
            }
        }while (!exit);
        return number;
    }
}