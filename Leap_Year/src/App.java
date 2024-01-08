import java.util.Scanner;

public class App {

  
    public static void main(String[] args) throws Exception {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter the year");
        int year = myScanner.nextInt();

        boolean isLeapYear;

    
    isLeapYear = (year % 4 == 0);

    
    isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

    if (isLeapYear) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
        
    }
    myScanner.close();
}
}
