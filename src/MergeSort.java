/**
 * Created by Admin on 2016/7/18.
 */
public class MergeSort {

    public static void merge(int[] r1, int low, int mid, int high, int[] r2){
        /* 已知r1[low...mid] 和 r1[mid+1...high]分别按照关键字有序排列，将它们合并成一个有序序列，存放在r2[low...high] */
            int i=low;
            int j=mid+1;
            int k=low;
            while((i<=mid)&&(j<=high))
            {
                if(r1[i]<=r1[j])
                {
                    r2[k] = r1[i];
                    i++;
                }
                else{
                    r2[k] = r1[j];
                    j++;
                }
                k++;
            }
            while (i<=mid)
            {
                r2[k]=r1[i];
                k++;
                i++;
            }
            while(j<=high)
            {
                r2[k]=r1[j];
                k++;
                j++;
            }
    }

    public static void mSort(int[] r1, int low, int high, int[] r3){
        int[] r2 = new int[r1.length];
        if(low == high)
            r3[low]=r1[low];
        else{
            int mid = (low+high)/2;
            mSort(r1,low,mid,r2);
            mSort(r1,mid+1,high,r2);
            merge(r2,low,mid,high,r3);
        }
    }

    public static void mergeSort(int[] r, int n){
        mSort(r,1,n,r);
    }

    public static void main(String[] args){
        int[] r = {0,43,53,234,53,2,54,75,89};
        mergeSort(r,8);
        for(int i=1;i<9;i++) {
            System.out.print(r[i]+" ");
        }
        System.out.println();

    }

}
