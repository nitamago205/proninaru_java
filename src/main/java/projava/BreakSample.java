package projava;

public class BreakSample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            }
            System.out.println("finish");
            break;
        }
    }
}
