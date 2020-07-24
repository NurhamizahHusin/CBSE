package manageBean;

import com.ws.SBMWS_Service;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;
import org.primefaces.context.RequestContext;

@ManagedBean
@RequestScoped
public class editProfileMB {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SBMWS/SBMWS.wsdl")
    private SBMWS_Service service;

    @ManagedProperty(value = "#{loginMB}")
    private loginMB loginMb;
    private String LoggedInUsername;

    private String username, email, password, name;

    public editProfileMB() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    // Update User Profile 
    public void updateDatabase() {

        updateProfile(loginMb.getUsername(), name, email, password);

        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('update').show();");

    }

    private void updateProfile(java.lang.String loggedInUser, java.lang.String name, java.lang.String email, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        port.updateProfile(loggedInUser, name, email, password);
    }
}
