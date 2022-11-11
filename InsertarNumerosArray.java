public class InsertarNumerosArray {
    public static void main(String[] args) {
        int[] array = InsertarNumeros();

        MostrarArray(array);
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
    }
}
