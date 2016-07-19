import sun.awt.windows.WEmbeddedFrame;

/**
 * Created by Admin on 2016/7/19.
 */
/*
有一道百度的面试题大概是这样：有一群袋鼠去买电影票，
为了省票可以将小袋鼠放到大袋鼠的袋子里，并规定大袋
鼠的体重应该大于小袋鼠体重的二倍，并且大袋鼠只能装
一个小袋鼠，求出最少需要多少张票，输入为一群袋鼠的
体重，输入样例：【2 2 4 11】 输出：2
 */
public class DaisuBuyTicket {
    public static void main(String[] args){
//        int[] weights = new int[]{2,2,4,11};
        int[] weights = new int[]{2,2,3,4,5,6,7,8,9};
        //排序
        int count = 0;
        int i,j;
        i=0;
        int mid = weights.length/2;
        j = mid;
        while(j<weights.length && i<mid){
            if(weights[j]-weights[i]>=2)
            {
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(weights.length-count);
    }
}
