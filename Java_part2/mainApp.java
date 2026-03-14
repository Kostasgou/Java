/*
    Number of Team: 074
    Student Number: 3190062
    Student Number: 3220059
    Student Number: 3220032

*/

import java.util.*;
import java.io.*;
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

        mainApp app = new mainApp();
        app.readDeviceFile(Devices); 
        app.readOrderFile(Orders,Devices);
        app.readSaleFile(Sales,Devices);

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
                                System.out.println("Do you want to buy this device?");
                                System.out.println("1. Yes/ 2. No");
                                System.out.print("> ");
                                answer = in.nextLine();
                                if (answer.equals("1")){
                                    addSale(Sales, Devices, code, Orders);
                                }
                                else{
                                    System.out.println("Returning to main menu...");
                                }
                            }
                        }
                    }
                    else if(deviceChoice.equals("2")){
                        System.out.println("---------- Blu-Ray Players ----------");
                        for(Device device : Devices){
                            if (device instanceof BlueRayDVDPlayer){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());
                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                                System.out.println("Do you want to buy this device?");
                                System.out.println("1. Yes/ 2. No");
                                System.out.print("> ");
                                answer = in.nextLine();
                                if (answer.equals("1")){
                                    addSale(Sales, Devices, code, Orders);
                                }
                                else{
                                    System.out.println("Returning to main menu...");
                                }
                            }
                        }
                    }
                    else if(deviceChoice.equals("3")){
                        System.out.println("---------- Cameras ----------");
                        for(Device device : Devices){
                            if (device instanceof Camera){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());
                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                                System.out.println("Do you want to buy this device?");
                                System.out.println("1. Yes/ 2. No");
                                System.out.print("> ");
                                answer = in.nextLine();
                                if (answer.equals("1")){
                                    addSale(Sales, Devices, code, Orders);
                                }
                                else{
                                    System.out.println("Returning to main menu...");
                                }
                            }
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
                                    System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());
                                }
                            }
                            System.out.println("Choose one Code to view its specs:");
                            code = in.nextLine();
                            for (Device device : Devices){
                                if (device.getCode().equals(code)){
                                    System.out.println(device.toString());
                                    System.out.println("Do you want to buy this device?");
                                    System.out.println("1. Yes/ 2. No");
                                    System.out.print("> ");
                                    answer = in.nextLine();
                                    if (answer.equals("1")){
                                        addSale(Sales, Devices, code, Orders);
                                    }
                                    else{
                                        System.out.println("Returning to main menu...");
                                    }
                                }
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
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());
                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                                System.out.println("Do you want to buy this device?");
                                System.out.println("1. Yes/ 2. No");
                                System.out.print("> ");
                                answer = in.nextLine();
                                if (answer.equals("1")){
                                    addSale(Sales, Devices, code, Orders);
                                }
                                else{
                                    System.out.println("Returning to main menu...");
                                }
                            }
                        }
                    }
                    else if(deviceChoice.equals("2")){
                        System.out.println("---------- Washing Machines ----------");
                        for(Device device : Devices){
                            if (device instanceof WashingMachine){
                                System.out.println("Model Name:" + device.getModelName() + "\tCode:" + device.getCode()+ "\tStock:" + device.getStock());
                            }
                        }
                        System.out.println("Choose one Code to view its specs:");
                        code = in.nextLine();
                        for (Device device : Devices){
                            if (device.getCode().equals(code)){
                                System.out.println(device.toString());
                                System.out.println("Do you want to buy this device?");
                                System.out.println("1. Yes/ 2. No");
                                System.out.print("> ");
                                answer = in.nextLine();
                                if (answer.equals("1")){
                                    addSale(Sales, Devices, code, Orders);
                                }
                                else{
                                    System.out.println("Returning to main menu...");
                                }
                            }
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
                int maxSalenumber = 0;
                boolean orderFound = false;
                for(Sale sale : Sales){
                    if (sale.getSaleCode() > maxSalenumber){
                        maxSalenumber = sale.getSaleCode();
                    }
                }
                maxSalenumber++;
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
                    in.nextLine();
                    for(Order order : Orders){
                        if (order.getOrderCode() == orderCode){
                            System.out.println(order.toString());
                            System.out.println("Order Arrival & Sale");
                            System.out.println("1. Yes/ 2. No");
                            System.out.print("> ");
                            answer = in.nextLine();
                            if (answer.equals("1")){
                                Sale sale = new Sale(order.getDevice(), order.getCustomerName(), order.getCustomerPhone(), order.getTotalCost());
                                sale.setSaleCode(maxSalenumber);
                                boolean saleExists = false;
                                for(Order existingOrder: Orders){
                                    if(existingOrder.getExecuteOrder().equals("Executed")){
                                        saleExists = true;
                                        break;
                                    }
                                }
                                if(!saleExists){
                                    Sales.add(sale);
                                    order.setExecuteOrder("Executed");
                                    System.out.println("The order is executed");
                                }
                                else{
                                    System.out.println("This sale already exists");
                                }
                            }
                            else if (answer.equals("2")){
                                System.out.println("The order is not executed. You can execute it later");
                            }
                            else {
                                System.out.println("Invalid Choice");
                            }         
                            orderFound = true;
                            break;  
                        }
                    }
                    if (!orderFound){
                        System.out.println("Invalid Order Code");
                    }
                    System.out.println("Returning to main menu...");
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
                app.createDeviceFile(Devices);
                System.out.println(" >>>>>>> Write data from Devices to FILE(Devices.txt)...");
                app.createOrderFile(Orders);
                System.out.println(" >>>>>>> Write data from Orders to FILE(Orders.txt)...");
                app.createSaleFile(Sales);
                System.out.println(" >>>>>>> Write data from Sales to FILE(Sales.txt)...");
                System.out.println(" >>>>>>> Exit the program...");

            }    
        
        }//while

    }//main

    static void addSale(ArrayList<Sale> Sales, ArrayList<Device> Devices,String code,ArrayList<Order> Orders){
        Scanner in = new Scanner(System.in);
        String customerName, customerPhone;
        int quantity,maxSalenumber=0;
        double totalCost = 0.0, basicFee,discount;
        System.out.println("---------- Add Sale ----------");
        for(Sale sale : Sales){
            if (sale.getSaleCode() > maxSalenumber){
                maxSalenumber = sale.getSaleCode();
            }
        }
        maxSalenumber++;
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
                    if (device instanceof TV || device instanceof BlueRayDVDPlayer || device instanceof Camera){
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
                    Sale sale = new Sale(device,customerName,customerPhone,totalCost);
                    sale.setSaleCode(maxSalenumber);
                    device.setStock(device.getStock()-quantity);
                    Sales.add(sale);
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
        int quantity,maxOrdernumber = 0;
        double totalCost = 0.0, basicFee,discount;
        System.out.println("---------- Add Order ----------");
        for(Order order : Orders){
            if (order.getOrderCode() > maxOrdernumber){
                maxOrdernumber = order.getOrderCode();
            }
        }
        maxOrdernumber++;
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
                if (device instanceof TV || device instanceof BlueRayDVDPlayer || device instanceof Camera){
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
                Order order2 = new Order(device,customerName,customerPhone,expectedArrivalDate,totalCost);
                order2.setOrderCode(maxOrdernumber);
                Orders.add(order2);
            }
        }
    }//addOrder

    void createDeviceFile(ArrayList<Device> Devices) {
        FileWriter writer = null;

        try{
            writer = new FileWriter(new File("Devices.txt"));
            writer.write("ITEM_LIST"+"\n{");
            for(Device device : Devices){
                if (device instanceof TV){
                    writer.write("\n\tITEM"+"\n\t{"
                    + "\n\t\tCODE " + device.getCode()
                    + "\n\t\tITEM_TYPE tv"
                    + "\n\t\tMODEL " + device.getModelName()
                    + "\n\t\tMODEL_YEAR " + device.getYear()
                    + "\n\t\tMANUFACTURER " + device.getManufacturer()
                    + "\n\t\tPRICE " + device.getPrice()
                    + "\n\t\tPANEL_TYPE " + ((TV)device).getType()
                    + "\n\t\tDIMENSIONS " + ((TV)device).getScreenSize()
                    + "\n\t\tRESOLUTION " + ((TV)device).getResolution()
                    + "\n\t\tINTERFACES " + ((TV)device).getPorts()
                    + "\n\t\tPIECES " + device.getStock()
                    + "\n\t }");
                }
                else if (device instanceof BlueRayDVDPlayer){
                    writer.write("\n\tITEM"+"\n\t{"
                    + "\n\t\tCODE " + device.getCode()
                    + "\n\t\tITEM_TYPE blue_ray_dvd_player"
                    + "\n\t\tMODEL " + device.getModelName()
                    + "\n\t\tMODEL_YEAR " + device.getYear()
                    + "\n\t\tMANUFACTURER " + device.getManufacturer()
                    + "\n\t\tPRICE " + device.getPrice()
                    + "\n\t\tTYPE " + ((BlueRayDVDPlayer)device).getType()
                    + "\n\t\tRESOLUTION " + ((BlueRayDVDPlayer)device).getResolution()
                    + "\n\t\tFORMATS " + ((BlueRayDVDPlayer)device).getFormats()
                    + "\n\t\tPIECES " + device.getStock()
                    + "\n\t }");
                }
                else if(device instanceof Camera){
                    writer.write("\n\tITEM"+"\n\t{"
                    + "\n\t\tCODE " + device.getCode()
                    + "\n\t\tITEM_TYPE camera "
                    + "\n\t\tMODEL " + device.getModelName()
                    + "\n\t\tMODEL_YEAR " + device.getYear()
                    + "\n\t\tMANUFACTURER " + device.getManufacturer()
                    + "\n\t\tPRICE " + device.getPrice()
                    + "\n\t\tTYPE " + ((Camera)device).getType()
                    + "\n\t\tMEGAPIXELS " + ((Camera)device).getMegapixels()
                    + "\n\t\tOPTICAL_ZOOM " + ((Camera)device).getOpticalZoom()
                    + "\n\t\tDIGITAL_ZOOM " + ((Camera)device).getDigitalZoom()
                    + "\n\t\tSCREEN_SIZE " + ((Camera)device).getScreenSize()
                    + "\n\t\tPIECES " + device.getStock()
                    + "\n\t }");
                }
                else if(device instanceof Console){
                    writer.write("\n\tITEM"+"\n\t{"
                    + "\n\t\tCODE " + device.getCode()
                    + "\n\t\tITEM_TYPE console"
                    + "\n\t\tMODEL " + device.getModelName()
                    + "\n\t\tMODEL_YEAR " + device.getYear()
                    + "\n\t\tMANUFACTURER " + device.getManufacturer()
                    + "\n\t\tPRICE " + device.getPrice()
                    + "\n\t\tTYPE " + ((Console)device).getType()
                    + "\n\t\tPROCESSOR " + ((Console)device).getProcessor()
                    + "\n\t\tGRAPHICS " + ((Console)device).getGraphics()
                    + "\n\t\tSOUND " + ((Console)device).getSound()
                    + "\n\t\tSTORAGE_CAPACITY " + ((Console)device).getStorageCapacity()
                    + "\n\t\tPIECES " + device.getStock()
                    + "\n\t }");

                }
                else if(device instanceof Refrigerator){
                    writer.write("\n\tITEM"+"\n\t{"
                    + "\n\t\tCODE " + device.getCode()
                    + "\n\t\tITEM_TYPE refrigerator"
                    + "\n\t\tMODEL " + device.getModelName()
                    + "\n\t\tMODEL_YEAR " + device.getYear()
                    + "\n\t\tMANUFACTURER " + device.getManufacturer()
                    + "\n\t\tPRICE " + device.getPrice()
                    + "\n\t\tTYPE " + ((Refrigerator)device).getType()
                    + "\n\t\tENERGY_CLASS " + ((Refrigerator)device).getEnergyClass()
                    + "\n\t\tSTORAGE_CAPACITY " + ((Refrigerator)device).getStorageCapacity()
                    + "\n\t\tFREEZER_CAPACITY " + ((Refrigerator)device).getFreezerCapacity()
                    + "\n\t\tPIECES " + device.getStock()
                    + "\n\t }");
                }
                else if(device instanceof WashingMachine){
                    writer.write("\n\tITEM"+"\n\t{"
                    + "\n\t\tCODE " + device.getCode()
                    + "\n\t\tITEM_TYPE washing_machine"
                    + "\n\t\tMODEL " + device.getModelName()
                    + "\n\t\tMODEL_YEAR " + device.getYear()
                    + "\n\t\tMANUFACTURER " + device.getManufacturer()
                    + "\n\t\tPRICE " + device.getPrice()
                    + "\n\t\tENERGY_CLASS " + ((WashingMachine)device).getEnergyClass()
                    + "\n\t\tCAPACITY " + ((WashingMachine)device).getCapacity()
                    + "\n\t\tSPIN_SPEED " + ((WashingMachine)device).getSpinSpeed()
                    + "\n\t\tPIECES " + device.getStock()
                    + "\n\t }");
                }

            
            }
            writer.write("\n}");
            writer.close();
        }//try Devices

        catch(IOException e){
            System.out.println("Error writing file.");
        }
    }//createDeviceFile
    
    void createOrderFile(ArrayList<Order> Orders){
        FileWriter writer2 = null;
        try{
            writer2 = new FileWriter(new File("Orders.txt"));
            writer2.write("ORDER_LIST" + "\n{");
            for(Order order : Orders){
                writer2.write("\n\tORDER" + "\n\t{"
                + "\n\t\tITEM_TYPE " + order.getDevice().getClass().getSimpleName().toLowerCase()
                + "\n\t\tMODEL " + order.getDevice().getModelName()
                + "\n\t\tMANUFACTURER " + order.getDevice().getManufacturer() 
                + "\n\t\tORDER_NUMBER " + order.getOrderCode()
                + "\n\t\tNAME " + order.getCustomerName()
                + "\n\t\tPHONE " + order.getCustomerPhone()
                + "\n\t\tORDER_DATE " + order.getOrderDate()
                + "\n\t\tDELIVERY_DATE " + order.getExpectedArrivalDate()
                + "\n\t\tPRICE " + String.format("%10.2f",order.getTotalCost())
                + "\n\t\tSTATUS " + order.getExecuteOrder()
                + "\n\t }");
            }
            writer2.write("\n}");
            writer2.close();
        }//try Orders
        
        catch(IOException e){
            System.out.println("Error writing file.");
        }
    }//createOrderFile

    void createSaleFile(ArrayList<Sale> Sales){
        FileWriter writer3 = null;
        try{
            writer3 = new FileWriter(new File("Sales.txt"));
            writer3.write("SALES_LIST" + "\n{");
            for(Sale sale : Sales){
                writer3.write("\n\tSALE" + "\n\t{"
                + "\n\t\tITEM_TYPE " + sale.getDevice().getClass().getSimpleName().toLowerCase()
                + "\n\t\tMODEL " + sale.getDevice().getModelName()
                + "\n\t\tMANUFACTURER " + sale.getDevice().getManufacturer()
                + "\n\t\tSALE_NUMBER " + sale.getSaleCode()
                + "\n\t\tNAME " + sale.getCustomerName()
                + "\n\t\tPHONE " + sale.getCustomerPhone()
                + "\n\t\tDATE " + sale.getSaleDate()
                + "\n\t\tPRICE " + String.format("%10.2f",sale.getTotalCost())
                + "\n\t }");
            }
            writer3.write("\n}");
            writer3.close();
           
        }//try Sales

        catch(IOException e){
            System.out.println("Error writing file.");
        }
        
    }//createSaleFile

  
    void readDeviceFile(ArrayList<Device> Devices) {
        BufferedReader reader = null;
        String line = null;
        System.out.println("\n >>>>>>> Adding Objects (Devices) from File (Devices.txt) to List ...\n");
        
        try {
            reader = new BufferedReader(new FileReader(new File("Devices.txt")));
            line = reader.readLine();
            while (line != null) {
                String lowercase = line.trim().toLowerCase();
                if (lowercase.equals("item_list")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        while (!line.trim().equals("}")) {
                            lowercase = line.trim().toLowerCase();
                            if (lowercase.equals("item")) {
                                line = reader.readLine();
                                if (line.trim().equals("{")) {
                                    line = reader.readLine();
                                    HashMap<String, String> propertyMap = new HashMap<>();
                                    while (!line.trim().equals("}")) {
                                        String[] keyValue = line.split(" ", 2);
                                        String propertyName = keyValue[0].trim().toLowerCase();
                                        String propertyValue = keyValue[1].trim();
                                        propertyMap.put(propertyName, propertyValue);
                                        line = reader.readLine();
                                    }
                                    if(propertyMap.containsKey("item_type")){
                                        ArrayList<String> missingTags = new ArrayList<>();
                                        String[] mandatoryTags = {"code","model"};
                                        for (String tag : mandatoryTags){
                                            if(!propertyMap.containsKey(tag)){
                                            missingTags.add(tag);
                                            }
                                        }
                                        if (missingTags.isEmpty()){
                                            Device device = createDeviceFromPropertyMap(propertyMap);
                                            if (device != null) {
                                            Devices.add(device);
                                            }
                                        }
                                        else {
                                            System.out.println("Ignoring device with missing or invalid property names.");
                                            System.out.println("Device :" + propertyMap.getOrDefault("code"," Unknown"));
                                            System.out.print("Missing tags :" );
                                            for (String tag : missingTags){
                                                System.out.print(tag + ",");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    else{
                                        System.out.println("Ignoring device without item_type tag");
                                        System.out.println("Device :" + propertyMap.getOrDefault("code"," Unknown"));
                                    }
                                }
                            }
                            line = reader.readLine();
                        }//while
                    }
                }
                line = reader.readLine();
            }//while
            reader.close();
        }//try
        catch (IOException e) {
            System.out.println("Error reading line...");
        }
    }//readDeviceFile

    Device createDeviceFromPropertyMap(HashMap<String, String> propertyMap) {
        String itemType = propertyMap.get("item_type");

        if (itemType.equals("tv")) {
            TV device = new TV();
            device.setCode(propertyMap.getOrDefault("code","Unknown")); 
            device.setModelName(propertyMap.getOrDefault("model","Unknown"));
            device.setYear(Integer.parseInt(propertyMap.getOrDefault("model_year","0")));
            device.setManufacturer(propertyMap.getOrDefault("manufacturer","Unknown"));
            device.setPrice(Double.parseDouble(propertyMap.getOrDefault("price","0.0")));
            device.setType(propertyMap.getOrDefault("panel_type","Unknown"));
            device.setScreenSize(Double.parseDouble(propertyMap.getOrDefault("dimensions","0.0")));
            device.setResolution(propertyMap.getOrDefault("resolution","Unknown"));
            device.setPorts(propertyMap.getOrDefault("interfaces","Unknown"));
            device.setStock(Integer.parseInt(propertyMap.getOrDefault("pieces","0")));
            return device;
        } 
        else if (itemType.equals("blue_ray_dvd_player")) {
            BlueRayDVDPlayer device = new BlueRayDVDPlayer();
            device.setCode(propertyMap.getOrDefault("code","Unknown"));
            device.setModelName(propertyMap.getOrDefault("model","Unknown"));
            device.setYear(Integer.parseInt(propertyMap.getOrDefault("model_year","0")));
            device.setManufacturer(propertyMap.getOrDefault("manufacturer","Unknown"));
            device.setPrice(Double.parseDouble(propertyMap.getOrDefault("price","0.0")));
            device.setType(propertyMap.getOrDefault("type","Unknown"));
            device.setResolution(propertyMap.getOrDefault("resolution","Unknown"));
            device.setFormats(propertyMap.getOrDefault("formats","Unknown"));
            device.setStock(Integer.parseInt(propertyMap.getOrDefault("pieces","0")));
            return device;
        } 
        else if (itemType.equals("camera")) {
            Camera device = new Camera();
            device.setCode(propertyMap.getOrDefault("code","Unknown"));
            device.setModelName(propertyMap.getOrDefault("model","Unknown"));
            device.setYear(Integer.parseInt(propertyMap.getOrDefault("model_year","0")));
            device.setManufacturer(propertyMap.getOrDefault("manufacturer","Unknown"));
            device.setPrice(Double.parseDouble(propertyMap.getOrDefault("price","0.0")));
            device.setType(propertyMap.getOrDefault("type","Unknown"));
            device.setMegapixels(Integer.parseInt(propertyMap.getOrDefault("megapixels","0")));
            device.setOpticalZoom(Integer.parseInt(propertyMap.getOrDefault("optical_zoom","0")));
            device.setDigitalZoom(Integer.parseInt(propertyMap.getOrDefault("digital_zoom","0")));
            device.setScreenSize(Double.parseDouble(propertyMap.getOrDefault("screen_size","0.0")));
            device.setStock(Integer.parseInt(propertyMap.getOrDefault("pieces","0")));
            return device;
        } 
        else if (itemType.equals("console")) {
            Console device = new Console();
            device.setCode(propertyMap.getOrDefault("code","Unknown"));
            device.setModelName(propertyMap.getOrDefault("model","Unknown"));
            device.setYear(Integer.parseInt(propertyMap.getOrDefault("model_year","0")));
            device.setManufacturer(propertyMap.getOrDefault("manufacturer","Unknown"));
            device.setPrice(Double.parseDouble(propertyMap.getOrDefault("price","0.0")));
            device.setType(propertyMap.getOrDefault("type","Unknown"));
            device.setProcessor(propertyMap.getOrDefault("processor","Unknown"));
            device.setGraphics(propertyMap.getOrDefault("graphics","Unknown"));
            device.setSound(propertyMap.getOrDefault("sound","Unknown"));
            device.setStorageCapacity(Integer.parseInt(propertyMap.getOrDefault("storage_capacity","0")));
            device.setStock(Integer.parseInt(propertyMap.getOrDefault("pieces","0")));
            return device;
        } 
        else if (itemType.equals("refrigerator")) {
            Refrigerator device = new Refrigerator();
            device.setCode(propertyMap.getOrDefault("code","Unknown"));
            device.setModelName(propertyMap.getOrDefault("model","Unknown"));
            device.setYear(Integer.parseInt(propertyMap.getOrDefault("model_year","0")));
            device.setManufacturer(propertyMap.getOrDefault("manufacturer","Unknown"));
            device.setPrice(Double.parseDouble(propertyMap.getOrDefault("price","0.0")));
            device.setType(propertyMap.getOrDefault("type","Unknown"));
            device.setEnergyClass(propertyMap.getOrDefault("energy_class","Unknown"));
            device.setStorageCapacity(Integer.parseInt(propertyMap.getOrDefault("storage_capacity","0")));
            device.setFreezerCapacity(Integer.parseInt(propertyMap.getOrDefault("freezer_capacity","0")));
            device.setStock(Integer.parseInt(propertyMap.getOrDefault("pieces","0")));
            return device;
        }
        else if (itemType.equals("washing_machine")) {
            WashingMachine device = new WashingMachine();
            device.setCode(propertyMap.getOrDefault("code","Unknown"));
            device.setModelName(propertyMap.getOrDefault("model","Unknown"));
            device.setYear(Integer.parseInt(propertyMap.getOrDefault("model_year","0")));
            device.setManufacturer(propertyMap.getOrDefault("manufacturer","Unknown"));
            device.setPrice(Double.parseDouble(propertyMap.getOrDefault("price","0.0")));
            device.setEnergyClass(propertyMap.getOrDefault("energy_class","Unknown"));
            device.setCapacity(Integer.parseInt(propertyMap.getOrDefault("capacity","0")));
            device.setSpinSpeed(Integer.parseInt(propertyMap.getOrDefault("spin_speed","0")));
            device.setStock(Integer.parseInt(propertyMap.getOrDefault("pieces","0")));
            return device;
        }
        return null;
    }//createDevice
   
    void readOrderFile(ArrayList<Order> Orders, ArrayList<Device> Devices){
        BufferedReader reader = null;
        String line = null;
        System.out.println("\n >>>>>>> Adding Objects (Orders) from File(Orders.txt) to List ...\n");

        try {
            reader = new BufferedReader(new FileReader(new File("Orders.txt")));
            line = reader.readLine();
            
                        
            while (line != null) {
                String lowercase = line.trim().toLowerCase();
                if (lowercase.equals("order_list")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        lowercase = line.trim().toLowerCase();
                        while (lowercase.equals("order")){
                            line = reader.readLine();
                            if (line.trim().equals("{")) {
                                line = reader.readLine();
                                HashMap<String,String> propertyMap = new HashMap<String,String>();
                                while (!line.trim().equals("}")) {
                                    String[] keyValue = line.split(" ", 2);
                                    String propertyName = keyValue[0].trim().toLowerCase();
                                    String propertyValue = keyValue[1].trim();
                                    propertyMap.put(propertyName, propertyValue);
                                    line = reader.readLine();
                                }
                                Order order = createOrderFromPropertyMap(propertyMap);
                                if (order != null && DeviceExists(Devices, order.getDevice()) ) {
                                    Orders.add(order);
                                }
                                else{
                                    System.out.println("Ignoring order with code: " + propertyMap.get("order_number") + " because the device does not exist in the list of available devices.");
                                }
                            }
                            line = reader.readLine();
                            lowercase = line.trim().toLowerCase();
                        }//while
                    }    
                }
                line = reader.readLine();
            }//while
            reader.close();
        }//try
        catch (IOException e) {
            System.out.println("Error reading line...");
        }       
    }//readOrderFile

    boolean DeviceExists(ArrayList<Device> Devices, Device device){
        for (Device d : Devices) {
            if (d.getModelName().equals(device.getModelName()) && d.getManufacturer().equals(device.getManufacturer())) {
                return true;
            }
        }
        return false;
    }//DeviceExists

    Order createOrderFromPropertyMap(HashMap<String,String> propertyMap){
        Order order = new Order();
        order.setOrderCode(Integer.parseInt(propertyMap.get("order_number")));
        order.setCustomerName(propertyMap.get("name"));
        order.setCustomerPhone(propertyMap.get("phone"));
        order.setOrderDate(LocalDate.parse(propertyMap.get("order_date"), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        order.setExpectedArrivalDate(LocalDate.parse(propertyMap.get("delivery_date"), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        order.setTotalCost(Double.parseDouble(propertyMap.get("price")));
        order.setExecuteOrder(propertyMap.get("status"));
        Device device = new Device();
        device.setModelName(propertyMap.get("model"));
        device.setManufacturer(propertyMap.get("manufacturer"));
        order.setDevice(device);
        return order;
    }//createOrderFromPropertyMap

    void readSaleFile(ArrayList<Sale> Sales, ArrayList<Device> Devices){
        BufferedReader reader = null;
        String line = null;
        System.out.println("\n >>>>>>> Adding Objects (Sales) from File(Sales.txt) to List ...\n");

        try {
            reader = new BufferedReader(new FileReader(new File("Sales.txt")));
            line = reader.readLine();
            String lowercase = line.trim().toLowerCase();
                        
            while (line != null) {
                lowercase = line.trim().toLowerCase();
                if (lowercase.equals("sales_list")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        lowercase = line.trim().toLowerCase();
                        while (lowercase.equals("sale")) {
                            line = reader.readLine();
                            if (line.trim().equals("{")) {
                                line = reader.readLine();
                                HashMap<String, String> propertyMap = new HashMap<>();
                                while (!line.trim().equals("}")) {
                                    String[] keyValue = line.split(" ", 2);
                                    String propertyName = keyValue[0].trim().toLowerCase();
                                    String propertyValue = keyValue[1].trim();
                                    propertyMap.put(propertyName, propertyValue);
                                    line = reader.readLine();
                                }
                                Sale sale= createSaleFromPropertyMap(propertyMap);
                                if (sale != null && DeviceExists(Devices, sale.getDevice())) {
                                    Sales.add(sale);
                                }
                                else{
                                    System.out.println("Ignoring sale with code: " + propertyMap.get("sale_number")+ " because device does not exist in the list of available devices.");
                                }
                            }
                            line = reader.readLine();
                            lowercase = line.trim().toLowerCase();
                        }//while
                    }
                }
                line = reader.readLine();
            }//while
            reader.close();
        }//try
        catch (IOException e) {
            System.out.println("Error reading line...");
        }
                        
    }//readSaleFile
               
    Sale createSaleFromPropertyMap(HashMap<String,String> propertyMap){
        Sale sale = new Sale();
        sale.setSaleCode(Integer.parseInt(propertyMap.get("sale_number")));
        sale.setCustomerName(propertyMap.get("name"));
        sale.setCustomerPhone(propertyMap.get("phone"));
        sale.setSaleDate(LocalDate.parse(propertyMap.get("date"), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        sale.setTotalCost(Double.parseDouble(propertyMap.get("price")));
        Device device = new Device();
        device.setModelName(propertyMap.get("model"));
        device.setManufacturer(propertyMap.get("manufacturer"));
        sale.setDevice(device);
        return sale;
    }//createSaleFromPropertyMap

}//class
    


   

    
    


