/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customermanagement;

/**
 *
 * @author WIN-PRO
 */
public class Customermanagement {

    private String iD;
    private String name;
    private String phoneNO;
    private String purchasedDate;
    private String dateOfBirth;
    private String address;

    public Customermanagement() {
    }

    public Customermanagement(String iD, String name, String phoneNO, String purchasedDate, String dateOfBirth, String address) {
        this.iD = iD;
        this.name = name;
        this.phoneNO = phoneNO;
        this.purchasedDate = purchasedDate;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public String getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(String purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
