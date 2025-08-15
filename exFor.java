public class exFor {
    public static void main(String[] args) {

        /*

        // Com FOR

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\nTabuada do: %d\n", i);

            for (int j = 1; j <= 10; j++) {
                System.out.printf("\n%d x %d = %d", i, j, (i * j));
            }

            System.out.println();
        }

        */

        // Com WHILE

        int i = 1;
        while (i <= 10) {
            System.out.printf("\nTabuada do: %d \n", i);

            int j = 1;
            while (j <= 10) {
                System.out.printf("\n%d x %d = %d", i, j, (i * j));
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
