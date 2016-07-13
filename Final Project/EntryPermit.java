import java.util.Date;

// Jerry Huang

/** Entry Permit Class */

public class EntryPermit {
	
	private String entryName;
	private String serialNum; // serial number
	private String purposeOfVisit; 
	private int durationOfVisit; // number of months
	private String entranceDate;
	
	public EntryPermit() {    // Default values
		entryName = "Default Name";
		serialNum = "Default Serial Num";
		purposeOfVisit = "Default Purpose of Visit";
		durationOfVisit = 0;
		entranceDate = "Default Entrance Date";
	}
	
	public EntryPermit(String entryName, String serialNum, String purposeOfVisit, int durationOfVisit, String entranceDate) {
		this.entryName = entryName;
		this.serialNum = serialNum;
		this.purposeOfVisit = purposeOfVisit;
		this.durationOfVisit = durationOfVisit;
		this.entranceDate = entranceDate;
	}
	
	/** Get Methods */
	public String getEntryName() {
		return entryName;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public String getPurposeOfVisit() {
		return purposeOfVisit;
	}
	public int getDurationOfVisit() {
		return durationOfVisit;
	}
	public String getEntranceDate() {
		return entranceDate;
	}
	
	/** Set Methods */
	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public void setPurposeOfVisit(String purposeOfVisit) {
		this.purposeOfVisit = purposeOfVisit;
	}
	public void setDurationOfVisit(int durationOfVisit) {
		this.durationOfVisit = durationOfVisit;
	}
	public void setEntranceDate(String entranceDate) {
		this.entranceDate = entranceDate;
	}
}
