package manageBean;

import com.ws.SBMWS_Service;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

@ManagedBean
@RequestScoped
public class summaryMB {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SBMWS/SBMWS.wsdl")
    private SBMWS_Service service;

    @ManagedProperty(value = "#{loginMB}")
    private loginMB loginMb;
    private String LoggedInUsername;

    private double wantsTotal, needsTotal, savingTotal;
    private double wantsBalanced, needsBalanced, savingBalanced;

    private String month;

    public summaryMB() {

    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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

    public double getWantsTotal() {
        return wantsTotal;
    }

    public void setWantsTotal(double wantsTotal) {
        this.wantsTotal = wantsTotal;
    }

    public double getNeedsTotal() {
        return needsTotal;
    }

    public void setNeedsTotal(double needsTotal) {
        this.needsTotal = needsTotal;
    }

    public double getSavingTotal() {
        return savingTotal;
    }

    public void setSavingTotal(double savingTotal) {
        this.savingTotal = savingTotal;
    }

    public double getWantsBalanced() {
        return wantsBalanced;
    }

    public void setWantsBalanced(double wantsBalanced) {
        this.wantsBalanced = wantsBalanced;
    }

    public double getNeedsBalanced() {
        return needsBalanced;
    }

    public void setNeedsBalanced(double needsBalanced) {
        this.needsBalanced = needsBalanced;
    }

    public double getSavingBalanced() {
        return savingBalanced;
    }

    public void setSavingBalanced(double savingBalanced) {
        this.savingBalanced = savingBalanced;
    }

    @PostConstruct
    public void summaryUpdate() {

        for (int i = 1; i <= 3; i++) {
            double a = getSummaryTotal(loginMb.getUsername(), month, i);
            if (i == 1) {
                this.wantsTotal = a;
            } else if (i == 2) {
                this.needsTotal = a;
            } else if (i == 3) {
                this.savingTotal = a;
            }
        }

        for (int i = 1; i <= 3; i++) {
            double a = getBudgetTotal(loginMb.getUsername(), month, i);
            if (i == 1) {
                this.wantsBalanced = a - wantsTotal;
            } else if (i == 2) {
                this.needsBalanced = a - needsTotal;
            } else if (i == 3) {
                this.savingBalanced = a - savingTotal;
            }
        }

    }

    private double getSummaryTotal(java.lang.String loggedInUser, java.lang.String month, int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.getSummaryTotal(loggedInUser, month, id);
    }

    private double getBudgetTotal(java.lang.String loggedInUser, java.lang.String month, int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.getBudgetTotal(loggedInUser, month, id);
    }

}
