public class App {
    public static void main(String[] args) throws Exception {
        int [] array = {1,2,3,4,5,6,7,8,9};

        int resultado = Funcoes.binarySearch(array, 10, 0, array.length-1);

        System.out.println(resultado);
        
    }
}
