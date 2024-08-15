import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laptop_Store {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // This List Is For Cashiers ....
        List<Cashier> cashiers = new ArrayList<>();
        cashiers.add(new Cashier("ls101", "Omar"));
        cashiers.add(new Cashier("ls102", "Wael"));
        cashiers.add(new Cashier("ls103", "Sara"));
        System.out.println("Cashier Data.. ");
        System.out.println("Cashier ID: ");
        String cash_id = scanner.next();

        Cashier cashier = null;
        for (Cashier c : cashiers) {
            if (c.getId().equals(cash_id)) {
                cashier = c;
                break;
            }
        }
        if (cashier == null) {
            System.out.println("Invalid Cashier ID.");
            return;
        }

        System.out.println("Enter Customer Name: ");
        String cust_name = scanner.next();

        System.out.println("Enter Customer Phone Number: ");
        int cust_phone = scanner.nextInt();

        Invoice invoice = new Invoice(cust_name, cust_phone, cashier.getName(), cashier.getId());

        // This List Is For Products ....
        List<Price> products = new ArrayList<>();
        products.add(new Price("15.GW", 17499));
        products.add(new Price("Victus 15-fa0031dx", 30049));
        products.add(new Price("Vostro 3520", 28999));
        products.add(new Price("GIS 5530", 66559));
        products.add(new Price("Lenovo", 25499));
        products.add(new Price("Acer", 30450));
        products.add(new Price("Mouse", 400));
        products.add(new Price("Keyboard", 900));
        products.add(new Price("Hdd", 2500));
        products.add(new Price("Ssd", 4000));
        while (true) {
            System.out.println("------ Laptop Store Menu ------");
            System.out.println("1- Laptop");
            System.out.println("2- Mouse");
            System.out.println("3- Keyboard");
            System.out.println("4- Hard Disk");
            System.out.println("6- Exit");
            System.out.println("00- Print The Invoice");

            System.out.println("Chose Item Code: ");
            int choiseNum = scanner.nextInt();
            switch (choiseNum) {
                case 1:

                    System.out.println("------ Laptop Menu ------");
                    System.out.println("1- HP");
                    System.out.println("2- DELL");
                    System.out.println("3- LENOVO");
                    System.out.println("4- ACER");
                    System.out.println("5- Back To Main Menu");
                    System.out.println("6- Exit");
                    System.out.println("Choose The Type Of Laptop: ");
                    int choiselap = scanner.nextInt();
                    switch (choiselap) {
                        case 1:

                            System.out.println("1- HP 15.GW");
                            System.out.println("2- HP Victus 15-fa0031dx");
                            System.out.println("3- Back To Main Menu");
                            System.out.println("4- Exit");
                            System.out.println("Choose The Version Of Laptop: ");
                            int choiseLapHp = scanner.nextInt();

                            switch (choiseLapHp) {
                                case 1:
                                    Price selectedLap = products.get(0);
                                    System.out.print("Enter Quantity: ");
                                    // Use To Input Quantity Of Product ....
                                    // There Are Many Of Them in This Code ..
                                    int qtyLap = scanner.nextInt();
                                    // Added The Product And The Quantity And The Price In (Item List) ....
                                    // There Are Many Of Them in This Code ..
                                    invoice.addItems(selectedLap.getDiscription(), qtyLap,
                                            selectedLap.getPrice());
                                    break;
                                case 2:
                                    Price selectedLap1 = products.get(1);
                                    System.out.print("Enter Quantity: ");
                                    int qtyLap1 = scanner.nextInt();
                                    invoice.addItems(selectedLap1.getDiscription(), qtyLap1,
                                            selectedLap1.getPrice());
                                    break;
                                case 3:

                                    break;
                                case 4:
                                    Invoice.exitFromApp();
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    continue;
                            }

                            break;

                        case 2:

                            System.out.println("1- DELL Vostro 3520");
                            System.out.println("2- DELL GIS 5530");
                            System.out.println("3- Back To Main Menu");
                            System.out.println("4- Exit");
                            System.out.println("Choose The Version Of Laptop: ");
                            int choiseLapDell = scanner.nextInt();

                            switch (choiseLapDell) {
                                case 1:
                                    Price selectedLap = products.get(2);
                                    System.out.print("Enter Quantity: ");
                                    int qtyLap = scanner.nextInt();
                                    invoice.addItems(selectedLap.getDiscription(), qtyLap,
                                            selectedLap.getPrice());
                                    break;
                                case 2:
                                    Price selectedLap1 = products.get(3);
                                    System.out.print("Enter Quantity: ");
                                    int qtyLap1 = scanner.nextInt();
                                    invoice.addItems(selectedLap1.getDiscription(), qtyLap1,
                                            selectedLap1.getPrice());
                                    break;
                                case 3:

                                    break;
                                case 4:
                                    Invoice.exitFromApp();
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    continue;
                            }

                            break;

                        case 3:

                            System.out.println("1- Lenovo");
                            System.out.println("2- Back To Main Menu");
                            System.out.println("3- Exit");
                            int choiseLapLenovo = scanner.nextInt();
                            switch (choiseLapLenovo) {
                                case 1:
                                    Price selectedLap = products.get(4);
                                    System.out.print("Enter Quantity: ");
                                    int qtyLap = scanner.nextInt();
                                    invoice.addItems(selectedLap.getDiscription(), qtyLap,
                                            selectedLap.getPrice());
                                    break;
                                case 2:
                                    continue;
                                case 3:
                                    Invoice.exitFromApp();
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                                    continue;
                            }

                            break;

                        case 4:

                            System.out.println("1- Acer");
                            System.out.println("2- Back To Main Menu");
                            System.out.println("3- Exit");
                            int choiseLapAcer = scanner.nextInt();
                            switch (choiseLapAcer) {
                                case 1:
                                    Price selectedLap1 = products.get(5);
                                    System.out.print("Enter Quantity: ");
                                    int qtyLap1 = scanner.nextInt();
                                    invoice.addItems(selectedLap1.getDiscription(), qtyLap1,
                                            selectedLap1.getPrice());
                                    break;
                                case 2:
                                    continue;
                                case 3:
                                    Invoice.exitFromApp();
                                    break;
                            }

                            break;

                        case 5:
                            continue;
                        case 6:
                            Invoice.exitFromApp();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }

                    break;

                case 2:
                    System.out.println("------ Mouse Menu ------");
                    System.out.println("1- Mouse");
                    System.out.println("2- Back To Main Menu");
                    System.out.println("3- Exit");
                    int choiseMouse = scanner.nextInt();
                    switch (choiseMouse) {
                        case 1:
                            Price selectedMouse = products.get(6);
                            System.out.print("Enter Quantity: ");
                            int qtyMouse = scanner.nextInt();
                            invoice.addItems(selectedMouse.getDiscription(), qtyMouse,
                                    selectedMouse.getPrice());
                            break;
                        case 2:
                            continue;
                        case 3:
                            Invoice.exitFromApp();
                            break;
                    }

                    break;

                case 3:
                    System.out.println("------ Keyboard Menu ------");
                    System.out.println("1- Keyboard");
                    System.out.println("2- Back To Main Menu");
                    System.out.println("3- Exit");
                    int choiseKeyboard = scanner.nextInt();
                    switch (choiseKeyboard) {
                        case 1:
                            Price selectedKeyboard = products.get(7);
                            System.out.print("Enter Quantity: ");
                            int qtyKeyboard = scanner.nextInt();
                            invoice.addItems(selectedKeyboard.getDiscription(), qtyKeyboard,
                                    selectedKeyboard.getPrice());
                            break;
                        case 2:
                            continue;
                        case 3:
                            Invoice.exitFromApp();
                            break;
                    }

                    break;

                case 4:
                    System.out.println("------ Hard Menu ------");
                    System.out.println("1- HDD");
                    System.out.println("2- SSD");
                    System.out.println("3- Back To Main Menu");
                    System.out.println("4- Exit");
                    System.out.println("Choose The Type Of HardDisk: ");
                    int choiseHard = scanner.nextInt();

                    switch (choiseHard) {
                        case 1:
                            Price selectedHard = products.get(8);
                            System.out.print("Enter Quantity: ");
                            int qtyKeyHard = scanner.nextInt();
                            invoice.addItems(selectedHard.getDiscription(), qtyKeyHard,
                                    selectedHard.getPrice());
                            break;
                        case 2:
                            Price selectedHard1 = products.get(9);
                            System.out.print("Enter Quantity: ");
                            int qtyKeyHard1 = scanner.nextInt();
                            invoice.addItems(selectedHard1.getDiscription(), qtyKeyHard1,
                                    selectedHard1.getPrice());
                            break;
                        case 3:
                            break;
                        case 4:
                            Invoice.exitFromApp();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }

                    break;
                // This (Case 00) Is For Print -Invoice- And Exit Program ....
                // There Is Only One Of Them In This Code ..
                case 00:
                    invoice.printInvoice();
                    Invoice.exitFromApp();
                    break;
                // This (Case 6) Is For Exit Program ....
                // There Are Many Of Them in This Code ..
                case 6:
                    Invoice.exitFromApp();
                    break;
                // The (Default) Is Work If User Enter Wrong Number ....
                // There Are Many Of Them in This Code ..
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

        }

    }

}
