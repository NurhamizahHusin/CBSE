package manageBean;

import com.ws.SBMWS_Service;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import org.primefaces.context.RequestContext;

/**
 *
 * @author SUFINUKMAN
 */
@ManagedBean
@SessionScoped
public class loginMB {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SBMWS/SBMWS.wsdl")
    private SBMWS_Service service;

    private String username, name, email, password;
    private String success = null;

    public loginMB() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    // Register Method
    public String register() {

        return registerAccount(username, name, email, password);

    }

    // Login Method
    public String login() {

        this.success = loginAuthentication(username, password);

        System.out.println(success);

        if (success.equals("success")) {

            return "recordPocket.xhtml";

        } else {

            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('incorrect').show();");
            return success;
        }
    }

    private String registerAccount(java.lang.String username, java.lang.String name, java.lang.String email, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.registerAccount(username, name, email, password);
    }

    private String loginAuthentication(java.lang.String username, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.SBMWS port = service.getSBMWSPort();
        return port.loginAuthentication(username, password);
    }

}
