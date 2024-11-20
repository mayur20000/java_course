package BasicsOfJava.String;

public class StartsWith {
    public static void main(String[] args) {
        String words[] = {"attentive", "attention", "atraction", "attack", "practce", "boolean"};
        String pref = "at";

        int ans = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref))
                ans++;
        }
        System.out.println(ans);
    }
}
