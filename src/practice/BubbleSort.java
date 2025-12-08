package practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {3,4,1,6,3,9,7};
        int[] bubblesortArray = bubbleSort(intArray);
        for(int a: bubblesortArray){
            System.out.println(a);
        }
    }

    private static int[] bubbleSort(int[] intArray) {
        for(int i=0;i<intArray.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<intArray.length-i-1;j++){
                if(intArray[j]>intArray[j+1]){
                    int temp=intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return intArray;
    }
}
