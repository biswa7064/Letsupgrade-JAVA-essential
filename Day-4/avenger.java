import java.util.*;
public class avenger{
    Scanner scan=new Scanner(System.in);
    public String name;
    public String weapon;
    public String planet;
    public int age;
    public float power;
       
        public void getDetails(){

            System.out.println("Enter the name");
            name=scan.nextLine();
            System.out.println("Enter the age");
            age=scan.nextInt();
            System.out.println("Enter the weapon");
            weapon=scan.nextLine();
            System.out.println("Enter the power");
            power=scan.nextFloat();            
            System.out.println("Enter the planet");
            planet=scan.nextLine();
        }
         public void displayDetails(){

             System.out.println("the name is "+name+" and the age is "+age);
             System.out.println("the power is "+power+" and the planet is "+planet+" and the weapon is "+weapon);

         }
        
        public static void main(String[] args){
            avenger[] details = new avenger[5];
        
            for(int i = 0; i<5; i++){
                details[i] = new avenger();
                details[i].getDetails();
            }
        
            for(int i = 0; i<5; i++){           
                details[i].displayDetails();
            }
        }
}
