package manageBean;

import com.ws.SBMWS_Service;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;


@ManagedBean
@ViewScoped
public class viewAllocationMB {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SBMWS/SBMWS.wsdl")
    private SBMWS_Service service;

    @ManagedProperty(value = "#{loginMB}")
    private loginMB loginMb;
    private String LoggedInUsername, month;
    private double wants, needs, saving;
    private List<Double> categoriesid;

    public viewAllocationMB() {
    }

    public String getLoggedInUsername() {
        return loginMb.getUsername();
    }

    public void setLoggedInUsername(String LoggedInUsername) {
        this.LoggedInUsername = LoggedInUsername;
    }

    public List<Double> getCategoriesid() {
        return categoriesid;
    }

    public void setCategoriesid(List<Double> categoriesid) {
        this.categoriesid = categoriesid;
    }

    public loginMB getLoginMb() {
        return loginMb;
    }

    public void setLoginMb(loginMB loginMb) {
        this.loginMb = loginMb;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getWants() {
        return wants;
    }

    public void setWants(double wants) {
        this.wants = wants;
    }

    public double getNeeds() {
        return needs;
    }

    public void setNeeds(double needs) {
        this.needs = needs;
    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    @PostConstruct
    public void setViewAllocation() {

        this.wants = 0;

        this.needs = 0;

        this.saving = 0;

        for (int i = 1; i <= 3; i++) {
            double a = viewAllocation(loginMb.getUsername(), month, i);
            if (i == 1) {
                this.wants = a;
            } else if (i == 2) {
                this.needs = a;
            } else if (i == 3) {
                this.saving = a;
            }
        }

    }

    private double viewAllocation(java.lang.String loggedInUser, java.lang.String month, int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.viewAllocation(loggedInUser, month, id);
    }

}
