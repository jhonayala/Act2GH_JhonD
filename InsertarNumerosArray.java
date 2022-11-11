public class InsertarNumerosArray {
    public static void main(String[] args) {
        int[] array = InsertarNumeros();

        MostrarArray(array);
        ContarRepeticiones(array);
    }

    public static int[] InsertarNumeros() {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);

        }
        return array;
    }

    public static void MostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print("[" + array[i] + "] ");

        System.out.println("");

    }

    public static void ContarRepeticiones(int[] array) {
        for (int j = 0; j < 11; j++) {
            int c = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == j) {
                    c++;

                }

            }
            if (c > 0)
                System.out.println("El numero " + j + " se repite " + c + " veces.");
        }
    }
}
