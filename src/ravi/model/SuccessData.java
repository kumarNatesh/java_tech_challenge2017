package ravi.model;

public class SuccessData {

	 private String accountIdentifier;
	    private String success;
	    public SuccessData(String accountIdentifier,String success)
	    {
	        this.accountIdentifier=accountIdentifier;
	        this.success=success;
	        
	        
	    }
	    
	    public SuccessData()
	    {
	    
	    
	    }

	    public String getAccountIdentifier() {
	        return accountIdentifier;
	    }

	    public void setAccountIdentifier(String accountIdentifier) {
	        this.accountIdentifier = accountIdentifier;
	    }

	    public String  getSuccess() {
	        return success;
	    }

	    public void setSuccess(String string) {
	        this.success = string;
	    }
}
