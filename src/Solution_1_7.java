import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016/7/14.
 */
public class Solution_1_7 {

    // 采用表存储字符串中字符出现次数
    public static char firstOnceTimeChar(String str) {
        if(str==null || str.length()==0)
            return 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==null)
                map.put(str.charAt(i),1);
            else
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1)
                return str.charAt(i);
        }
        return ' ';
    }

    // 采用数组存储字符串中字符出现次数 数组下标对应字符ASCLL码
    public static char firstOnceTimeChar1(String str){
        int[] counts = new int[256];
        for(int i=0;i<str.length();i++) {
            counts[str.charAt(i)]++;
        }
        int i;
        for(i=0;i<256;i++){
            if(counts[i]==1)
                return (char)i;
        }
        return (char)i;
    }

    public static void main(String[] args){
        System.out.println(firstOnceTimeChar("abbaccdefff"));
        System.out.println(firstOnceTimeChar1("abbaccdefff"));
        System.out.println(firstOnceTimeChar(null));
        System.out.println(firstOnceTimeChar(""));
    }
}
