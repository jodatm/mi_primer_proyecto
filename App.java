import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        byte edad = scanner.nextByte();
        if(edad<18){
            System.out.println("Menor de edad");
        }else if(edad<0){
            System.out.println("No puedes tener edad negativa");
        }
        else{
            System.out.println("No eres menor de edad");
        }
    }
}
