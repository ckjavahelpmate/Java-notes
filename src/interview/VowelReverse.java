package interview;

public class VowelReverse {
    public static void main(String[] args) {
        String str = "Hello";
        char[] ch = str.toCharArray();
//        Keep 2 pointers one at left most and one at right most
//        move left pointer until we get vowel in lft side
        for (int i = 0, j = ch.length - 1; i < j; i++) {
//            Checking left side pointer character is vowel or not
            if (isVowel(ch[i])) {
//                Once we get left side vowel character move the right side pointer
//                to find right side vowel
//                make sure right pointer should not cross left pointer
//                move right side pointer until character is not vowel
                while (i < j && !isVowel(ch[j])) {
                    j--;
                }
//               once we find both left side and right side vowels swap them
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                j--;
            }
        }
        str = String.valueOf(ch);
        System.out.println(str);
    }

    public static boolean isVowel(char ch) {
        return switch (ch) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}
