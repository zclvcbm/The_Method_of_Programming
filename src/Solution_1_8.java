/**
 * Created by Admin on 2016/7/14.
 */
public class Solution_1_8 {

    public static void main(String[] args) {
        System.out.println(removeSpecChar("They are students.","aeiou"));
    }

    public static String removeSpecChar(String source,String reg){
        StringBuilder sb = new StringBuilder();
        boolean[] flag = new boolean[256];
        for(int i=0;i<reg.length();i++)
        {
            flag[reg.charAt(i)] = true;
        }
        for(int i=0;i<source.length();i++) {
            if(!flag[source.charAt(i)]) {
                sb.append(source.charAt(i));
            }
        }
        return sb.toString();
    }
}
