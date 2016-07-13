import java.util.Date;

// Jerry Huang

/** Work Permit Class */

public class WorkPermit {
	private String workName;
	private String fieldOfWork; // int value for work
	private String expDate;
	
	public WorkPermit() {
		workName = "Default Work Name";
		fieldOfWork = "Default Field of Work";
		expDate = "00/00/0000";
	}
	public WorkPermit(String workName, String fieldOfWork, String expDate) {
		this.workName = workName;
		this.fieldOfWork = fieldOfWork;
		this.expDate = expDate;
	}
	
	/** Get Methods */
	public String getWorkName() {
		return workName;
	}
	public String getFieldOfWork() {
		return fieldOfWork;
	}
	public String getExpDate() {
		return expDate;
	}
	
	/** Set Methods */
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public void setFieldOfWork(String fieldOfWork) {
		this.fieldOfWork = fieldOfWork;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
