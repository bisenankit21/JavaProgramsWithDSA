package practice;

public class FabonocciSeriesTillNNumber {
    public static void main(String[] args) {
        int num = 7;
        int[] result = fabonoccie(num);
        for (int a: result){
            System.out.println(a);
        }
    }

    private static int[] fabonoccie(int num) {
        int[] fabArray = new int[num];
        if(num>=1){
            fabArray[0]=1;
        }
        if(num>=2){
            fabArray[1]=1;
        }

        for(int i=2;i<num;i++){
            fabArray[i]=fabArray[i-1]+fabArray[i-2];
        }
        return fabArray;
    }
}
