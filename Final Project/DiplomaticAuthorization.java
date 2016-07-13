// Jerry Huang

/** Diplomatic Authorization Class */

public class DiplomaticAuthorization {
	private String diplomatName;
	private String serialNum;
	private String[] allowedEntries;
	
	public DiplomaticAuthorization() {   // default values
		diplomatName = "Defaul Diplomat Name";
		serialNum = "Defaul Serial Num";
		String[] allowedEntries = new String[10];
	}
	public DiplomaticAuthorization(String diplomatName, String serialNum, String[] allowedEntries) {
		this.diplomatName = diplomatName;
		this.serialNum = serialNum;
		this.allowedEntries = allowedEntries;
	}
	
	/** Get Methods */
	public String getDiplomatName() {
		return diplomatName;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public String[] getAllowedEntries() {
		return allowedEntries;
	}
	
	/** Set Methods */
	public void setDiplomatName(String diplomatName) {
		this.diplomatName = diplomatName;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public void setAllowedEntries(String[] allowedEntries) {
		this.allowedEntries = allowedEntries;
	}
}
