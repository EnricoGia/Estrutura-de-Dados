
public class App {
    public static void main(String[] args) {
        int[] a = { 38,27,43,3,9,82,10 };

        System.out.println("----- Array Inicial -----");
        Funcoes.mostraArray(a);

        System.out.println("----- Arrays Intermediários -----");
        Funcoes.mergeSort(a, 1, a.length);

        System.out.println("----- Array Final -------");
        Funcoes.mostraArray(a);

    }
}
