import org.junit.Test;

/**
 * Created by Admin on 2016/7/23.
 */
/*
子串变位词

给定两个串a和b，为b是否是a的子串的变位词。
例如输入a=hello，b=lel，lle，ello都是true，
但是b=elo是false。（国外某公司最新面试题）
 */
public class Anagrams {

    public static void main(String[] args){
        Anagrams anagrams = new Anagrams();
        System.out.println(anagrams.isAnagrams(null,"acbd"));   //false
        System.out.println(anagrams.isAnagrams("","acbd"));     //false
        System.out.println(anagrams.isAnagrams("abcd","acbd")); //true
        System.out.println(anagrams.isAnagrams("abcd","a"));    //true
        System.out.println(anagrams.isAnagrams("abcd","ba"));   //true
        System.out.println(anagrams.isAnagrams("abcd","aa"));   //false
        System.out.println(anagrams.isAnagrams("abcd","bade")); //false
    }

    public boolean isAnagrams(String source, String object){
        if(source==null || object==null)
            return false;
        int slen = source.length();
        int olen = object.length();
        if(olen>slen)
            return false;

        int numZero = 0;
        int flag[] = new int[26];
        //第一个窗口[0...olen-1]
        for(int i=0;i<olen;i++){
            int c = object.charAt(i)-'a';
            if(++flag[c]==1) {
                numZero++;
            }
        }

        for(int i=0;i<olen;i++){
            int c = source.charAt(i)-'a';
            flag[c]--;
            if(flag[c]==0)
                numZero--;
            else if(flag[c]==-1)
                numZero++;
        }
        if(numZero==0)
            return true;

        // 通过滑动窗口进行判断
        for(int i=olen;i<slen;i++){
            int c = source.charAt(i)-'a'; //窗口向前滑动新添加的一个元素
            if(++flag[c]==1)              //对新元素进行添加
                numZero++;
            c = i-olen;                   //窗口向前滑动删除的一个元素
            if(--flag[c]==0)              //对旧元素进行删除
                numZero--;
            if(numZero==0)                //标记数组全为0，表示滑动窗口中的子串与目标串为变位词
                return true;
        }
        return false;
    }
}
