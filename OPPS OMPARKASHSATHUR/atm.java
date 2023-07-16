import java.util.*;
 class atm{

    public static void main(String[]args)
    {
        atm obj=new atm();
        obj.checkpin();
    }


    float balance=1000;
    int PIN = 0000;

    public void checkpin()
  {
    System.out.println("ENTER YOUR PIN");
    Scanner sc= new Scanner(System.in);
    int enteredpin = sc.nextInt();
    if(enteredpin==PIN)
    {
        menu();
    }
    else
    {
        System.out.println("PLEASE ENTER THE VALID PIN");
        
    }
  }
  public void menu(){
     System.out.println("ENTER YOUR CHOICE");
     System.out.println("1.CHECK YOUR A/C BALANCE");
     System.out.println("2.WITHDRAW AMOUNT");
     System.out.println("3.DEPOSITE AMOUNT");
     System.out.println("4.EXIT");
     Scanner sc=new Scanner(System.in);
     int opt=sc.nextInt();

     if(opt== 1)
     {
        checkBalance();
    
     }
     else if (opt==2)
     {
        withdrawMoney();
     }
     else if(opt ==3)
     {
        depositMoney();
     }
     else if(opt ==4)
     {
        return;
     }
     else
      {
        System.out.println("ENTER THE VALID CHOICE");
        
      }
  }

        public void checkBalance()
        {
            System.out.println("BALANCE:"+balance);
            menu();
            
        }
        public void withdrawMoney()
        {
            System.out.println("enter amount to withdraw =");
            Scanner sc= new Scanner(System.in);
            float amount=sc.nextFloat();
            if(amount>balance)
            {
                System.out.println("Insufficient balance");
            }
            else
            {
                balance=balance-amount;
                System.out.println("MONEY WITHDRAWL SUCCESSFULL");
            }
            
        }
        public void depositMoney()
        {
            System.out.println("enter amount =");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            balance=balance+amount;  
            System.out.println(" Money Deposite Successfully");
        
        }
        public void checkbalance()
        {
            System.out.println("BALANCE:"+balance);
        
        }


  }
 

