import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte edad = scanner.nextByte();
        System.out.println("Ingresa tu edad");
        if(edad<18){
            System.out.println("menor de edad");
        }else{
            System.out.println("No eres menor de edad");
        }
    }
}
