public class FirstOccurence {
    public static int FirstOccurence(int arr[], int key, int i) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccurence(arr, key, i - 1);
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2,6, 3, 6, 2, 6, 7 };
        System.out.println(FirstOccurence(arr, 6,arr.length));
    }
}
