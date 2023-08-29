import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //condicional switch-condicional multiple
        Scanner lector = new Scanner(System.in);
        double valorA, valorB, resultado, cociente = 0.0;

        System.out.println("Menu de opciones: ");
        System.out.println("a) Sumar");
        System.out.println("b) Restar");
        System.out.println("c) Multiplicar");
        System.out.println("d) Dividir");
        System.out.println("e) Potencia");
        System.out.println("f) Raiz Cuadrada");
        System.out.println("g) Salir");
        char opc = lector.next().charAt(0);
        switch (opc) {
            case 'a':
                System.out.println("1) Sumar");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                resultado = valorA + valorB;
                System.out.println("La suma de: " + valorA  + " + " + valorB + " es: " + resultado);
                
                break;
            case 'b':
                System.out.println("2) Restar");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                resultado = valorA - valorB;
                System.out.println("La diferencia de: " + valorA  + " - " + valorB + " es: " + resultado);

                break;
            case 'c':
                System.out.println("3) Multiplicar");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                resultado = valorA * valorB;
                System.out.println("El producto de: " + valorA  + " * " + valorB + " es: " + resultado);

                break;
            case 'd':
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
            
                case 'e':
                System.out.println("5) Potencia");
                System.out.println("Ingrese a: ");
                valorA = lector.nextDouble();
                System.out.println("Ingrese b: ");
                valorB = lector.nextDouble();
                double potencia = Math.pow(valorA, valorB);
                System.out.println("Su resultado e: " + potencia);
                break;
                case 'f':
                System.out.println("6) Raiz Cuadrada");
                System.out.println("Ingrese el valor: ");
                valorA = lector.nextDouble();
                double raizCua = Math.sqrt(valorA);
                System.out.println("Su resultado e: " + raizCua);
                
                break;

            case 'g':
                System.out.println("Saliendo de la App");
                break;    
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        lector.close();
    }
}
