import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Crear un vector de 15 números enteros
        int[] vector = new int[15];

        // Llenar el vector validando números entre 10 y 100
        for (int i = 0; i < vector.length; i++) {

            int numero;

            do {
                System.out.print("Ingrese el numero " + (i + 1) + " (entre 10 y 100): ");
                numero = scanner.nextInt();

                if (numero < 10 || numero > 100) {
                    System.out.println("Numero fuera del rango. Debe estar entre 10 y 100.");
                }

            } while (numero < 10 || numero > 100);

            vector[i] = numero;
        }

        // Mostrar el vector
        System.out.println("\nVector ingresado:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println();

        // 2. Buscar un valor en el vector
        System.out.print("\nIngrese un numero para buscar: ");
        int buscar = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == buscar) {
                System.out.println("El numero " + buscar
                        + " se encuentra en la posicion " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero " + buscar
                    + " no se encuentra en el vector.");
        }

        // 3. Encontrar el mayor y el menor
        int mayor = vector[0];
        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {

            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        System.out.println("\nEl numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        // 4. Identificar multiplos de un numero X
        System.out.print("\nIngrese un numero X para buscar sus multiplos: ");
        int x = scanner.nextInt();

        boolean hayMultiplos = false;

        System.out.println("Multiplos de " + x + " encontrados en el vector:");

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] % x == 0) {
                System.out.print(vector[i] + " ");
                hayMultiplos = true;
            }
        }

        if (!hayMultiplos) {
            System.out.println("No hay multiplos de " + x + " en el vector.");
        } else {
            System.out.println();
        }

        // 5. Calcular la suma de todos los valores
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }

        System.out.println("\nLa suma total de los valores es: " + suma);

        // 6. Calcular el promedio
        double promedio = (double) suma / vector.length;

        System.out.println("El promedio de los valores es: " + promedio);

        // Contar cuantos números están por encima del promedio
        int cantidadMayores = 0;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > promedio) {
                cantidadMayores++;
            }
        }

        // Crear un nuevo vector con los números mayores que el promedio
        int[] vectorMayores = new int[cantidadMayores];

        int posicion = 0;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > promedio) {
                vectorMayores[posicion] = vector[i];
                posicion++;
            }
        }

        // Mostrar el nuevo vector
        if (cantidadMayores > 0) {

            System.out.println("\nNumeros por encima del promedio:");

            for (int i = 0; i < vectorMayores.length; i++) {
                System.out.print(vectorMayores[i] + " ");
            }

            System.out.println();

            System.out.println("Cantidad de numeros por encima del promedio: "
                    + cantidadMayores);

        } else {

            System.out.println("\nNo hay numeros mayores que el promedio.");
        }

        scanner.close();
    }
}