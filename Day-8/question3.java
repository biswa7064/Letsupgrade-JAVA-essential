

public class question3 {
    public static void main(String[] args){
        EmployeeData[] obj = new EmployeeData[3];

        obj[0] = new EmployeeData();
        obj[1] = new EmployeeData();
        obj[2] = new EmployeeData();

        obj[0].setData("Biswa",23);
        obj[1].setData("Pragyan",21);
        obj[2].setData("Mamuni",21);

        obj[0].showData();
        obj[1].showData();
        obj[2].showData();
    }

}

class EmployeeData{
    String name;
    int age;
    public void setData(String name1, int age1){
        name = name1;
        age = age1;
    }

    public void showData(){
        System.out.println("Name is :"+name+" and age is :"+age);
    }
}
