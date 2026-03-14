/*
    Number of Team: 074
    Student Number: 3190062
    Student Number: 3220059
    Student Number: 3220032

*/

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class  mainApp{
    
    public static void main(String args[]) {
        ArrayList<Sale> Sales = new ArrayList<Sale>();
        ArrayList<Order> Orders = new ArrayList<Order>();
        ArrayList<Device> Devices = new ArrayList<Device>();
        Scanner in = new Scanner(System.in);
        boolean done=false;
        String answer,categoryChoice,deviceChoice,code;
        //initializing the devices
        Devices.add(new TV("TV1", "LCD TV", 2022, "Sony", 999.99,10, "LCD", 55, "1080p", new String[]{"HDMI", "DVI", "Composite"}));
        Devices.add(new TV("TV2", "LED TV", 2021, "Samsung", 1299.99,0, "LED", 65, "4K", new String[]{"HDMI", "Composite"}));
        Devices.add(new BluRayDVDPlayer("BDP1", "Blu-ray Player", 2022, "LG", 199.99,5, "Blu-ray", "1080p", new String[]{"BD-R", "BD-RD", "DVD-RW", "DVD+RW"}));
        Devices.add(new BluRayDVDPlayer("BDP2", "DVD Player", 2021, "Sony", 99.99,3,"DVD", "720p", new String[]{"DVD-RW", "DVD+RW"}));
        Devices.add(new Camera("CAM1", "Compact Camera", 2022, "Canon", 299.99,2, "Compact",64, 20, 3, 2.5));
        Devices.add(new Camera("CAM2", "DSLR Camera", 2021, "Nikon", 799.99,0, "DSLR",48, 24, 5, 3.0));
        Devices.add(new Console("CON1", "PS5", 2023, "Sony", 499.99,0, "PS5", "AMD Ryzen", "AMD Radeon", "Dolby Atmos", 825));
        Devices.add(new Console("CON2", "Xbox Series X", 2023,"Microsoft", 449.99,25, "Xbox Series X", "AMD Ryzen", "AMD Radeon", "DTS:X", 1024));
        Devices.add(new Refrigerator("REF1", "Double Door Refrigerator", 2022, "Samsung", 1199.99,4, "Double Door", "A+++", 500, 200));
        Devices.add(new Refrigerator("REF2", "Wardrobe Refrigerator", 2021, "LG", 1599.99,0, "Wardrobe", "A+++", 800, 300));
        Devices.add(new WashingMachine("WM1", "Energy Efficient Washing Machine", 2022, "Whirlpool", 699.99,3, "A+++", 8, 1200));
        Devices.add(new WashingMachine("WM2", "Large Capacity Washing Machine", 2021, "Samsung", 899.99,2,"A++", 10, 1400));
            
        while (!done){
            System.out.println("--------------- ");
            System.out.println("1. View Devices");
            System.out.println("2. View Orders");
            System.out.println("3. View Sales");
            System.out.println("0. Exit");
            System.out.println("--------------- ");
            System.out.print("> ");
            answer = in.nextLine();
            
            if (answer.equals ("1")){
                System.out.println("--- View Devices --- ");
                System.out.println("Choose the Category of the Device:");
                System.out.println("1. Audio & Video Devices");
                System.out.println("2. Gaming Devices");
                System.out.println("3. Home Devices");
                System.out.print("> ");
                categoryChoice = in.nextLine();
                if (categoryChoice.equals ("1")){
                    System.out.println("Audio & Video Devices:");
                    System.out.println("Choose the type of the Device:");
                    System.out.println("1. Television");
                    System.out.println("2. Blu-Ray Player");
                    System.out.println("3. Camera");
                    System.out.print("> ");
                    deviceChoice= in.nextLine();
                    if(deviceChoice.equals("1")){
                        System.out.println("---------- Televisions ----------");
                        for(Device device : Devices){
                            if (device instanceof TV){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());
                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                            }           
                        }
                        System.out.println("Do you want to buy this device?");
                        System.out.println("1. Yes/ 2. No");
                        System.out.print("> ");
                        answer = in.nextLine();
                        if (answer.equals("1")){
                            addSale(Sales, Devices, code, Orders);
                        }
                        else{
                            break;
                        }
                    }
                    else if(deviceChoice.equals("2")){
                        System.out.println("---------- Blu-Ray Players ----------");
                        for(Device device : Devices){
                            if (device instanceof BluRayDVDPlayer){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                            }           
                        }
                        System.out.println("Do you want to buy this device?");
                        System.out.println("1. Yes/ 2. No");
                        System.out.print("> ");
                        answer = in.nextLine();
                        if (answer.equals("1")){
                            addSale(Sales, Devices, code, Orders);
                        }
                        else{
                            break;
                        }
                    }
                    else if(deviceChoice.equals("3")){
                        System.out.println("---------- Cameras ----------");
                        for(Device device : Devices){
                            if (device instanceof Camera){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                            }           
                        }
                        System.out.println("Do you want to buy this device?");
                        System.out.println("1. Yes/ 2. No");
                        System.out.print("> ");
                        answer = in.nextLine();
                        if (answer.equals("1")){
                            addSale(Sales, Devices, code, Orders);
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        System.out.println("Invalid Choice");
                    }
                }
                else if (categoryChoice.equals("2")){
                        System.out.println("Gaming Devices:");
                        System.out.println("Choose the type of the Device:");
                        System.out.println("1. Console");
                        System.out.print("> ");
                        deviceChoice= in.nextLine();
                        if(deviceChoice.equals("1")){
                            System.out.println("---------- Consoles ----------");
                            for(Device device : Devices){
                                if (device instanceof Console){
                                    System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());                                }
                            }
                            System.out.println("Choose one Code to view its specs:");
                            code = in.nextLine();
                            for (Device device : Devices){
                                if (device.getCode().equals(code)){
                                    System.out.println(device.toString());
                                }           
                            }
                            System.out.println("Do you want to buy this device?");
                            System.out.println("1. Yes/ 2. No");
                            System.out.print("> ");
                            answer = in.nextLine();
                            if (answer.equals("1")){
                                addSale(Sales, Devices, code, Orders);
                            }
                            else{
                                break;
                            }

                        }
                        else{
                            System.out.println("Invalid Choice");
                        }
                    
                }
                else if (categoryChoice.equals("3")){
                    System.out.println("Home Devices:");
                    System.out.println("Choose the type of the Device:");
                    System.out.println("1. Refrigerator");
                    System.out.println("2. Washing Machine");
                    System.out.print("> ");
                    deviceChoice= in.nextLine();
                    if(deviceChoice.equals("1")){
                        System.out.println("---------- Refrigerators ----------");
                        for(Device device : Devices){
                            if (device instanceof Refrigerator){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                            }           
                        }
                        System.out.println("Do you want to buy this device?");
                        System.out.println("1. Yes/ 2. No");
                        System.out.print("> ");
                        answer = in.nextLine();
                        if (answer.equals("1")){
                            addSale(Sales, Devices, code, Orders);
                        }
                        else{
                            break;
                        }
                    }
                    else if(deviceChoice.equals("2")){
                        System.out.println("---------- Washing Machines ----------");
                        for(Device device : Devices){
                            if (device instanceof WashingMachine){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                            }           
                        }
                        System.out.println("Do you want to buy this device?");
                        System.out.println("1. Yes/ 2. No");
                        System.out.print("> ");
                        answer = in.nextLine();
                        if (answer.equals("1")){
                            addSale(Sales, Devices, code, Orders);
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        System.out.println("Invalid Choice");
                    }
                }
                else {
                    System.out.println("Invalid Choice");
                }
            
            }
            else if(answer.equals("2")){
                System.out.println("--- View Orders --- ");
                if (Orders.isEmpty()){
                    System.out.println("There is not any order");
                }
                else {
                    for(Order order : Orders){
                        System.out.println(order.toString());
                    }
                    System.out.println("Enter the Order Code:");
                    System.out.print("> ");
                    int orderCode = in.nextInt();
                    for(Order order : Orders){
                        if (order.getOrderCode() == orderCode){
                            System.out.println(order.toString());
                            System.out.println("Order Arrival & Sale");
                            System.out.println("1. Yes/ 2. No");
                            System.out.print("> ");
                            in.nextLine();
                            answer = in.nextLine();
                            if (answer.equals("1")){
                                Sales.add(new Sale(order.getDevice(), order.getCustomerName(), order.getCustomerPhone(), order.getTotalCost()));
                                order.setExecuteOrder(true);
                                System.out.println("The order is executed");
                            }
                            else{
                                break;
                            }            
                        }
                        else{
                            System.out.println("Invalid Order Code");
                        }
                    }
                }


            }
            else if(answer.equals("3")){
                System.out.println("--- View Sales --- ");
                if( Sales.isEmpty()){
                    System.out.println("There is not any sale");
                }
                else{
                    for(Sale sale : Sales){
                       System.out.println(sale.toString());
                    }
                }
            }
            else if(answer.equals("0")){
                done=true;

            }    
        
        }//while

    }//main

    static void addSale(ArrayList<Sale> Sales, ArrayList<Device> Devices,String code,ArrayList<Order> Orders){
        Scanner in = new Scanner(System.in);
        String customerName, customerPhone;
        int quantity;
        double totalCost = 0.0, basicFee,discount;
        System.out.println("---------- Add Sale ----------");
        System.out.println("Enter the Quantity:");
        System.out.print("> ");
        quantity = in.nextInt();
        for(Device device : Devices){
            if (device.getCode().equals(code)){
                if (device.getStock( )>= quantity){
                    System.out.println("Enter the Customer Name:");
                    System.out.print("> ");
                    in.nextLine();
                    customerName = in.nextLine();
                    System.out.println("Enter the Customer Phone:");
                    System.out.print("> ");
                    customerPhone = in.nextLine();
                    if (device instanceof TV || device instanceof BluRayDVDPlayer || device instanceof Camera){
                        basicFee = device.getPrice()*quantity;
                        System.out.print("Basic Fee = ");
                        System.out.print(device.getPrice());
                        System.out.print(" * ");
                        System.out.print(quantity);
                        System.out.print(" = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.println("\nDiscount percentage = 25%");
                        discount = device.getPrice()*quantity*0.25;
                        System.out.print("Discount = " );
                        System.out.printf("%10.2f",discount);
                        System.out.print("\nTotal Cost = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.print("  -");
                        System.out.printf("%10.2f",discount);
                        System.out.print("   =");
                        System.out.printf("%10.2f",((basicFee)-(discount)));
                        System.out.println();
                        totalCost = (basicFee)-(discount);
                    }
                    else if (device instanceof Console){
                        basicFee = device.getPrice()*quantity;
                        System.out.print("Basic Fee = ");
                        System.out.print(device.getPrice());
                        System.out.print(" * ");
                        System.out.print(quantity);
                        System.out.print(" = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.println("\nDiscount percentage = 10%");
                        discount = device.getPrice()*quantity*0.1;
                        System.out.print("Discount = " );
                        System.out.printf("%10.2f",discount);
                        System.out.print("\nTotal Cost = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.print("  -");
                        System.out.printf("%10.2f",discount);
                        System.out.print("   =");
                        System.out.printf("%10.2f",((basicFee)-(discount)));
                        System.out.println();
                        totalCost = (basicFee)-(discount);
                    }
                    else if (device instanceof Refrigerator || device instanceof WashingMachine){
                        basicFee = device.getPrice()*quantity;
                        System.out.print("Basic Fee = ");
                        System.out.print(device.getPrice());
                        System.out.print(" * ");
                        System.out.print(quantity);
                        System.out.print(" = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.println("\nDiscount percentage = 20%");
                        discount = device.getPrice()*quantity*0.2;
                        System.out.print("Discount = " );
                        System.out.printf("%10.2f",discount);
                        System.out.print("\nTotal Cost = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.print("  -");
                        System.out.printf("%10.2f",discount);
                        System.out.print("   =");
                        System.out.printf("%10.2f",((basicFee)-(discount)));
                        System.out.println();
                        totalCost = (basicFee)-(discount);
                    }
                    Sales.add(new Sale(device, customerName, customerPhone, totalCost));
                    device.setStock(device.getStock()-quantity);
                    System.out.println("The sale is added");
                }
                else{
                    System.out.println("Not enough stock");
                    System.out.println("You can order the device");
                    addOrder(Orders, Devices, code);
                    System.out.println("The order is added");
                }
            }
        
        }
    }//addSale

    static void addOrder(ArrayList<Order> Orders, ArrayList<Device> Devices,String code){
        Scanner in = new Scanner(System.in);
        String customerName, customerPhone;
        LocalDate expectedArrivalDate;
        int quantity;
        double totalCost = 0.0, basicFee,discount;
        System.out.println("---------- Add Order ----------");
        System.out.println("Enter the Quantity:");
        System.out.print("> ");
        quantity = in.nextInt();
        for(Device device : Devices){
            if (device.getCode().equals(code)){
                System.out.println("Enter the Customer Name:");
                System.out.print("> ");
                in.nextLine();
                customerName = in.nextLine();
                System.out.println("Enter the Customer Phone:");
                System.out.print("> ");
                customerPhone = in.nextLine();
                if (device instanceof TV || device instanceof BluRayDVDPlayer || device instanceof Camera){
                    basicFee = device.getPrice()*quantity;
                    System.out.print("Basic Fee = ");
                    System.out.print(device.getPrice());
                    System.out.print(" * ");
                    System.out.print(quantity);
                    System.out.print(" = ");
                    System.out.printf("%10.2f",basicFee);
                    System.out.println("\nDiscount percentage = 25%");
                    discount = device.getPrice()*quantity*0.25;
                    System.out.print("Discount = " );
                    System.out.printf("%10.2f",discount);
                    System.out.print("\nTotal Cost = ");
                    System.out.printf("%10.2f",basicFee);
                    System.out.print("  -");
                    System.out.printf("%10.2f",discount);
                    System.out.printf("%10.2f",((basicFee)-(discount)));
                    System.out.println();
                    totalCost = (basicFee)-(discount);
                }
                else if (device instanceof Console){
                    basicFee = device.getPrice()*quantity;
                        System.out.print("Basic Fee = ");
                        System.out.print(device.getPrice());
                        System.out.print(" * ");
                        System.out.print(quantity);
                        System.out.print(" = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.println("\nDiscount percentage = 10%");
                        discount = device.getPrice()*quantity*0.1;
                        System.out.print("Discount = " );
                        System.out.printf("%10.2f",discount);
                        System.out.print("\nTotal Cost = ");
                        System.out.printf("%10.2f",basicFee);
                        System.out.print("  -");
                        System.out.printf("%10.2f",discount);
                        System.out.print("   =");
                        System.out.printf("%10.2f",((basicFee)-(discount)));
                        System.out.println();
                        totalCost = (basicFee)-(discount);
                }
                else if (device instanceof Refrigerator || device instanceof WashingMachine){
                    basicFee = device.getPrice()*quantity;
                    System.out.print("Basic Fee = ");
                    System.out.print(device.getPrice());
                    System.out.print(" * ");
                    System.out.print(quantity);
                    System.out.print(" = ");
                    System.out.printf("%10.2f",basicFee);
                    System.out.println("\nDiscount percentage = 20%");
                    discount = device.getPrice()*quantity*0.2;
                    System.out.print("Discount = " );
                    System.out.printf("%10.2f",discount);
                    System.out.print("\nTotal Cost = ");
                    System.out.printf("%10.2f",basicFee);
                    System.out.print("-");
                    System.out.printf("%10.2f",discount);
                    System.out.print("   =");
                    System.out.printf("%10.2f",((basicFee)-(discount)));
                    System.out.println();
                    totalCost = (basicFee)-(discount);
                }
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");    
                System.out.println("Enter the Expected Arrival Date:");
                expectedArrivalDate = LocalDate.parse(in.nextLine(), formatter);
                Order order = new Order(expectedArrivalDate);
                while(expectedArrivalDate.isBefore(LocalDate.now())){
                    System.out.println("Invalid Date please enter a valid date");
                    expectedArrivalDate = LocalDate.parse(in.nextLine(), formatter);
                    order.setExpectedArrivalDate(expectedArrivalDate);
                }
                Orders.add(new Order(device, customerName, customerPhone,expectedArrivalDate, totalCost));
            }
        }
    }//addOrder

   

    
    

}//class
