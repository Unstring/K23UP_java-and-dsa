import java.util.Hashtable;

public class hfcInString {

    public static void main(String[] args) {
        String str = "sumeethsukhreetdwipayan";
        
        // char hfc1 = getHFCusingVeriable(str);
        // char hfc2 = getHFCusingArray(str);
        char hfc3 = getHFCusingHashTable(str);

        System.out.println(hfc3);
    }

    private static char getHFCusingHashTable(String str) {
        Hashtable<Character, Integer> charTable = new Hashtable<Character, Integer>();
        for (char ch : str.toCharArray()) {
            if (charTable.get(ch) == null) {
                charTable.put(ch,1);
            }else{
                charTable.put(ch, charTable.get(ch) + 1);
            }
        }

        //iterate over hash table and get the max count return the character
        int maxCount = -1;
        char hfc = '\0';
        for (Character ch : charTable.keySet()) {
            if (maxCount < charTable.get(ch)) {
                maxCount = charTable.get(ch);
                hfc = ch;
            }
        }

        return hfc;
    }

    private static char getHFCusingArray(String str) {
        int[] chArr = new int[26];

        for (int ch : str.toCharArray()) {
            chArr[(int) ch - 97] ++;
        }

        int max = -1;
        int indexOfMax = -1;
        for (int i = 0; i < chArr.length; i++) {
            if (max < chArr[i]) {
                max = chArr[i];
                indexOfMax = i;
            }
        }

        return (char) (indexOfMax + 97);
    }

    private static char getHFCusingVeriable(String str) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;




        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            // write switch and case to check and incrementthe count of each character
        }
        return 'a';
    }
}