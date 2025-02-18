

public class LargestArr{

    public static void main(String[] args) {
        int arr[] = new int[] {37,3,19,6,11,51};
        int max= arr[0];

        for(int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element in the Array: " + max);

    }
}