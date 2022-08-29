public class App {

    public static void heapsort(int vetor[]) {
        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(vetor, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;

            heapify(vetor, i, 0);
        }
    }

    public static void heapify(int vetor[], int n, int i) {
        int maior = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && vetor[l] > vetor[maior])
            maior = l;

        if (r < n && vetor[r] > vetor[maior])
            maior = r;

        if (maior != i) {
            int aux = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = aux;

            heapify(vetor, n, maior);
        }
    }

    public static void mostraVetor(int vetor[]) {

        for (int elemento : vetor)
            System.out.print(elemento + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int vetor[] = { 12, 11, 13, 5, 6, 7 };

        mostraVetor(vetor);

        heapsort(vetor);

        mostraVetor(vetor);
    }
}