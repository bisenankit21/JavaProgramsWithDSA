package practice;

public class BinarySearchToFindElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int num = 8;
        int resultIndex = binarySearchToFindIndexOfElement(arr, num);
        System.out.println(resultIndex);
    }

    private static int binarySearchToFindIndexOfElement(int[] arr, int num) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==num){
                return mid;
            }
            if(num>arr[mid]){
                i=mid+1;
            }
            if(num<arr[mid]){
                j=mid-1;
            }
        }
        return -1;
    }
}
