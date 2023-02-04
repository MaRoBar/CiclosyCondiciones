package ciclosycondiciones;
import java.util.Scanner;

public class Tarea1 {

     public static void main(String[] args) {
        Condicionswitch();
    }
    public static void Condicionswitch(){
        Scanner leer = new Scanner(System.in);
        int opcion, num1, num2, total;
        System.out.println("Digite una opcion del menu");
       
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Digite el primer numero");
                num1=leer.nextInt();
                System.out.println("Digite el segundo numero");
                num2=leer.nextInt();
                total= num1+num2;
                System.out.println("La suma de sus numeros "+num1+" y "+num2+" es: "+total);
                break;
            case 2:
                System.out.println("Digite el primer numero");
                num1=leer.nextInt();
                System.out.println("Digite el segundo numero");
                num2=leer.nextInt();
                total= num1-num2;
                System.out.println("La resta de sus numeros "+num1+" y "+num2+" es: "+total);
                break;
            case 3:
                System.out.println("Digite el primer numero");
                num1=leer.nextInt();
                System.out.println("Digite el segundo numero");
                num2=leer.nextInt();
                total= num1*num2;
                System.out.println("La multiplicacion de sus numeros "+num1+" y "+num2+" es: "+total);
                break;
            case 4:
                System.out.println("Digite el primer numero");
                num1=leer.nextInt();
                System.out.println("Digite el segundo numero");
                num2=leer.nextInt();
                total= num1/num2;
                System.out.println("La division de sus numeros "+num1+" y "+num2+" es: "+total);
                break;
            case 5:
                break;
            default:
        }
                
    }
        
    
  
}
