
package ciclosycondiciones;

import java.util.Scanner;


public class CiclosyCondiciones {

//METODOS (void) Y FUNCIONES
public static void main(String[] args) 
{
   Condicionswitch();
}

public static void ciclowhile()
{
int x = 0;
    while (x <= 20){
        if ((x<5) && (x<10)){
        }
        System.out.println("Valor "+x);
        x = x + 1;
    }
}
public static void ciclodowhile()
{
        Scanner leer = new Scanner(System.in);
    
    int opcion=0;
    do {
    System.out.println("1-Sumar");
    System.out.println("2-Restar");
    System.out.println("3-Salir");
    System.out.println("Digite una opción");
    opcion = leer.nextByte();
    } while (opcion!=3);
  
}

public static void Condicionswitch()
{
    Scanner leer = new Scanner(System.in);
    byte dia = 0;
    System.out.println("Digite el día");
    dia = leer.nextByte();
    
    switch(dia){
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            throw new AssertionError();
    }
}
public static void menu(){
    System.out.println("1-Sumar");
    System.out.println("2-Restar");
    System.out.println("3-Salir");
}

public static void sumar(){
    float total;
    total = 5 + 6;
    System.out.println("total suma: " + total);
}

public static void restar(){
    float total;
    total = 5 - 6;
    System.out.println("total resta: " + total); 
}

public static void CondicionIf() {
    int num1, num2, num3;
    num1 = 60;
    num2 = 1000;
    num3 = 100;
//condicion if else else if
     
     if ((num1>num2) && (num1>num3)) { 
         System.out.println(num1 + " es mayor que " + num2);
    } else if ((num2 > num1) && (num2 > num3)){
        System.out.println(num2 + " es mayor ");
    } else if ((num3 > num1) && (num3 > num2)){
        System.out.println(num3 + " es mayor ");
    } else if ((num1 == num2) && (num2 == num3)){
         System.out.println("Los tres números son iguales");
    }
     {
   
     }
    
}    
}
