/**
 * Created by Admin on 2016/7/14.
 */
public class ShellInsertSort {

    public static void main(String[] args) {
        int[] array = {0,3,14,5,2,42,34,23};
        int[] delta = {4,2,1};
        shellSort1(array,array.length-1,delta,3);
        for(int i=1;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void shellInsert(int[] r, int length, int delta){
        for(int i=1+delta;i<=length;i++) {
            if(r[i]<r[i-delta]) {
                r[0] = r[i];
                int j;
                for(j=i-delta;j>0&&r[j]>r[0];j-=delta){
                    r[j+delta] = r[j];
                }
                r[j+delta] = r[0];
            }
        }
    }

    public static void shellSort(int[] r, int length, int delta[], int n){
        for(int i=0;i<=n-1;i++) {
            shellInsert(r,length,delta[i]);
        }
    }


    public static void shellInsert1(int[] r,int length, int delta) {
        for(int i=delta+1;i<=length;i++){
            if(r[i]<r[i-delta]){
                int j;
                r[0] = r[i];
                for(j = i-delta;j>0&&r[j]>r[0];j-=delta) {
                    r[j+delta] = r[j];
                }
                r[j+delta] = r[0];
            }
        }
    }

    public static void shellSort1(int[] r, int length, int[] delta, int n) {
        for(int i=0;i<=n-1;i++){
            shellInsert(r,length,delta[i]);
        }
    }
}
