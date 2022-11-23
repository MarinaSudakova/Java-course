package Lesson_1;

/**
 * program
* short age = 10;
* int salary = 123456;
* float e = 2.7f;
* double pi = 3.1415;
* char ch = 's';
int[] arr = new int[10]
int[][] arr = new int[3][5];
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();

            Scanner iScanner = new Scanner(System.in);
       System.out.printf("name: ");
       String name = iScanner.nextLine();
       System.out.printf("Привет, %s!", name);
       iScanner.close();
   }

     Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();
}}

 */
public class program {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    
}