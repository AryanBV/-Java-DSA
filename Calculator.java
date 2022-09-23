import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the First number: ");
       int a = sc.nextInt();
       System.out.println("Enter the second number: ");
       int b = sc.nextInt();
       System.out.println("Enter the operator: ");
       char operator = sc.next().charAt(0);
       
       switch(operator) {
        case '+' : System.out.println(a + b);
                  break;
        case '-' : System.out.println(a - b);
                  break;
        case '*' : System.out.println(a * b);
                  break;
        case '/' : System.out.println(a / b);
                  break;
        case '%' : System.out.println(a % b);
                  break;
        default : System.out.println("Wrong operator");        
                                
       }

       }
       
            

    }
