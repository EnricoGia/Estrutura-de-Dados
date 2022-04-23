
final class Funcoes {

    static void merge(int[] a, int p, int q, int r) { // Separa elementos de a (em outros 2 arrays) e depois os re-insere de forma ordenada
        int n1 = q - p + 1;
        int n2 = r - q;

        // al,ar = array (left) & array (right)

        int[] al = new int[n1 + 1];
        int[] ar = new int[n2 + 1];

        for (int i = 0; i <= n1 - 1; i++) {
            al[i] = a[p + i - 1];
        }
        for (int j = 0; j <= n2 - 1; j++) {
            ar[j] = a[q + j];
        }

        // Preenche a última posição dos arrays al e ar com "infinito"
        al[n1] = 999999999;
        ar[n2] = 999999999;
        mostraArray(al);
        mostraArray(ar);

        int i = 0;
        int j = 0;

        for (int k = p - 1; k <= r - 1; k++) {

            if (al[i] <= ar[j]) {
                a[k] = al[i];
                i = i + 1;
            }

            else {
                a[k] = ar[j];
                j = j + 1;
            }

        }   

    }

    static void mergeSort(int[] a, int p, int r) { // Aplica o algoritmo de mergeSort no array a
        // * p e r devem ser dados como posição indo de 1 até n (índice + 1);
        if (p < r) {
            int q = Math.abs((p + r) / 2);
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    static void mostraArray(int[] array) { // Mostra os elementos do vetor a

        System.out.print("----> ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println("");
        System.out.println("");
    }
}
