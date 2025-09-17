import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID =sc.nextInt();
        String Dept = sc.next();

        switch(empID){
            case 1:
                System.out.println("Sakshi");
                break;
            case 2:
                System.out.println("Min");
                break;
            case 3:
                switch(Dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department");


                } break;
                default:
                    System.out.println("No empID found");
        }



        //  String fruit = sc.next();
        // switch (fruit){
        //     case "Mango":
        //         System.out.println("The king of the fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A red juicy fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small green green balls");
        //         break;
        //     default:
        //         System.out.println("Please enter the valid number.");
        // }
        


        // int n = sc.nextInt();
        // int rev =0;
        // while(n>0){
        //     int l = n%10;
        //     rev = (rev*10) +l;
        //     n=n/10;
        // }
        // System.out.println(rev);




        // int n = sc.nextInt();
        // int target = sc.nextInt();
        // int count =0;

        // while(n>0){
        //     int l = n%10;
        //     if(l==target)  count++;
        //     n=n/10;
        // }
        // System.out.println(count);





        // char ch = sc.next().trim().charAt(0);

        // if(ch>='a' && ch<='z'){
        //     System.out.println("Lowercase");
        // }else{
        //     System.out.println("Uppercase");
        // }
    }
}