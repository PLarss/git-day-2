public class Main {

    public static void main(String[] args) {
	// write your code here

        int i = 0;

        for (int j = 0; j < 10; j++) {
            i = add(i);
        }

        System.out.printf("i is now: %d", i);
    }

    public static int add(int i){
        return ++i;
    }
}
