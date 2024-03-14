public class Main {
    public static void main(String[] args) {
        int[] vet = {0,1,2,3,4,5,6,7,8,9};
        int[] vet2 = {1,2,3,4,5,6,7,8,9};

        binarySearch(vet2, vet2.length, 5, 0);

    }

    public static boolean binarySearch(int[] vetor, int start, int target, int count){
        count = start;
        int index = start/2;
        if (vetor[index]==target){
            System.out.println(vetor[index]);
            return true;
        } else {
            if(vetor[index]<target){
                count++;
                binarySearch(vetor, count++, target, count);
            } else if (vetor[index]>target){
                count--;
                binarySearch(vetor,count--, target, count);
            }
        }
        return false;
    }
}