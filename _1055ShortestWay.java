import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class _1055ShortestWay {

    public int shortestWay(String source, String target) {
        char[] cs = source.toCharArray(), ts = target.toCharArray();
        boolean[] map = new boolean[26];
        for (int i = 0; i < cs.length; i++)
            map[cs[i] - 'a'] = true;
        int j = 0, res = 1;
        for (int i = 0; i < ts.length; i++,j++) {
            if (!map[ts[i] - 'a']) return -1;
            while (j < cs.length && cs[j] != ts[i]) {
                j++;
            }
            if (j == cs.length) {
                j = -1;
                res++;
                i--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new _1055ShortestWay().shortestWay("abc","abcbc");
    }
}