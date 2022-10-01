//package complete package
package com.example.demo1.data;
// com.example.demo1.data.Address this is fully qualified name of my Address class
public class Address {
    private int houseNo;
    private String streetName;
    private String city;
    private  String country;
    private int zipCode;

    public Address(int houseNo, String streetName, String city, String country, int zipCode) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Address() {
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
//ClassName objectName = new ClassName();
