/**
 * Created by Admin on 2016/7/14.
 */
public class InsertSort {

    public static void main(String[] args){
        int[] array = {0,3,14,5,2,42,34,23};
        sort(array,array.length-1);
        for(int i=1;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void sort(int[] r, int length) {
    /* 对记录数组r做直接插入排序，length为数组中待排序记录的数目 */
        for(int i=2;i<=length;i++){
            r[0] = r[i]; /* 将待插入记录存放到监视哨r[0]中 */
            int j = i-1;
            while(r[0]<r[j]){ /* 寻找插入位置 */
                r[j+1] = r[j];
                j--;
            }
            r[j+1] = r[0]; /* 将待插入记录插入到已排好序的序列中 */
        }
    }
}
