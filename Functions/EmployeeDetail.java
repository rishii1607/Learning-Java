import java.util.*;

public class EmployeeDetail {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ID , Name , Age");
        int id=sc.nextInt();
        String name=sc.next();
        int age=sc.nextInt();
        getEmpDetail(id,name,age,false);
    }

    public static void getEmpDetail(int id,String name,int age,boolean empCheck) {
        if(empCheck == true){
        System.out.println("<--------Employee Details-------->");
        System.out.println("ID:-"+id);
        System.out.println("Name:-"+name);
        System.out.println("Age:-"+age);
        }
        else{
            System.out.println("not match");
        }
    }
}