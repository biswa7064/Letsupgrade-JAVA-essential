import java.util.Scanner;
public class gradeCalculate{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter mark of first subject : ");
int s1 = scan.nextInt();
System.out.println("Enter mark of second subject : ");
int s2 = scan.nextInt();
System.out.println("Enter mark of third subject : ");
int s3 = scan.nextInt();
System.out.println("Enter mark of fourth subject : ");
int s4 = scan.nextInt();
System.out.println("Enter mark of fifth subject : ");
int s5 = scan.nextInt();

float sum = s1+s2+s3+s4+s5;
float percentage = sum/5;

System.out.println("The percentage is : "+percentage);

if (percentage >= 80){
System.out.println("The grade is : A");
}
else if (percentage >= 60 && percentage < 80 ){
System.out.println("The grade is : B");
}
else if (percentage >= 40 && percentage < 60){
System.out.println("The grade is : C");
}
else {
System.out.println("The grade is : D");
}
}
}

