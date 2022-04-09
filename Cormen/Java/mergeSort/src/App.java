

public class App {
    public static void main(String[] args) throws Exception {
        int []a = {23,5,76,1,56,75,4,2};

        System.out.println("----- Array Inicial -----");
        Funcoes.mostraArray(a);

        Funcoes.mergeSort(a, 1, a.length );
        
        System.out.println("----- Array Final -------");
        Funcoes.mostraArray(a);
        
    }
}
