public class Seleccion {
    public int[] selectionSort(int[] arreglo, boolean ascendente) {
        int tamanio = arreglo.length;
        // Recorrer el arreglo
        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) { 
                // Comparar según el orden deseado
                if (ascendente 
                ? arreglo[j] < arreglo[indice] 
                : arreglo[j] > arreglo[indice]) {
                    indice = j;
                }
            }
            // Intercambio del índice encontrado por el primero
            if (indice != i) { // Solo intercambiar si es necesario
                int aux = arreglo[indice];
                arreglo[indice] = arreglo[i];
                arreglo[i] = aux;
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}