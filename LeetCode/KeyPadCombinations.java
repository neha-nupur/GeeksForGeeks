import java.util.*;


public class KeyPadCombinations {
    final static char[][] L = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        int len = digits.length();
        if(len == 0) {
            return result;
        }
        bfs(0, len, new StringBuilder(), digits, result);
        return result;
    }

    public void bfs(int pos, int len, StringBuilder sb, String digits, List<String> result){
        if(pos == len) {
            result.add(sb.toString());
        }
        else {
            char[] letters = L[Character.getNumericValue(digits.charAt(pos))];
            for(int i=0; i<letters.length; i++)
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), digits, result);
        }
    }

    public static void main(String[] args) {
        KeyPadCombinations sol = new KeyPadCombinations();
        String digits = "23";
        List<String> combinations = sol.letterCombinations(digits);
        System.out.println(combinations);
    }
    
}
