import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //constructor
    public Email(String first, String last){
      this.firstName = first;
      this.lastName = last;
      System.out.println("EMAIL CREATED: " + firstName + " " + lastName);

      this.department = setDepartment();
    }

    //Ask for the department
    private String setDepartment(){
      System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
      Scanner in = new Scanner(System.in);
      int departmentChoice = in.nextInt();

      if(departmentChoice == 1){return "sales";}
      else if(departmentChoice == 2){return "dev";}
      else if(departmentChoice == 3){return "acct";}
      else{return "";}
    }

}
