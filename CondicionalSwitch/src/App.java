import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //condicional switch-condicional multiple
        Scanner lector = new Scanner(System.in);
        double valorA, valorB, resultado, cociente = 0.0;

        System.out.println("Menu de opciones: ");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Salir");
        Byte opc = lector.nextByte();
        switch (opc) {
            case 1:
                System.out.println("1) Sumar");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                resultado = valorA + valorB;
                System.out.println("La suma de: " + valorA  + " + " + valorB + " es: " + resultado);
                
                break;
            case 2:
                System.out.println("2) Restar");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                resultado = valorA - valorB;
                System.out.println("La diferencia de: " + valorA  + " - " + valorB + " es: " + resultado);

                break;
            case 3:
                System.out.println("3) Multiplicar");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                resultado = valorA * valorB;
                System.out.println("El producto de: " + valorA  + " * " + valorB + " es: " + resultado);

                break;
            case 4:
                System.out.println("4) Dividir");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                if(valorB == 0){
                    System.out.println("El divisor no puede ser 0.");
                } else{
                    cociente = valorA / valorB;
                    System.out.println("El producto de: " + valorA  + " / " + valorB + " es: " + cociente);
                }
                break;
            case 5:
                System.out.println("Saliendo de la App");
                break;    
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
}
