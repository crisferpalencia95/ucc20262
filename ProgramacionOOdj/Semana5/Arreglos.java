public class Arreglos {
    public static void main(String[] args) {
        //Arreglo de números enteros
        int[] numeros = {6,5,9,8,3,2};

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("numero[" + i + "] = " + numeros[i]);
        }

        // Suma de los números del arreglo
        int suma = 0;
        for(int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("Suma de los números: " + suma);
    }   
}
