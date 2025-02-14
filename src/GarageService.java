import java.util.*;

public class GarageService {
     private Map<String,Customer> customerMap;
     private List<Service> availableService;

    public GarageService() {
        this.customerMap = new HashMap<>();
        this.availableService = new ArrayList<>();
        loadServices();
    }

    public void loadServices()
    {
        availableService.add(new Service("Paint",2000.0));
        availableService.add(new Service("Puncture",50.0));
        availableService.add(new Service("Wheel aligning",300.0));
        availableService.add(new Service("Car Wash",500.0));
        availableService.add(new Service("Oiling",700.0));
        availableService.add(new Service("New Tyre",3000.0));

    }


    public void addCustomer(String name,String phone,String carNumber,String model)
    {
        Car car=new Car(carNumber,model);
        Customer customer=new Customer(name,phone,car);
        customerMap.put(carNumber,customer);
        System.out.println("Customer added successfully!");
    }

    public void createInvoice(String carNumber) {
        if (!customerMap.containsKey(carNumber)) {
            System.out.println("No Customer Found with carNumber" + carNumber);
            return;
        }
        Scanner sc=new Scanner(System.in);
        Customer customer=customerMap.get(carNumber);
        Invoice invoice=new Invoice(customer);
        System.out.println("Available Services");
        for(int i=0;i<availableService.size();i++)
        {
            System.out.println(i+1+"."+availableService.get(i).getName()
            +" ₹ "+availableService.get(i).getprice());
        }
        while(true){
            System.out.println("Enter Services number to add or pres 0 to finish :");
            int choice=sc.nextInt();
            if(choice==0) break;
            if(choice>0&&choice<=availableService.size()){
                invoice.addService(availableService.get(choice-1));
                System.out.println("Service Done");
            }
            else{
                System.out.println("Invalid choice");
            }
        }
        invoice.printInvoice();
    }
}
