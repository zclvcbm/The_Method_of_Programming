/**
 * Created by Admin on 2016/7/18.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] r = {0,43,53,234,53,2,54,75,89};
        bubbleSort2(r,8);
        for(int i=1;i<9;i++) {
            System.out.print(r[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort2(int[] r, int length) {
        int n = length;
        boolean change = true;
        for(int i=1;i<=n-1;i++) {
            change = false;
            for(int j=1;j<=n-i;j++) {
                if(r[j+1]<r[j]){
                    int temp = r[j];
                    r[j] = r[j+1];
                    r[j+1] = temp;
                    change = true;
                }
            }
        }
    }
}
