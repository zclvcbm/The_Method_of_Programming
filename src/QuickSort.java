/**
 * Created by Admin on 2016/7/18.
 */
public class QuickSort {
    public static void main(String[] args){
        int[] r = {43,4,23,675,235,234,53,8,35};
        quickSort(r,0,8);
        for(int i=0;i<9;i++) {
            System.out.print(r[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int[] r, int low, int high) {
        if(low<high) {
            int pos = quickPosi(r,low,high);
            quickSort(r,low,pos-1);
            quickSort(r,pos+1,high);
        }
    }

    public static int quickPosi(int[] r, int left, int right)
    /* 对记录数组r中的r[left]至r[rigth]部分进行一趟排序，并得到基准的位置，使得排序后的
       结果满足其之后（前）的记录均不小于（大于）基准记录 */
    {
        int x = r[left];
        int low = left;
        int high = right;
        while(low<high) {
            while(low<high && r[high]>=x){    /* high从右到左找小于x的记录 */
                high--;
            }
            if(low<high) {                    /* 找到小于x的记录，则进行交换 */
                r[low] = r[high];
                low++;
            }
            while (low<high && r[low]<=x){    /* low从左到右找到大于x的记录 */
                low++;
            }
            if(low<high){                     /* 找到大于x的记录，则进行交换 */
                r[high] = r[low];
                high--;
            }
        }
        r[low] = x;                           /* 将基准记录保存到low=high的位置 */
        return low;                           /* 返回基准记录的位置 */
    }
}
