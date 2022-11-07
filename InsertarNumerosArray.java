public class InsertarNumerosArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        InsertarNumeros(array);
        MostrarArray(array);
    }

    public static void InsertarNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 + 1));
        }
    }
    public static void MostrarArray(int [] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print("[" + array[i] + "] ");
    }
}
