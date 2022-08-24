package maua;

public class TestHashC {
    public static void main(String[] args) {
        Integer[] tabChaves = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14 };
        Integer[] tabHash = new Integer[10];

        for (Integer i : tabChaves) {

            tabHash[rehashing(tabHash, hash(i))] = i;
        }

        for(Integer i : tabHash){
            System.out.print(i + " ");
        }
    }

    public static Integer hash(Integer chave) {
        return (chave % 10);
    }

    public static Integer rehashing(Integer[] tabhash, Integer indice) {
        for (Integer i = indice + 1; i < tabhash.length; i++) {
            if (tabhash[i] == null)
                return i;
        }
        for (Integer i = 0; i < indice; i++) {
            if (tabhash[i] == null)
                return i;
        }
        return null;
    }
}
