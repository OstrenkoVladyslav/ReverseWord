// https://github.com/OstrenkoVladyslav/ReverseWord.git
package reverseword;

public class ReverseWord {

    public static void main(String[] args) {
        String str="Word";
        char[] ch = str.toCharArray();
        String new_str = new String(reverse(ch));
        System.out.println(new_str);
    }
    
    static char [] reverse(char [] ch){
        char[] new_array = new char [ch.length];
        int i = 0, j = 0;
        for (i=0, j=ch.length-1; j>=0; i++, j--) new_array[j]=ch[i];
        return new_array;
    }
}
