
package com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginAuthentication_QNAME = new QName("http://ws.com/", "loginAuthentication");
    private final static QName _UpdateProfile_QNAME = new QName("http://ws.com/", "updateProfile");
    private final static QName _LoginAuthenticationResponse_QNAME = new QName("http://ws.com/", "loginAuthenticationResponse");
    private final static QName _CheckExistingPocketMoney_QNAME = new QName("http://ws.com/", "checkExistingPocketMoney");
    private final static QName _GetSummaryTotal_QNAME = new QName("http://ws.com/", "getSummaryTotal");
    private final static QName _ConvertMonthResponse_QNAME = new QName("http://ws.com/", "convertMonthResponse");
    private final static QName _RecordPocketMoney_QNAME = new QName("http://ws.com/", "recordPocketMoney");
    private final static QName _CheckExistingPocketMoneyResponse_QNAME = new QName("http://ws.com/", "checkExistingPocketMoneyResponse");
    private final static QName _GetBudgetTotal_QNAME = new QName("http://ws.com/", "getBudgetTotal");
    private final static QName _GetAllocation_QNAME = new QName("http://ws.com/", "getAllocation");
    private final static QName _RegisterAccount_QNAME = new QName("http://ws.com/", "registerAccount");
    private final static QName _ViewAllocation_QNAME = new QName("http://ws.com/", "viewAllocation");
    private final static QName _GetAllocationResponse_QNAME = new QName("http://ws.com/", "getAllocationResponse");
    private final static QName _GetBudgetTotalResponse_QNAME = new QName("http://ws.com/", "getBudgetTotalResponse");
    private final static QName _ViewAllocationResponse_QNAME = new QName("http://ws.com/", "viewAllocationResponse");
    private final static QName _RecordExpense_QNAME = new QName("http://ws.com/", "recordExpense");
    private final static QName _GetSummaryTotalResponse_QNAME = new QName("http://ws.com/", "getSummaryTotalResponse");
    private final static QName _RegisterAccountResponse_QNAME = new QName("http://ws.com/", "registerAccountResponse");
    private final static QName _ConvertMonth_QNAME = new QName("http://ws.com/", "convertMonth");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckExistingPocketMoney }
     * 
     */
    public CheckExistingPocketMoney createCheckExistingPocketMoney() {
        return new CheckExistingPocketMoney();
    }

    /**
     * Create an instance of {@link GetSummaryTotal }
     * 
     */
    public GetSummaryTotal createGetSummaryTotal() {
        return new GetSummaryTotal();
    }

    /**
     * Create an instance of {@link ConvertMonthResponse }
     * 
     */
    public ConvertMonthResponse createConvertMonthResponse() {
        return new ConvertMonthResponse();
    }

    /**
     * Create an instance of {@link UpdateProfile }
     * 
     */
    public UpdateProfile createUpdateProfile() {
        return new UpdateProfile();
    }

    /**
     * Create an instance of {@link LoginAuthentication }
     * 
     */
    public LoginAuthentication createLoginAuthentication() {
        return new LoginAuthentication();
    }

    /**
     * Create an instance of {@link LoginAuthenticationResponse }
     * 
     */
    public LoginAuthenticationResponse createLoginAuthenticationResponse() {
        return new LoginAuthenticationResponse();
    }

    /**
     * Create an instance of {@link RecordPocketMoney }
     * 
     */
    public RecordPocketMoney createRecordPocketMoney() {
        return new RecordPocketMoney();
    }

    /**
     * Create an instance of {@link CheckExistingPocketMoneyResponse }
     * 
     */
    public CheckExistingPocketMoneyResponse createCheckExistingPocketMoneyResponse() {
        return new CheckExistingPocketMoneyResponse();
    }

    /**
     * Create an instance of {@link GetBudgetTotal }
     * 
     */
    public GetBudgetTotal createGetBudgetTotal() {
        return new GetBudgetTotal();
    }

    /**
     * Create an instance of {@link GetBudgetTotalResponse }
     * 
     */
    public GetBudgetTotalResponse createGetBudgetTotalResponse() {
        return new GetBudgetTotalResponse();
    }

    /**
     * Create an instance of {@link ViewAllocationResponse }
     * 
     */
    public ViewAllocationResponse createViewAllocationResponse() {
        return new ViewAllocationResponse();
    }

    /**
     * Create an instance of {@link GetSummaryTotalResponse }
     * 
     */
    public GetSummaryTotalResponse createGetSummaryTotalResponse() {
        return new GetSummaryTotalResponse();
    }

    /**
     * Create an instance of {@link RecordExpense }
     * 
     */
    public RecordExpense createRecordExpense() {
        return new RecordExpense();
    }

    /**
     * Create an instance of {@link GetAllocation }
     * 
     */
    public GetAllocation createGetAllocation() {
        return new GetAllocation();
    }

    /**
     * Create an instance of {@link RegisterAccount }
     * 
     */
    public RegisterAccount createRegisterAccount() {
        return new RegisterAccount();
    }

    /**
     * Create an instance of {@link GetAllocationResponse }
     * 
     */
    public GetAllocationResponse createGetAllocationResponse() {
        return new GetAllocationResponse();
    }

    /**
     * Create an instance of {@link ViewAllocation }
     * 
     */
    public ViewAllocation createViewAllocation() {
        return new ViewAllocation();
    }

    /**
     * Create an instance of {@link ConvertMonth }
     * 
     */
    public ConvertMonth createConvertMonth() {
        return new ConvertMonth();
    }

    /**
     * Create an instance of {@link RegisterAccountResponse }
     * 
     */
    public RegisterAccountResponse createRegisterAccountResponse() {
        return new RegisterAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAuthentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "loginAuthentication")
    public JAXBElement<LoginAuthentication> createLoginAuthentication(LoginAuthentication value) {
        return new JAXBElement<LoginAuthentication>(_LoginAuthentication_QNAME, LoginAuthentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "updateProfile")
    public JAXBElement<UpdateProfile> createUpdateProfile(UpdateProfile value) {
        return new JAXBElement<UpdateProfile>(_UpdateProfile_QNAME, UpdateProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "loginAuthenticationResponse")
    public JAXBElement<LoginAuthenticationResponse> createLoginAuthenticationResponse(LoginAuthenticationResponse value) {
        return new JAXBElement<LoginAuthenticationResponse>(_LoginAuthenticationResponse_QNAME, LoginAuthenticationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckExistingPocketMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "checkExistingPocketMoney")
    public JAXBElement<CheckExistingPocketMoney> createCheckExistingPocketMoney(CheckExistingPocketMoney value) {
        return new JAXBElement<CheckExistingPocketMoney>(_CheckExistingPocketMoney_QNAME, CheckExistingPocketMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSummaryTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getSummaryTotal")
    public JAXBElement<GetSummaryTotal> createGetSummaryTotal(GetSummaryTotal value) {
        return new JAXBElement<GetSummaryTotal>(_GetSummaryTotal_QNAME, GetSummaryTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "convertMonthResponse")
    public JAXBElement<ConvertMonthResponse> createConvertMonthResponse(ConvertMonthResponse value) {
        return new JAXBElement<ConvertMonthResponse>(_ConvertMonthResponse_QNAME, ConvertMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordPocketMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "recordPocketMoney")
    public JAXBElement<RecordPocketMoney> createRecordPocketMoney(RecordPocketMoney value) {
        return new JAXBElement<RecordPocketMoney>(_RecordPocketMoney_QNAME, RecordPocketMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckExistingPocketMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "checkExistingPocketMoneyResponse")
    public JAXBElement<CheckExistingPocketMoneyResponse> createCheckExistingPocketMoneyResponse(CheckExistingPocketMoneyResponse value) {
        return new JAXBElement<CheckExistingPocketMoneyResponse>(_CheckExistingPocketMoneyResponse_QNAME, CheckExistingPocketMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBudgetTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getBudgetTotal")
    public JAXBElement<GetBudgetTotal> createGetBudgetTotal(GetBudgetTotal value) {
        return new JAXBElement<GetBudgetTotal>(_GetBudgetTotal_QNAME, GetBudgetTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getAllocation")
    public JAXBElement<GetAllocation> createGetAllocation(GetAllocation value) {
        return new JAXBElement<GetAllocation>(_GetAllocation_QNAME, GetAllocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "registerAccount")
    public JAXBElement<RegisterAccount> createRegisterAccount(RegisterAccount value) {
        return new JAXBElement<RegisterAccount>(_RegisterAccount_QNAME, RegisterAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "viewAllocation")
    public JAXBElement<ViewAllocation> createViewAllocation(ViewAllocation value) {
        return new JAXBElement<ViewAllocation>(_ViewAllocation_QNAME, ViewAllocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getAllocationResponse")
    public JAXBElement<GetAllocationResponse> createGetAllocationResponse(GetAllocationResponse value) {
        return new JAXBElement<GetAllocationResponse>(_GetAllocationResponse_QNAME, GetAllocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBudgetTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getBudgetTotalResponse")
    public JAXBElement<GetBudgetTotalResponse> createGetBudgetTotalResponse(GetBudgetTotalResponse value) {
        return new JAXBElement<GetBudgetTotalResponse>(_GetBudgetTotalResponse_QNAME, GetBudgetTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewAllocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "viewAllocationResponse")
    public JAXBElement<ViewAllocationResponse> createViewAllocationResponse(ViewAllocationResponse value) {
        return new JAXBElement<ViewAllocationResponse>(_ViewAllocationResponse_QNAME, ViewAllocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordExpense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "recordExpense")
    public JAXBElement<RecordExpense> createRecordExpense(RecordExpense value) {
        return new JAXBElement<RecordExpense>(_RecordExpense_QNAME, RecordExpense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSummaryTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "getSummaryTotalResponse")
    public JAXBElement<GetSummaryTotalResponse> createGetSummaryTotalResponse(GetSummaryTotalResponse value) {
        return new JAXBElement<GetSummaryTotalResponse>(_GetSummaryTotalResponse_QNAME, GetSummaryTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "registerAccountResponse")
    public JAXBElement<RegisterAccountResponse> createRegisterAccountResponse(RegisterAccountResponse value) {
        return new JAXBElement<RegisterAccountResponse>(_RegisterAccountResponse_QNAME, RegisterAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "convertMonth")
    public JAXBElement<ConvertMonth> createConvertMonth(ConvertMonth value) {
        return new JAXBElement<ConvertMonth>(_ConvertMonth_QNAME, ConvertMonth.class, null, value);
    }

}
