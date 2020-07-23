package manageBean;

import com.ws.SBMWS_Service;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import org.primefaces.context.RequestContext;

@ManagedBean
@RequestScoped
public class recordMB {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SBMWS/SBMWS.wsdl")
    private SBMWS_Service service;

    @ManagedProperty(value = "#{loginMB}")
    private loginMB loginMb;
    private String LoggedInUsername;

    private String month;
    private int year;
    private double pocketMoney;

    private double wants, needs, saving;

    private List<Double> allocation;

    public recordMB() {
    }

    public double getWants() {
        return wants;
    }

    public double getNeeds() {
        return needs;
    }

    public double getSaving() {
        return saving;
    }

    public List<Double> getAllocation() {
        return allocation;
    }

    public void setAllocation(List<Double> allocation) {
        this.allocation = allocation;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPocketMoney() {
        return pocketMoney;
    }

    public void setPocketMoney(double pocketMoney) {
        this.pocketMoney = pocketMoney;
    }

    public loginMB getLoginMb() {
        return loginMb;
    }

    public void setLoginMb(loginMB loginMb) {
        this.loginMb = loginMb;
    }

    public String getLoggedInUsername() {
        return loginMb.getUsername();
    }

    public void setLoggedInUsername(String LoggedInUsername) {
        this.LoggedInUsername = LoggedInUsername;
    }

    public void intoDatabase() throws SQLException {

        allocation = getAllocation(pocketMoney);

        int exist = checkExistingPocketMoney(loginMb.getUsername(), month);

        System.out.println(exist);

        if (exist == 1) {
            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('existed').show();");

        } else if (exist == 0) {

            recordPocketMoney(loginMb.getUsername(), pocketMoney, month, allocation);

            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('submitRecord').show();");

        }

    }

    private java.util.List<java.lang.Double> getAllocation(double pocketMoney) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.getAllocation(pocketMoney);
    }

    private void recordPocketMoney(java.lang.String loggedInUser, double pocketMoney, java.lang.String month, java.util.List<java.lang.Double> allocation) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        port.recordPocketMoney(loggedInUser, pocketMoney, month, allocation);
    }

    private int checkExistingPocketMoney(java.lang.String loggedInUser, java.lang.String month) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.checkExistingPocketMoney(loggedInUser, month);
    }

}
