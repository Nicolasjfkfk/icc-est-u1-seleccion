public class App {
    public static void main(String[] args) {
        System.out.println("Métodos de ordenamiento selección");
        Seleccion sel = new Seleccion();
        int[] arreglo = {2, 3, 4, 5, 19, 0};

        // Ordenar en orden ascendente
        sel.selectionSort(arreglo, true);
        System.out.print("Arreglo ordenado (ascendente): ");
        sel.printArreglo(arreglo); // Imprimir el arreglo ordenado

        // Ordenar en orden descendente
        sel.selectionSort(arreglo, false);
        System.out.print("Arreglo ordenado (descendente): ");
        sel.printArreglo(arreglo); 
    }
}