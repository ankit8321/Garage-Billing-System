import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageService garageService=new GarageService();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("----------------Raj Service Centre---------------");
            System.out.println("1. Add customer");
            System.out.println("2. Display Services");
            System.out.println("3. Exit");
            System.out.println("4. Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the customer name:");
                    String name=sc.next();
                    System.out.println("Enter phone number:");
                    String phone=sc.next();
                    System.out.println("Enter car NUmber:");
                    String carNum=sc.next();
                    System.out.println("Enter car Model");
                    String model=sc.next();
                    garageService.addCustomer(name,phone,carNum,model);
                    break;
                case 2:
                    System.out.println("Enter the car number:");
                    String carNo=sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting.........Thank You");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
