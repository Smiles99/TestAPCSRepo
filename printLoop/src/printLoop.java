public class printLoop {
    public static void printLoop(int n){
        int x = 0;
        int y = 1;
        while (n > 0) {
            while (x < n) {
                System.out.print(y);
                x++;
            }
            x = 0;
            n--;
            y++;
            System.out.println();
        }
    }
    public static void main(String[]args){
        printLoop(5);
    }
}