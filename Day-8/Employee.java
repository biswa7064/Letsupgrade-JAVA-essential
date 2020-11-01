import java.util.Scanner;
class details{
    Scanner scan  = new Scanner(System.in);
    String name;
    int age;
    float salary;
    String designation;
    public void getDetails(){
        name = scan.nextLine();
        designation = scan.nextLine();
        age = scan.nextInt();
        salary = scan.nextFloat();

    }

    public void showDetails(){
        System.out.println("Name = "+name+" Age = "+age+" salary = "+salary+" designation  = "+designation);

    }

}


class employee1 extends details{

}

class employee2 extends details{


}





public class Employee {
    public static void main(String[] args){
        employee1 e1 = new employee1();
        e1.getDetails();
        e1.showDetails();
        employee2 e2 = new employee2();
        e2.getDetails();
        e2.showDetails();
    }
}
