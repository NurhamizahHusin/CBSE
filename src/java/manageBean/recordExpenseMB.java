/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;
import com.ws.SBMWS_Service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

@ManagedBean
@RequestScoped
public class recordExpenseMB {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SBMWS/SBMWS.wsdl")
    private SBMWS_Service service;

    @ManagedProperty(value = "#{loginMB}")
    private loginMB loginMb;
    private String LoggedInUsername;

    private double amount, totalspent;
    private String categoriesID, date, pocketNo, month, monthforsummary;

    public recordExpenseMB() {
    }

    public loginMB getLoginMb() {
        return loginMb;
    }

    public void setLoginMb(loginMB loginMb) {
        this.loginMb = loginMb;
    }

    public String getLoggedInUsername() {
        return LoggedInUsername;
    }

    public void setLoggedInUsername(String LoggedInUsername) {
        this.LoggedInUsername = LoggedInUsername;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotalspent() {
        return totalspent;
    }

    public void setTotalspent(double totalspent) {
        this.totalspent = totalspent;
    }

    public String getCategoriesID() {
        return categoriesID;
    }

    public void setCategoriesID(String categoriesID) {
        this.categoriesID = categoriesID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPocketNo() {
        return pocketNo;
    }

    public void setPocketNo(String pocketNo) {
        this.pocketNo = pocketNo;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonthforsummary() {
        return monthforsummary;
    }

    public void setMonthforsummary(String monthforsummary) {
        this.monthforsummary = monthforsummary;
    }

    public void insertexpense() {

        month = convertMonth(date);

        recordExpense(loginMb.getUsername(), month, categoriesID, amount, date);

    }

    private String convertMonth(java.lang.String date) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.convertMonth(date);
    }

    private void recordExpense(java.lang.String loggedInUser, java.lang.String month, java.lang.String categoriesID, double amount, java.lang.String date) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        port.recordExpense(loggedInUser, month, categoriesID, amount, date);
    }

}
