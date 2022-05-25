import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



class EmployeeOperation 
{
    Employee em;
    
    void insertEmployee(Employee e)
    {
        this.em=e;
        
        em.getName();
        em.getempId();
        em.getSalary();
       
        try
        {
            
            FileOutputStream inwrite=new FileOutputStream("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\employee.txt",true);
            PrintWriter writer=new PrintWriter(inwrite);
            
            writer.print(em.getName());
            writer.print("\t");
            writer.print(em.getempId());
            writer.print("\t");
            writer.print(em.getSalary());
            writer.println();
            
           
            writer.close();
            
            
        }
        catch(Exception ei)
        {
            System.out.println("Exception found"+ei);
        }
        

    }
    Employee getEmployee(int empId) throws FileNotFoundException, IOException
    {
        String str4=String.valueOf(empId);
    
       FileReader fr=new FileReader("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\employee.txt");
           
       Scanner sc=new Scanner(fr);
            int count=0;
            
    
   while (sc.hasNext()){
       String name=sc.next();
       String id=sc.next();
       double salary=sc.nextDouble(); 
       
      if(id.equals(str4))
      {
          System.out.println();
          System.out.print(name);
          System.out.print("\t");
          System.out.print(id);
          System.out.print("\t");
          System.out.print(salary);
          
          count++;
          
          
      }
        
    }
    if(count==0)
        {
            System.out.println("you have entered wrong id");
        }

    

   sc.close();
   return em;
    }
    void showAllEmployees() throws FileNotFoundException
    {
        File file=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\employee.txt");
        try
    {
        file.createNewFile();
        //System.out.println("file created");
    }
    catch(Exception e)
    {
        System.out.println("error!!");
    }
         
            Scanner scan=new Scanner(file);
            while(scan.hasNextLine())
            {
            System.out.println(scan.nextLine());
            }
    }
}
class Bank 
{
    Customer customer[];
    Employee employee[];
    
}
class CustomerOperations 
{
    Customer cm;
    void insertCustomer(Customer c)
    {
        this.cm=c;
        c.getName();
        c.getNid();
       
         try
        {
            
            FileOutputStream inwrite=new FileOutputStream("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\customer.txt",true);
            PrintWriter writer=new PrintWriter(inwrite);
           
            writer.print(cm.getName());
            writer.print("\t");
            writer.print(cm.getNid());
            writer.print("\t");
            writer.print(cm.show());
            writer.println();
            
           
            writer.close();
            }
        catch(Exception ef)
        {
            System.out.println("Exception found"+ef);
        }}
    Customer getCustomer(int nid) throws FileNotFoundException, IOException
    {
        String str4=String.valueOf(nid);
    
       FileReader fr=new FileReader("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\customer.txt");
          
           Scanner sc=new Scanner(fr); 
     
    int count=0;
   while (sc.hasNext()){
      String name=sc.next();
      String id=sc.next();
      String account=sc.next();
      if(id.equals(str4))
      {
      
          System.out.println();
          System.out.print(name);
          System.out.print("\t");
          System.out.print(id);
          System.out.print("\t");
          System.out.print(account);
          
          count++;
            
    }
    
   
     }
     if(count==0)
    {
        System.out.println("you have entered wrong id");
    }
   return cm;
    }
    
        void showAllCustomers() throws FileNotFoundException
    {
        File file=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\customer.txt");
        try
    {
        file.createNewFile();
       //System.out.println("file created");
    }
    catch(Exception e)
    {
        System.out.println("error!!");
    }
        
            Scanner scan=new Scanner(file);
            while(scan.hasNextLine())
            {
            System.out.println(scan.nextLine());
            }
         
    }
        
        

}
abstract class Account
{
    int accountNumber;
    double balance;
    double interestRate;
  
    void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
        
    }
    int getAccountNumber()
    {
        return accountNumber;
    }
   
    void setBalance(double balance)
    {
        this.balance=balance;
    }
     double getBalance()
    {
      return balance;  
    }
    abstract void showInfo();
    
}
class FixedAccount extends Account
{
    int tenureYear;
    void setTenureYear(int tenureYear)
    {
        this.tenureYear=tenureYear;
    }
    int getTenureYear()
    {
        return tenureYear;
    }
    void showInfo()
    {

    }

    
     

   
}
class SavingsAccount extends Account
{
double interestRate;
void setInterestRate(double interestRate)
{
    this.interestRate=interestRate;
}
double getInterestRate()
{
    return interestRate;
}
void showInfo()
{

}

   
    
}

class AccountOperations 
{
    
    FixedAccount fa=new FixedAccount();
    SavingsAccount sa=new SavingsAccount();
  
  
   Scanner input=new Scanner(System.in);
    
   
    Account at;
    void insertAccount(Account a)
    {
        this.at=a;
        at.getAccountNumber();
        at.getBalance();
        System.out.println("press F:Fixed Account or press S:Saving Account");
        char digit=input.next().charAt(0);
        switch(digit)
        {
            case 'F':
                
                System.out.println("How many year do you want Fixed your account??");
                int tenureYear=input.nextInt();
                
                fa.setTenureYear(tenureYear);
                fa.getTenureYear();
                String interest="-";
                
                
                try{
                    FileOutputStream inwrite=new FileOutputStream("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt",true);
                    PrintWriter writer=new PrintWriter(inwrite);
                    writer.print(at.getAccountNumber());
                    writer.print("\t");
                    writer.print(at.getBalance());
                    writer.print("\t");
                    writer.print(fa.getTenureYear());
                     writer.print("\t");
                    writer.print(interest);
                    writer.println();
                    writer.close();
                    
                }
            catch(Exception ef1)
            {
                System.out.println("error");
            }
            break;
                case'S':
                    System.out.println("How much interest do you want to get??");
                    double interestR=input.nextDouble();
                    
                    sa.setInterestRate(interestR);
                    sa.getInterestRate();
                    String savings="savings";
                    try
                    {
                        FileOutputStream inwrite1=new FileOutputStream("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt",true);
                        PrintWriter writer1=new PrintWriter(inwrite1);
                        writer1.print(at.getAccountNumber());
                        writer1.print("\t");
                        writer1.print(at.getBalance());
                        writer1.print("\t");
                        writer1.print(savings);
                        
                        writer1.print("\t");
                        writer1.print(sa.getInterestRate());
                        writer1.println();
                        writer1.close();
                    }
                    
                    catch(Exception ef2)
                    {
                        System.out.println("error2");
                    }
                    
                break;
                
        }}
        
                      
    Account getAccount(int accountNumber) throws FileNotFoundException, IOException
    {
        String str4=String.valueOf(accountNumber);
    
       FileReader fr=new FileReader("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
            
       Scanner sc=new Scanner(fr);
       int count=0;
            
    
   while (sc.hasNext()){
       String accountNum=sc.next();
       double balance=sc.nextDouble();
       
       String year=sc.next();
       
       String interest=sc.next();
       
      if(accountNum.equals(str4))
      {
     System.out.println("\n");
     System.out.print(accountNum);
     System.out.print("\t");
     System.out.print(balance);
     System.out.print("\t");
     System.out.print(year);
     System.out.print("\t");
     System.out.print(interest);
     count++;
    }
    
   }
   if(count==0)
    {
        System.out.println("you have entered wrong account number");
    }
   return at;
    }
    void showAllAccounts() throws FileNotFoundException
    {
        File file=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
        try
    {
        file.createNewFile();
        //System.out.println("file created");
    }
    catch(Exception e)
    {
        System.out.println("error!!");
    }
        
            Scanner scan=new Scanner(file);
            while(scan.hasNextLine())
            {
            System.out.println(scan.nextLine());
            }
        
    }

    
}


class Customer 
{
    String name;
    int nid;
    Scanner scan=new Scanner(System.in);
    Account accounts[]=new Account[1];
    

    int show()
    {
        accounts[0]=new Account() {

            
            void showInfo() {
                throw new UnsupportedOperationException("Not supported yet"); 
            }
        };
        System.out.println("Insert customer Account number:");
        int str=scan.nextInt();
     accounts[0].setAccountNumber(str);
     return accounts[0].getAccountNumber();
     
    }
    
    void setName(String name)
    {
        
        this.name=name;
    }
    String getName()
    {
        
        return name;
    }
    void setNid(int nid)
    {
        this.nid=nid;
    }
    int getNid()
    {
        return nid;
    }

    
    
   
    }
class ITransactions extends Account
{
    double amount;
    void showInfo()
    {
        
    }
    void deposit(double amount) throws FileNotFoundException, IOException
    {
        this.amount=amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert your account number to deposit Money:");
        String accountNumber=sc.nextLine();
        
    
       File fr=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
       File n=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp.txt");
            
       
       FileWriter fw=new FileWriter("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp.txt",true);
       BufferedWriter bw=new BufferedWriter(fw);
       PrintWriter pw=new PrintWriter(bw);
         
       Scanner scan=new Scanner(fr);
            
    
   while (scan.hasNext()){
       
       String accountNum =scan.next();
       double balance=scan.nextDouble();
       String year=scan.next();
       String interest=scan.next();
       
       if(accountNum.equals(accountNumber))
      {
     balance=balance+amount;
     pw.print(accountNum);
     pw.print("\t");
     pw.print(balance);
     pw.print("\t");
     pw.print(year);
     pw.print("\t");
     pw.print(interest);
     pw.println();
     System.out.println("Current Balance:"+balance);
    }
      else{
     
     pw.print(accountNum);
     pw.print("\t");
     pw.print(balance);
     pw.print("\t");
     pw.print(year);
     pw.print("\t");
     pw.print(interest);
     pw.println();
      }
   }
       
   scan.close();
   pw.flush();
   pw.close();
   fr.delete();
   File dump=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
   n.renameTo(dump);
   
   
    
    }
    void withdraw(double amount) throws IOException
    {
        this.amount=amount;
         Scanner sc=new Scanner(System.in);
         System.out.println("Insert your account number to Withdraw Money:");
        String accountNumber=sc.nextLine();
        String str4=String.valueOf(accountNumber);
    
       File fr=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
       File n=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp.txt");
            
       FileWriter fw=new FileWriter("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp.txt",true);
          BufferedWriter bw=new BufferedWriter(fw);
          PrintWriter pw=new PrintWriter(bw);
         
        
       Scanner scan=new Scanner(fr);
            
    
   while (scan.hasNext()){
       String accountNum=scan.next();
       double balance=scan.nextDouble();
       String year=scan.next();
       String interest=scan.next();
       
      if(accountNum.equals(str4))
      {
     balance=balance-amount;
     pw.print(accountNum);
     pw.print("\t");
     pw.print(balance);
     pw.print("\t");
     pw.print(year);
     pw.print("\t");
     pw.print(interest);
     pw.println();
     
     System.out.println("Current Balance:"+balance);
    }
      else{
     pw.print(accountNum);
     pw.print("\t");
     pw.print(balance); 
     pw.print("\t");
     pw.print(year);
     pw.print("\t");
     pw.print(interest);
     pw.println();
      }
      
   }
   scan.close();
   pw.flush();
   pw.close();
   fr.delete();
   File dump=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
   n.renameTo(dump);
   
   
       
    }
    
    void transfer(Account a, double amount) throws IOException
    {
    
        this.amount=amount;
        Scanner s3=new Scanner(System.in);
        System.out.println("Insert account number to send Money:");
        String t1=s3.nextLine();
         
        System.out.println("Insert account number to receive Money:");
        String t2=s3.nextLine();
        
    
       File fr=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
       File n=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp.txt");
            
       FileWriter fw=new FileWriter("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp.txt",true);
          BufferedWriter bw=new BufferedWriter(fw);
          PrintWriter pw=new PrintWriter(bw);
         
       Scanner scan=new Scanner(fr);
            
    
   while (scan.hasNext()){
       
       String accountNum=scan.next();
       
       double balance=scan.nextDouble();
       String year=scan.next();
       String interest=scan.next();
       
       
      if(accountNum.equals(t1))
      {
          
     balance=balance-amount;
     pw.print(accountNum);
     pw.print("\t");
     pw.print(balance);
     pw.print("\t");
     pw.print(year);
     pw.print("\t");
     pw.print(interest);
     pw.println();
     
     System.out.println("Current Balance:"+balance);
    }
      else{
     
     pw.print(accountNum);
     pw.print("\t");
     pw.print(balance); 
     pw.print("\t");
     pw.print(year);
     pw.print("\t");
     pw.print(interest);
     pw.println();
      }
   }
   scan.close();
   pw.flush();
   pw.close();
   fr.delete();
   File dump=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
   n.renameTo(dump);
   
   
   
  File fr1=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
   File n1=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp1.txt");
     FileWriter fw1=new FileWriter("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\temp1.txt",true);
          BufferedWriter bw1=new BufferedWriter(fw1);
          PrintWriter pw1=new PrintWriter(bw1);  
          
    
    Scanner scan1=new Scanner(fr1);
        
         while (scan1.hasNext()){
       String accountNum1=scan1.next();
       double balance=scan1.nextDouble();
       String year=scan1.next();
       String interest=scan1.next();
       
      if(accountNum1.equals(t2))
      {
     balance=balance+amount;
     pw1.print(accountNum1);
     pw1.print("\t");
     pw1.print(balance);
     pw1.print("\t");
     pw1.print(year);
     pw1.print("\t");
     pw1.print(interest);
     pw1.println();
     
     
     System.out.println("Current Balance:"+balance);
    }
      else{
     pw1.print(accountNum1);
     pw1.print("\t");
     pw1.print(balance); 
     pw1.print("\t");
     pw1.print(year);
     pw1.print("\t");
     pw1.print(interest);
     pw1.println();
      }
         }
      scan1.close();
   pw1.flush();
   pw1.close();
   fr1.delete();
   File dump1=new File("Macintosh HD⁩\\Users⁩\\⁨marufhossain⁩\\Documents⁩\\⁨project⁩\\account.txt");
   n1.renameTo(dump1);
       
}
    }


class Employee
{

    String name;
    String empId;
    double salary;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    
    void setempId(String empId)
    {
        this.empId=empId;
    }
    String getempId()
    {
        return empId;
    }
    void setSalary(double salary)
   
    {
        this.salary=salary;
    }
    double getSalary()
    {
        return salary;
    }
}



public class Project {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int digit;
        

        Scanner input=new Scanner(System.in);
        Employee em=new Employee();
       do
       {
           System.out.println("\n");
           System.out.println("\n");
           System.out.println("press 1:Employee Management");
           System.out.println("press 2:Customer Management");
           System.out.println("press 3: Customer Account Management");
           System.out.println("press 4:Account Transaction");
           System.out.println("press 5:Exit");
          
          System.out.println("Enter a digit from 1 to 5");
        digit=input.nextInt();
         Scanner scan=new Scanner(System.in);
        switch(digit)
        {
            case 1:
               
                EmployeeOperation emp=new EmployeeOperation();
                
            System.out.println("press 1:Insert new Employee");
            System.out.println("press 2:Get Existing Employee by Id");
            System.out.println("press 3:Show all Employees");
            System.out.println("Enter a digit from 1 to 3");
            digit=input.nextInt();
            
            switch(digit)
            {
                case 1:
               
               System.out.println("Insert employee Name:");
               String str = scan.nextLine();
              
              
               em.setName(str);
              
               System.out.println("Insrt employee Id:");
               String str1=scan.nextLine();
               
               em.setempId(str1);
               System.out.println("Insert enployee salary:");
               double sal=scan.nextDouble();
               
               em.setSalary(sal);
               emp.insertEmployee(em);
               
               
               break;
               case 2:
                   System.out.println("Insert id to get Existing Employee:");
                    int str3=scan.nextInt();
                    emp.getEmployee(str3);
                   
            break;
            case 3:
            System.out.println("All Employees are:");
            emp.showAllEmployees();
            break;
            default:
            System.out.println("wrong digit, try again");
            }
            
            
            
            System.out.println("\n");
            break;
            case 2:
                CustomerOperations cmp=new CustomerOperations();
                Customer cm=new Customer();
            System.out.println("press 1:Insert new Customer");
            System.out.println("press 2:Get Existing Customer by Id");
            System.out.println("press 3:Show All Customer");
            System.out.println("Enter a digit from 1 to 3");
            digit=input.nextInt();
            switch(digit)
            {
                case 1:
               
                    System.out.println("Insert customer Name:");
               String str=scan.nextLine();
               
               cm.setName(str);
               System.out.println("Insert customer NID:");
               
               int str1=scan.nextInt();
               cm.setNid(str1);
               
               
               cmp.insertCustomer(cm);
               
               
               break;
               case 2:
            
            System.out.println("Insert NID to get Existing Customer:");
            int str4=scan.nextInt();
            cmp.getCustomer(str4);
            
            break;
            case 3:
           System.out.println("All Customers are:");
            cmp.showAllCustomers();
            break;
            default:
            System.out.println("wrong digit, try again");

            }
            

            
            System.out.println("\n");
            break;
            case 3:
            AccountOperations amp=new AccountOperations();
            FixedAccount fa=new FixedAccount();
            

            
            
            
            System.out.println("press 1:Insert New Account");
            System.out.println("press 2:Get Existing Account by Id");
            System.out.println("press 3:Show All Accounts");
            System.out.println("Enter a digit from 1 to 3");
            digit=input.nextInt();
            switch(digit)
            {
                
                case 1:
                
                
                   
                 System.out.println("Insert New Account:");
                 
                 int str=scan.nextInt();
               
                fa.setAccountNumber(str);
      
                System.out.println("Insert New Balance:");
                double str1=scan.nextDouble();
                fa.setBalance(str1);
                
                amp.insertAccount(fa);
                
                 break;
                       
                
            case 2:
            
            System.out.println("Insert account number to get Existing Account:");
            int str7=scan.nextInt();
            amp.getAccount(str7);
            
            break;
            case 3:
            System.out.println("All Accounts are:");
           
            amp.showAllAccounts();
            break;
            default:
            System.out.println("wrong digit, try again");


            
            }
            
            
            System.out.println("\n");
            break;
            case 4:
                ITransactions it=new ITransactions();
            
            System.out.println("press 1:Deposit Money");
            System.out.println("press 2:Withdraw Money");
            System.out.println("press 3:Transfer Money");
            System.out.println("Enter a digit from 1 to 3");
            digit=input.nextInt();
            switch(digit)
            {
                case 1:
             
              System.out.println("How much money do you want to deposit:");
              double srt=scan.nextDouble();
              it.deposit(srt);
              
              
              break;
              case 2:
           
            System.out.println("How much money do you want to Withdraw:");
            double str1=scan.nextDouble();
            it.withdraw(str1);
            break;
            case 3:
            
            System.out.println("How much money do you want to Transfer:");
            double str9=scan.nextDouble();
            it.transfer(it,str9);
            break;
            default:
            System.out.println("wrong digit, try again");



            }
            

            
            System.out.println("\n");
            break;
            case 5:
            System.out.println("Thank you for using this program");
            System.out.println("\n");
            break;
            default:
            System.out.println("wrong digit, try again");
        }
       }
       
          while(digit!=5); 


       }
        
    }
    

