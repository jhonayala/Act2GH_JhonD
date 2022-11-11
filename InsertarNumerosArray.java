public class InsertarNumerosArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        InsertarNumeros(array);
        MostrarArray(array);
        ContarRepeticiones(array);

    }

    public static void InsertarNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
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
