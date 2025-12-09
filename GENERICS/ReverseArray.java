// Create a generic method to reverse any array (Integer, String, Double).

public class ReverseArray{
    public static void main(String[] args) {
        reversingArray(new String[]{"a","b","d","c","f"});
        reversingArray(new Integer[]{1, 2, 3});
        reversingArray(new Double[]{1.1, 2.2, 3.3});

    }
    public static <T> void reversingArray(T[] arr){
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            T temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}