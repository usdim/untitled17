//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] st = {-10, 0, -10, 0, -10};
        int c = 0;
        int m = 0;

        for (int i = 0; i < st.length; i++) {
            if (st[i] < 1) { c = 0;
                            }
            else c=c+1;

                if (c > m) {
                m = c;
            }
        }
        System.out.println(m);
    }
}