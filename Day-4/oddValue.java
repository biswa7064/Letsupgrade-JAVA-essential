
public class oddValue{
     public static void main(String[] args) {
        int number[] = {35,38,98,99,21};
        int i;
        System.out.print("Numbers are : ");
        for (i=0;i<number.length;i++){
            System.out.print(number[i]+"  ");
                       
        }
        System.out.print("\n");
        System.out.print("Odd numbers are : ");
        for (i=0;i<number.length;i++){            
            if(number[i]%2 !=0 ){
                System.out.print(number[i]+"  ");
            }
        }
    }
}