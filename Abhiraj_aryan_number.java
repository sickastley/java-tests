import java.io.*;
class Abhiraj_aryan_number {
    public static void main(String args[])throws IOException {
        
        BufferedReader subscribetotechnoblade = new BufferedReader
        (new InputStreamReader(System.in));
        
        int num, dup;
        int sum = 0;
        int product = 1;
        int dig;
        
        System.out.print("Enter any number: ");
        num = Integer.parseInt(subscribetotechnoblade.readLine());
        
        dup = num;
        
        while (num != 0) {
            dig = num % 10;
            sum = sum + dig;
            product = product * dig;
            num = num / 10;
        }
        
        if (sum == product) {
            System.out.println(dup + " is a Abhiraj aryan number.");
        }
        
        else {
            System.out.println(dup + " is not a Abhiraj aryan number.");
        
        }
    }
}
