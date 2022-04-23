final class Funcoes {
    static void selectionSort(int[] array) {
        int i, j, m, swp = 0, n = array.length;

        for (i = 0; i < n - 1; i++) {
            m = i;
            for (j = i + 1; j < n; j++) {
                if (array[j] < array[m])
                    m = j;

            }
            swp = array[m];
            array[m] = array[i];
            array[i] = swp;
        }

    }

    static void mostraArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }

}
