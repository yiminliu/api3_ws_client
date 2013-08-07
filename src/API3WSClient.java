/**
 * 
 */

import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;

import com.tscp.mvno.webservices.API3;
import com.tscp.mvno.webservices.API3Service;
import com.tscp.mvno.webservices.ActivateReserveSubscription;
import com.tscp.mvno.webservices.ApiActivateReserveSubscriptionResponseHolder;
import com.tscp.mvno.webservices.ApiCsaResponseHolder;
import com.tscp.mvno.webservices.ApiGeneralResponseHolder;
import com.tscp.mvno.webservices.ApiPendingSubscriptionNPAResponseHolder;
import com.tscp.mvno.webservices.ApiResellerSubInquiryResponseHolder;
import com.tscp.mvno.webservices.ApiResellerUsageInquiryRepsonseHolder;
import com.tscp.mvno.webservices.ApiSocListResponseHolder;
import com.tscp.mvno.webservices.ApicsaListResponseHolder;
import com.tscp.mvno.webservices.Csa;
import com.tscp.mvno.webservices.PendingSubscriptionNPA;
import com.tscp.mvno.webservices.PlsSali;
import com.tscp.mvno.webservices.Sali;
import com.tscp.mvno.webservices.Sali2;
import com.tscp.mvno.webservices.ServiceSub;
import com.tscp.mvno.webservices.ServiceSub2;
import com.tscp.mvno.webservices.SocProfileInfo;

/**
 * @author 
 *
 */
public class API3WSClient {
	
	public static final String serviceName = "API3Service";
	public static final String nameSpace = "http://webservices.mvno.tscp.com/";
	public static final String WSDLlocation = "http://uscaelmux23:6000/API3/API3Service?wsdl";
	//public static final String WSDLlocation = "http://localhost:6000/API3/API3Service?wsdl";
	
	private static final String DEFAULT_SERVICE_CODE = "PRSCARD5";
	private static final String SUSPEND_SVC_CODE = "PRSALL023";		
	private static final String DEFAULT_CSA ="LAXLAX213";
	private static final String ACTIVITY_SUSPEND ="SPND";
	
	private static API3Service service;
	private static API3 port;
 
	static{
		init();
	}
	
	public static void main(String[] args){
		
		API3WSClient client = new API3WSClient();
		ApiActivateReserveSubscriptionResponseHolder response = client.activateSubscription(null, "09115405414");
		//client.expireSubuscription("09115389611");		
		//client.changeServicePlanWithSuspendCoode(response.getActivateReserveSubscription().getMDN());
		//client.changeServicePlanWithSuspendCoode("2139244842");
		//client.getServiceStatus(null, "2139244842");
		//client.getServiceStatus("09111495304", null);
		//client.getUsage();
		//client.reserveMDN("LAXLAX818", DEFAULT_SERVICE_CODE);
		//client.getCSAList();
		//client.getPpSoclist("818");
		//client.getCSA();
		
	}
		
	public static void init() {	
	   try{	
		  service = new API3Service(new URL(WSDLlocation), new QName(nameSpace, serviceName));
		}
		catch (Exception e) {
	        e.printStackTrace();
	        service = new API3Service();
	    } 
		port = service.getAPI3Port(); 
	}
		
	public String getCSA(){
	    String street = "S. Grand Ave";
	    String Xstreet = "355";
	    String city = "Los Ange";
	    String state = "CA";
	    String zip = "90775";
	  
		ApiCsaResponseHolder holder = null;
		
	    try{
	    	holder = port.apIgetCSA("", "", city, state, zip);	
	    }	    
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	    System.out.println("APIResponseMessage::"+holder.getResponseMessage());
	    System.out.println("ResponseMessage::"+holder.getResponseMessage());
	    System.out.println("StatusMessage::"+holder.getStatusMessage());	  
	    System.out.println("CSA = :"+holder.getCsa());	
	    
	    return holder.getCsa();
  }
	
	public void getCSAList(){
	 	ApicsaListResponseHolder holder = null;
		
	    try{
	      holder = port.apIgetCSAList();
	    }	    
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	    System.out.println("APIResponseMessage::"+holder.getResponseMessage());
	    System.out.println("ResponseMessage::"+holder.getResponseMessage());
	    System.out.println("StatusMessage::"+holder.getStatusMessage());	
	    System.out.println("****** CSA List *****");
	    for(Csa csa : holder.getCsalist()){
	    	 System.out.println("CSA = " + csa.getDescription());
	    }
	    
  }
  public void getServiceStatus(String ESN, String MDN) {
		 
		 ApiResellerSubInquiryResponseHolder response = null;
	        try{
	            response = port.apIresellerV2SubInquiry(ESN, MDN);
	        }   
	        catch(Exception e){
	            e.printStackTrace();
	        }
	        if (response == null) {
	            System.out.println("No response returned from Network Element...");
	            System.exit(0);
	        }
	        else if (!response.getStatusMessage().equals("SUCCEED")) {
	    	    System.out.printf("Error activating Device: %s, %s\n", response.getStatusMessage(), response.getResponseMessage());
	    	    
	        }
	        else {
	        	//System.out.printf("ResponseMessage:: %s\n", response.getResponseMessage());
	    	    //System.out.printf("StatusMessage:: %s\n", response.getStatusMessage());	 
	        	//System.out.println("" + response.response.getServiceList().toString());
	        	System.out.printf("Services for MDN/ESN: %s, %s\n", MDN, ESN); 
	        	//System.out.printf("Response Message: %s\n", response.getResponseMessage());
	        	System.out.printf("Response Sataus Message: %s\n", response.getStatusMessage());
	        	//System.out.printf("Response message: %s\n", response.getIXC().getValue());
	        	if (response.getSbscrpSvcExprDt() == null || response.getSbscrpSvcExprDt().getValue().isEmpty())
	        		System.out.println("********* Service is active currently ***********");
	        	else
	        	    System.out.printf("Service Start From: %s, End At: %s\n", response.getSbscrpSvcEffDt().getValue(), response.getSbscrpSvcExprDt().getValue());	
	        		        	
	    	    System.out.println("---------------------------------------------------------------------------------------");
	        	for( PlsSali service : response.getPricePlanList().getValue()){
	        		System.out.printf("Service Code: %s(%s) Eff Date: %s Exp Date: %s\n",service.getSvcCode(), service.getSvcDesc(), service.getSvcEffDt(), service.getSvcExprDt());
	           	}
	        	System.out.println("--------------------------------------------------------------------------------------");
	        	System.out.printf("Common Service Id: %s\n", response.getCommSvcAreaId().getValue());	
	        	  
	        }	           
	}
	
     //public void getUsage(String MDN, String iESN, String iUsageType, String iFromDate, String iToDate, String iPrevEndingCallDt, String iPrevEndingCallTm) {
  public void getUsage(){
    	 ApiResellerUsageInquiryRepsonseHolder response = null;
	        try{
	        	response = port.apiResellerUsageInquiry("2132586044", "09112024944", "G3", "20121106", "20130116", "20111105", "00");
	            //response = port.apiResellerUsageInquiry(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	                      	   
	        }   
	        catch(Exception e){
	            e.printStackTrace();
	        }
	        if (response == null) {
	            System.out.println("No response returned from Network Element...");
	            System.exit(0);
	        }
	        else if (!response.getStatusMessage().equals("SUCCEED")) {
	    	    System.out.printf("Error activating Device: %s, %s\n", response.getStatusMessage(), response.getResponseMessage());
	    	    
	        }
	                  
	}
	
	public String reserveMDN(String csa, String priceplan){
		String resultingMDN = null;
	    PendingSubscriptionNPA pendingsubscription = new PendingSubscriptionNPA();
	    Sali2 sali2 = new Sali2();
	    if (priceplan == null) {
	      sali2.setSvcCode(DEFAULT_SERVICE_CODE);
	    } 
	    else {
	      sali2.setSvcCode(priceplan);
	    }
	    pendingsubscription.setPricePlans(sali2);

	    if (csa == null) {
	      pendingsubscription.setCSA(DEFAULT_CSA);
	    } else {
	      pendingsubscription.setCSA(csa);
	    }
	    ApiPendingSubscriptionNPAResponseHolder response = null;
	    try {
	        response = port.apIreserveSubscriptionNPA(pendingsubscription);
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }    
	    if (response != null) {
	    	//System.out.printf("ResponseMessage:: %s\n"+response.getResponseMessage());
    	    //System.out.printf("StatusMessage:: %s\n"+response.getStatusMessage());	 	
	      	resultingMDN = response.getSubNPA().getMDN();
	    }
	    System.out.printf("MDN: %s is reserved. ", resultingMDN);
	    
	    return resultingMDN;
	}    
  	    
	public ApiActivateReserveSubscriptionResponseHolder activateSubscription(String MDN, String ESN){
		System.out.printf("Start activating the device ESN: %s\n", ESN); 
		if(MDN == null || MDN.length() == 0)
		   MDN = reserveMDN(null, null); 	
		ActivateReserveSubscription activatereservesubscription = new ActivateReserveSubscription();
        activatereservesubscription.setESN(ESN);
        activatereservesubscription.setMDN(MDN);
        
        ApiActivateReserveSubscriptionResponseHolder response = null;
        long beginTime = System.currentTimeMillis();
        try{
            response = port.apIactivatePendingSubscription(activatereservesubscription);
        }   
        catch(Exception e){
            e.printStackTrace();
        }
        if (response == null) {
            System.out.println("No response returned from Network Element...");
        }
        else if (!response.getStatusMessage().equals("SUCCEED")) {
    	    System.out.printf("Error activating Device %s, %s ", response.getStatusMessage(), response.getResponseMessage());
    	    
        }
        else {
          System.out.printf("ESN/MDN: %1s, %2s\n successfully activated.", response.getActivateReserveSubscription().getESN(), response.getActivateReserveSubscription().getMDN());
          System.out.printf("Time taken = %d\n", System.currentTimeMillis() - beginTime);
        }
        return response;
    }	
    
  public void suspendSubscription(String MDN){
						
		ApiGeneralResponseHolder response = null;
		
	    try{
	      response = port.apIsuspendSubscription(MDN, ACTIVITY_SUSPEND);
	    }	    
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	    if (response == null) {
            System.out.println("No response returned from Network Element...");
        }
        else {
    	    System.out.printf("APIResponseMessage:: %s\n ",response.getApiResponseMessage());
	        System.out.printf("ResponseMessage:: %s\n ", response.getResponseMessage());
	        System.out.printf("StatusMessage:: %s\n ", response.getStatusMessage());
        }   
  }
  
  public void changeServicePlanWithSuspendCoode(String MDN){
			
	String SUSPEND_SVC_CODE = "PRSALL023";//"PRSHLSOC2"; //"PRSALL023";	//
	
	//String MDN =  "4695951813";
	String ACTIVITY ="SPND";
				   
	Sali2 subPricePlan = new Sali2(); 
	subPricePlan.setSvcCode(SUSPEND_SVC_CODE);
	System.out.printf("Effective Time was set to:: %s\n ", subPricePlan.getSvcEffDt());
	//subPricePlan.setSvcEffDt(new Date().toString());

	ServiceSub2 sub = new ServiceSub2();
    sub.setActivity(ACTIVITY);
	sub.setMDN(MDN);
	sub.setPricePlans(subPricePlan);
	ApiGeneralResponseHolder response = null;
	try{
	   	response = port.apIchangeServicePlans(sub);
	}
	catch(Exception e){
	  e.printStackTrace();
	}     
	if (response == null) {
        System.out.println("No response returned from Network Element...");
    }
    else {
    	System.out.printf("StatusMessage:: %s\n ", response.getStatusMessage());
	    //System.out.printf("APIResponseMessage:: %s\n ",response.getApiResponseMessage()); //always return null
        System.out.printf("ResponseMessage:: %s\n ", response.getResponseMessage());
        
    }   
  }	
  
  
  public void changeServicePlanWithRestoreCoode(){
			
	String RESTORE_SVC_CODE = "PRSHLSOC2";//"PRSALL022";
	String MDN =  "6615474629";
	String ACTIVITY = "REST"; //MODIFY_SUB_RESTORE 
				   
	Sali2 subPricePlan = new Sali2(); 
	subPricePlan.setSvcCode(RESTORE_SVC_CODE);
	
	ServiceSub2 sub = new ServiceSub2(); 
    sub.setActivity(ACTIVITY);
	sub.setMDN(MDN);
	sub.setPricePlans(subPricePlan);
	ApiGeneralResponseHolder response = null;
	try{
	   	response = port.apIchangeServicePlans(sub);
	}
	catch(Exception e){
	  e.printStackTrace();
	}     
	if (response == null) {
        System.out.println("No response returned from Network Element...");
    }
    else {
	    System.out.printf("APIResponseMessage:: %s\n ",response.getApiResponseMessage());
        System.out.printf("ResponseMessage:: %s\n ", response.getResponseMessage());
        System.out.printf("StatusMessage:: %s\n ", response.getStatusMessage());
    }   
  }	
  
  
  public void changeServices(){
			
	String SUSPEND_SVC_CODE = "PRSHLSOC2"; //"PRSALL023";	//
	String MDN =  "6615474629";
	String ACTIVITY ="SPND";
				   
	Sali subPricePlan = new Sali(); 
	subPricePlan.setSvcCode(SUSPEND_SVC_CODE);

	ServiceSub sub = new ServiceSub();
    sub.setActivity(ACTIVITY);
	sub.setMDN(MDN);
	sub.setPricePlans(subPricePlan);
	ApiGeneralResponseHolder response = null;
	try{
	   	response = port.apIchangeServices(sub);
	}
	catch(Exception e){
	  e.printStackTrace();
	}     
	if (response == null) {
        System.out.println("No response returned from Network Element...");
    }
    else {
	    System.out.printf("APIResponseMessage:: %s\n ",response.getApiResponseMessage());
        System.out.printf("ResponseMessage:: %s\n ", response.getResponseMessage());
        System.out.printf("StatusMessage:: %s\n ", response.getStatusMessage());
    }   
  }	
  
    
  public void restoreSubscription(){
 	String MDN =  "6615474629";
	ApiGeneralResponseHolder response = null;
	try{
	   	response = port.apIrestoreSubscription(MDN);
	}
	catch(Exception e){
	  e.printStackTrace();
	}     
	if (response == null) {
        System.out.println("No response returned from Network Element...");
    }
    else {
	    System.out.printf("APIResponseMessage:: %s\n ",response.getApiResponseMessage());
        System.out.printf("ResponseMessage:: %s\n ", response.getResponseMessage());
        System.out.printf("StatusMessage:: %s\n ", response.getStatusMessage());
    }   
  }	
  
  public void expireSubuscription(String MDN){
		ApiGeneralResponseHolder response = null;
		try{
	        response = port.apIexpireSubscription(MDN, "");
	    }	    
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	    if (response == null) {
            System.out.println("No response returned from Network Element...");
        }
        else {
    	    System.out.printf("APIResponseMessage:: %s\n ",response.getApiResponseMessage());
	        System.out.printf("ResponseMessage:: %s\n ", response.getResponseMessage());
	        System.out.printf("StatusMessage:: %s\n ", response.getStatusMessage());
        }   	    
  }
  
  
   public void getPpSoclist(String csa){
   	  
	    ApiSocListResponseHolder response = null;
		
	    try{
	      response = port.apIgetPpSoclist(csa);
	    }	    
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	    if (response == null) {
            System.out.println("No response returned from Network Element...");
        }
        else {
    	    System.out.printf("ResponseMessage:: %s\n ", response.getResponseMessage());
	        System.out.printf("StatusMessage:: %s\n ", response.getStatusMessage());
        }   
	    for(SocProfileInfo socProfileInfo : response.getSocProfileInfo()){
	    	System.out.println("SOC = "+ socProfileInfo.getSoc());
	    	System.out.println("SOC description = "+ socProfileInfo.getSocDescription());
	    }
    }    

}
