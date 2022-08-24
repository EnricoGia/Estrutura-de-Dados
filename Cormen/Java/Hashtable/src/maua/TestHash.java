package maua;

public class TestHash {

    public static void main(String[] args) {
        Integer N = 100000; // N do exercicio
        Integer[] tabKeys = new Integer[N];
        SList[] tabHash = new SList[1000];

        for (Integer i = 1; i < N; i++) {
            tabKeys[i] = i;
        }
        for (Integer i = 1; i < N; i++) {
            toSList(i, tabHash);
        }

        Integer indice = 0;

        for (SList i : tabHash) {
            System.out.print("[" + indice + "]");
            if (i.proximo != null) {
                SList no = i;
                do {
                    System.out.print(" -> " + no.value);
                    no = no.proximo;
                } while (no.proximo != null);
                System.out.println(" -> " + no.value);
            } else {
                System.out.println(" -> " + i.value);
            }
            indice++;
        }
    }

    public static void toSList(Integer key, SList[] vetor) {
        SList node = new SList(key);
        node.InsereInicio(hash(key), vetor);
    }

    public static Integer hash(Integer key) {
        return (key % 10);
    }

}