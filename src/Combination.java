/**
 * Created by Admin on 2016/7/19.
 * 字符串的全组合
 */
public class Combination {
    public static void combination(char[] s){
        int len_j = s.length;
        int n_i = 1<<len_j;

        for(int i=1;i<n_i;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<len_j;j++){
                if( (i&(1<<j)) != 0){
                    sb.append(s[j]);
                }
            }
            System.out.print(sb+" ");
        }
    }

    public static void main(String[] args){
        char[] s = {'a','b','c'};
        Combination.combination(s);
    }
}
