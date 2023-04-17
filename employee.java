import java.util.*;  
class employee {
    int eNo;
    String eName;
    int eSalary;
    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : "); 
        eName = sc.nextLine();
        System.out.print("Enter monthly salary : "); 
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display(){
        System.out.println("Details of the employee are:- " );
        System.out.println("Name : "+ eName );
        System.out.println("Salary : "+ eSalary );
    }
    public static void main(String []args){
        int i,n;
        int No,flag=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        n=sc.nextInt();
        employee emp[] = new employee[n];
        for(i=0;i<n;i++){
            emp[i] = new employee();
            emp[i].read();
        }
        System.out.println("Search"); 
        while(flag==0){
            System.out.print("Enter ID : "); 
            No =sc.nextInt();
            for(i=0;i<n;i++){
                if(emp[i].eNo == No){
                    emp[i].display();
                    flag=1;
                    break;
                }
            }
        if(flag==0) {
         System.out.println("Invalid entry!!Try again..");
        }
    }
  }
}
