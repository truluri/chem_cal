import java.util.Scanner;

public class main {
    


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

           int n = sc.nextInt();

           int a = n % 2;
        

            if(a == 1)
            {
                System.out.println("Alice");
        }

             else  {
                System.out.println("Bob");
            }   
            


        }

}
