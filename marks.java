import java.util.*;
public class marks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input;
        System.out.print("Enter marks:");
        do{
            int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("Excellent");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("Very Good");
            }
            else if(marks>=30 && marks<=59){
                System.out.println("Good");
            }
            else if(marks>=0 && marks<=29){
                System.out.println("Work Harder");
            }
            else{
                System.out.println("Inavlid");
            }
            System.out.println("Want to continue or not YES(1) or NO(2)");
            input=sc.nextInt();
        }
        while(input==1); 
        System.out.println("ended");
    }
}

