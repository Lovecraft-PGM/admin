/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author Santiago
 */
public class providersBean {

    public providersBean(String id, String legalName, String commercialName,
            String email, String phone, String paramCity, String address,
            String nameContact, String paramBank, String paramAccount,String account,
            String paramState) {

        this.id = id;
        this.legalName = legalName;
        this.commercialName = commercialName;
        this.email = email;
        this.phone = phone;
        this.paramCity = paramCity;
        this.address = address;
        this.nameContact = nameContact;
        this.paramBank = paramBank;
        this.paramAccount = paramAccount;
        this.account = account;
        this.paramState = paramState;

    }
    private String id;
    private String legalName;
    private String commercialName;
    private String email;
    private String phone;
    private String paramCity;
    private String address;
    private String nameContact;
    private String paramBank;
    private String paramAccount;
    private String account;
    private String paramState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParamCity() {
        return paramCity;
    }

    public void setParamCity(String paramCity) {
        this.paramCity = paramCity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getParamBank() {
        return paramBank;
    }

    public void setParamBank(String paramBank) {
        this.paramBank = paramBank;
    }

    public String getParamAccount() {
        return paramAccount;
    }

    public void setParamAccount(String paramAccount) {
        this.paramAccount = paramAccount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getParamState() {
        return paramState;
    }

    public void setParamState(String paramState) {
        this.paramState = paramState;
    }

    

}
