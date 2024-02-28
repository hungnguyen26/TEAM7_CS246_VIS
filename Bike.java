/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bike;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author anhvuha
 */
public abstract class Bike implements IMotoBike{
    String bikeID;
    String manufacturer;
    Date entryDate;
    double price;
    double num;
    abstract double discout(); 

    public Bike(String bikeID, String manufacturer, Date entryDate, double price, double num) {
        this.bikeID = bikeID;
        this.manufacturer = manufacturer;
        this.entryDate = entryDate;
        this.price = price;
        this.num = num;
    }

    public String getBikeID() {
        return bikeID;
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter bike ID :");
        bikeID = sc.nextLine();
        System.out.println("Enter manufacturer :");
        manufacturer = sc.nextLine();
        System.out.println("Enter entry date (dd-MM-yyyy):");
        try {
            entryDate = df.parse(sc.nextLine());
        } catch (ParseException ex) {
            System.out.println("Loi");
        }
        System.out.println("Enter price :");
        price = sc.nextDouble();
        System.out.println("Enter num :");
        num = sc.nextDouble();
    }
    public void output(){
        System.out.println("Bike ID: " + bikeID);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Entry Date: " + new SimpleDateFormat("dd-MM-yyyy").format(entryDate));
        System.out.println("Price: " + price);
        System.out.println("Number: " + num);
    }
        
   abstract double discount();
}
