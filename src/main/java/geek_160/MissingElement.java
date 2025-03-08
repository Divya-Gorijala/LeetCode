package geek_160;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,5};
            // code here
            int n = arr.length + 1;
            boolean[] found = new boolean[n + 1];

            for (int num : arr) {
                found[num] = true;
            }

            for (int i = 1; i <= n; i++) {
                if (!found[i]) {
                    System.out.println(i);
                    return ;}
            }
        }
}
