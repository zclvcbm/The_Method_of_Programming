/**
 * Created by Admin on 2016/7/18.
 */
public class HeapSort {

    public static void shift(int[] r, int k, int m) {
        int t = r[k];           /* 暂存“根”记录 */
        int i=k;
        int j=2*i;
        boolean finished = false;
        while(j<=m && !finished){
            if(j<m && r[j+1]>r[j])      /* 若存在右子树，且右子树根的值比左子树大，则沿右分支“筛选” */
                j = j+1;
            if(t>=r[j])                 /* 筛选完毕 */
                finished = true;
            else{                       /* 继续筛选 */
                r[i] = r[j];
                i = j;
                j = 2*i;
            }
            r[i] = t;                   /* r[k]填入到恰当的位置 */
        }
    }
    public static void crt_heap(int[] r, int length) {
        int n = length;
        for(int i=n/2;i>=1;i--){
            shift(r,i,n);
        }
    }
    public static void heapSort(int[] r, int length){
        crt_heap(r,length);
        int n = length;
        for(int i=n;i>=2;i--) {
            int b = r[1];               /* 将堆顶记录和堆中的最后一个记录互换 */
            r[1] = r[i];
            r[i] = b;
            shift(r,1,i-1);             /* 进行调整，使r[1...i-1]变成堆 */
        }
    }

    public static void main(String[] args){
        int[] r = {0,43,53,234,53,2,54,75,89};
        heapSort2(r,8);
        for(int i=1;i<9;i++) {
            System.out.print(r[i]+" ");
        }
        System.out.println();
    }

    public static void shift2(int[] r, int k ,int m) {
        int t = r[k];
        int i=k;
        int j=2*i;
        boolean finished = false;
        while(j<=m && !finished) {
            if(j<m && r[j+1]>r[j])
                j = j+1;
            if(t>=r[j])
                finished = true;
            else{
                r[i] = r[j];
                i = j;
                j = 2*i;
            }
            r[i] = t;
        }
    }

    public static void crt_heap2(int[] r, int length){
        int n = length;
        for(int i=n/2;i>=1;i--){
            shift2(r,i,n);
        }
    }

    public static void heapSort2(int[] r, int length) {
        crt_heap2(r,length);
        int n = length;
        for(int i=n;i>=2;i--) {
            int b = r[i];
            r[i] = r[1];
            r[1] = b;
            shift(r,1,i-1);
        }
    }
}
