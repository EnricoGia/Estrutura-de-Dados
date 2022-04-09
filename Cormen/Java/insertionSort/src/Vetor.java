

public class Vetor {
    int vetor[] = {4,7,2,1,3,6,2,1};
    


    void insertionSort(){
        int chave;
        int i;

        for(int j=1;j<this.vetor.length;j++){
            chave = this.vetor[j];
            i = j-1;
            while(i>-1 &&this.vetor[i]>chave){
                this.vetor[i+1] = this.vetor[i];
                i = i - 1;
            }
            this.vetor[i+1] = chave;
        }
        for(int j = 0;j<this.vetor.length;j++){
            System.out.print(" "+this.vetor[j]+",");
        }
    }
    
}
