import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class ageSalaryTax{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter your name : ");
String name = scan.nextLine();

System.out.print("Please enter date of birth in YYYY-MM-DD: ");
String dateofBirth = scan.nextLine(); 
LocalDate dob = LocalDate.parse(dateofBirth);

System.out.println("Enter your monthly salary : ");
float monthSalary = scan.nextFloat();
float annualSalary = monthSalary * 12;
float tax;

System.out.println("Your name is : "+name);
System.out.println("Your annual salary is  : "+annualSalary);
System.out.println("Age is:" + getAge(dob));

if(annualSalary >= 500000){
tax = annualSalary*20/100;
System.out.println("Tax is "+tax);
}
else  if(annualSalary >= 400000 && annualSalary < 500000 ){
tax = annualSalary*15/100;
System.out.println("Tax is "+tax);
}
else if(annualSalary >= 300000 && annualSalary < 400000){
tax = annualSalary*10/100;
System.out.println("Tax is "+tax);
}

else if(annualSalary >= 500000 && annualSalary < 300000){
tax = annualSalary*5/100;
System.out.println("Tax is "+tax);
} 
}
    
    public static int  getAge(LocalDate dob){
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }
 
}




