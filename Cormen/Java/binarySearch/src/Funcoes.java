

final class Funcoes {

    public static int binarySearch(int[] array,int num, int start, int end){


        int mid = (end+start)/2;

        if(array[mid]==num)
            return mid;
            
        if(array[mid]<num)
            return (binarySearch(array,num,mid+1,end));

        if(array[mid]>num)
            return(binarySearch(array,num,start,mid-1));

        return -1;
    }
    
}
