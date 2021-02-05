public class Main {

    public static void main(String[] args) {
	// write your code here

        int i = 0;

        for (int j = 0; j < 10; j++) {
            i = add(i);
        }

        System.out.printf("i is now: %d\n", i);

        for (int j = i; j > 2; j--) {
            i = subtract(i);
        }

        System.out.printf("i is now: %d\n", i);
    }

    public static int add(int i){
        return ++i;
    }

    public static int subtract(int i) {
        i = i - 2;
        return i;
    }
}
