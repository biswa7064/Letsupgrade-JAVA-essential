 public class employee{
public String name,city;
public int age;

 void showDetails(){
System.out.println("The name is "+name);
System.out.println("The age is "+age);
System.out.println("The city is "+city);
	}

public static void main(String[] args){
employee e1 = new employee();
e1.name = "Biswa";
e1.age = 23;
e1.city = "Kalahandi";

employee e2 = new employee();
e2.name = "Pragyan";
e2.age = 21;
e2.city = "Bhubaneswar";
}
}