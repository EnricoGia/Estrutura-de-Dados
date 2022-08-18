public class App {
    public static void main(String[] args) throws Exception {
        // Max-Heapfy em um heap representado por um vetor

        int[] vetor = {5, 3, 1, 2, 6, 10, 24, 3};

        System.out.print("Antes  : ");
        for(int i : vetor)
            System.out.print(i + " ");

        for(int i = vetor.length - 1 ; i>=0 ; i--)
            maxHeapify(vetor,i);

            System.out.print("\nDepois : ");
        
        for(int i : vetor)
            System.out.print(i + " ");
  
    }


    public static void maxHeapify(int[] A, int pai) {
        int pm1 = pai + 1;
        int esq = (pm1*2)-1;
        int dir = (pm1*2);
        int tamanho = A.length - 1;
        int maior = pai;

        if (esq <= tamanho && A[esq] > A[maior])
            maior = esq;
        if (dir <= tamanho && A[dir] > A[maior])
            maior = dir;
        if (maior != pai) {
            int aux = A[pai];
            A[pai] = A[maior];
            A[maior] = aux;
            maxHeapify(A, maior);
        }
    }
        }

