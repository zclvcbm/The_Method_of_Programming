import java.util.LinkedList;
import java.util.List;

/**
 * Created by Admin on 2016/7/19.
 */
public class SumOfkNumber {
    public static List<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args){
        SumOfkNumber sn = new SumOfkNumber();
        sn.sumOfkNumber(12,6);
    }

    public void sumOfkNumber(int sum, int n) {
        if(sum<=0 || n<=0)
        {
            return ;
        }
        if(sum==n){
            list.add(0,n);
            for (int i:list) {
                System.out.print(i+" ");
            }
            System.out.println();
            list.remove(0);
        }
        list.add(0,n);
        sumOfkNumber(sum-n,n-1); // 放n，前n-1个数填满sum-n
        list.remove(0);
        sumOfkNumber(sum,n-1);
    }
}
