import java.util.*;

class Main{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.print("Positive");
        }
        else if(n<0){
            System.out.print("Negative");
        }
        else
        {
            System.out.println("zero");
        }
        switch (n) {
            case '1':
                System.out.println("Sunday");
                break;
            case '2':
                System.out.println("Monday");
                break;  
            case '3':
                System.out.println("Tuesday");
                break;  
            case '4':
                System.out.println("Wednesday");
                break;
             case '5':
                System.out.println("Thursday");
                break;
            case '6':
                System.out.println("Friday");
                break;
            case '7':
                System.out.println("Saturday");
                break;
            default:
                System.out.println("total days in week is 7");
                break;
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+",");
        }
        while(n>=1){
            System.out.print(n);
            n--;
        }
        do{
            System.out.println(n);
            n++;
        }while(n<=3);


    }
}