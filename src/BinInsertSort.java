/**
 * Created by Admin on 2016/7/14.
 */
public class BinInsertSort {

    public static void main(String[] args){
        int[] array = {0,3,14,5,2,42,34,23};
        binInsertSort(array,array.length-1);
        for(int i=1;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void binInsertSort(int[] r, int length)
    /* 对记录数组r进行折半插入排序，length为数组的长度 */
    {
        for(int i=2;i<=length;i++) {
            int j = i-1;
            r[0] = r[i];
            int low = 1;
            int high = j;
            while(low<=high) {              /* 确定插入位置 */
                int mid = (low+high)/2;
                if(r[mid]<r[0]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
            for(int k=i-1;k>=low;k--) {     /* 记录依次向后移动 */
                r[k+1] = r[k];
            }
            r[low] = r[0];                  /* 插入记录 */
        }
    }
}
