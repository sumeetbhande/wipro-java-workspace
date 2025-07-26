package exceptionHandling;

//Task 1: Interface with Abstract + Default Method
interface RemoteControl {
 // Abstract method - must be implemented by classes
 void turnOn();
 
 // Default method - provides a default implementation
 default String batteryStatus() {
     return "Battery level: 85%";
 }
 
 // Task 2: Static method in interface
 static void info() {
     System.out.println("RemoteControl Interface - Version 1.0");
     System.out.println("Supports basic remote control operations");
 }
}

//Task 1: Implementing RemoteControl in TV class
class TV implements RemoteControl {
 private String brand;
 private boolean isOn;
 
 public TV(String brand) {
     this.brand = brand;
     this.isOn = false;
 }
 
 // Must implement the abstract method
 @Override
 public void turnOn() {
     isOn = true;
     System.out.println(brand + " TV is now ON");
 }
 
 // Can optionally override the default method
 @Override
 public String batteryStatus() {
     return "Remote battery level: 92% (TV Remote)";
 }
 
 public void turnOff() {
     isOn = false;
     System.out.println(brand + " TV is now OFF");
 }
 
 public String getStatus() {
     return brand + " TV is " + (isOn ? "ON" : "OFF");
 }
}

//Task 3: Multiple Interfaces
interface Printable {
 void print(String document);
 
 // Default method in Printable interface
 default String getPrintStatus() {
     return "Printer ready";
 }
}

interface Scannable {
 void scan(String document);
 
 // Default method in Scannable interface
 default String getScanStatus() {
     return "Scanner ready";
 }
}

//Task 3: Class implementing multiple interfaces
class MultifunctionPrinter implements Printable, Scannable {
 private String model;
 private int paperCount;
 
 public MultifunctionPrinter(String model, int paperCount) {
     this.model = model;
     this.paperCount = paperCount;
 }
 
 // Implementing Printable interface
 @Override
 public void print(String document) {
     if (paperCount > 0) {
         System.out.println("Printing: " + document + " on " + model);
         paperCount--;
     } else {
         System.out.println("Cannot print - No paper left!");
     }
 }
 
 // Implementing Scannable interface
 @Override
 public void scan(String document) {
     System.out.println("Scanning: " + document + " using " + model);
 }
 
 // Override default methods if needed
 @Override
 public String getPrintStatus() {
     return "Printer ready - Paper: " + paperCount + " sheets";
 }
 
 @Override
 public String getScanStatus() {
     return "Scanner ready - " + model + " scanner active";
 }
 
 public void addPaper(int sheets) {
     paperCount += sheets;
     System.out.println("Added " + sheets + " sheets. Total: " + paperCount);
 }
}

//Demo class to test all functionality
public class InterfaceDemo {
 public static void main(String[] args) {
     System.out.println("=== Task 1: Interface with Abstract + Default Method ===");
     
     // Create TV instance
     TV samsungTV = new TV("Samsung");
     
     // Use abstract method
     samsungTV.turnOn();
     
     // Use default method
     System.out.println(samsungTV.batteryStatus());
     
     // Check TV status
     System.out.println(samsungTV.getStatus());
     samsungTV.turnOff();
     
     System.out.println("\n=== Task 2: Static Method in Interface ===");
     
     // Call static method using interface name
     RemoteControl.info();
     
     System.out.println("\n=== Task 3: Multiple Interfaces ===");
     
     // Create multifunction printer
     MultifunctionPrinter printer = new MultifunctionPrinter("HP LaserJet Pro", 100);
     
     // Test Printable interface methods
     System.out.println(printer.getPrintStatus());
     printer.print("Annual Report.pdf");
     printer.print("Meeting Notes.docx");
     
     // Test Scannable interface methods
     System.out.println(printer.getScanStatus());
     printer.scan("Contract.pdf");
     
     // Add more paper
     printer.addPaper(50);
     System.out.println(printer.getPrintStatus());
     
     System.out.println("\n=== Demonstrating Interface Features ===");
     
     // Using interface reference
     RemoteControl remote = new TV("LG");
     remote.turnOn();
     System.out.println(remote.batteryStatus());
     
     // Multiple interface references
     Printable printDevice = new MultifunctionPrinter("Canon", 25);
     Scannable scanDevice = new MultifunctionPrinter("Epson", 50);
     
     printDevice.print("Test Page");
     scanDevice.scan("Important Document");
     
     System.out.println(printDevice.getPrintStatus());
     System.out.println(scanDevice.getScanStatus());
 }
}