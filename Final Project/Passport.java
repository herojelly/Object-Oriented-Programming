import java.awt.Component;

import javax.swing.JOptionPane;


public class Passport {
	
	private String issueCountry;
	private String name;
	private String dob;
	private boolean sex;
	private String exDate;
	private String iDNum;
	private String issueCity;
	private int weight, height;
	private int pictureNumber;
	
	public Passport(){
		this.issueCountry="Default";
		this.name="John Doe";
		this.dob="00/00/0000";
		this.sex=false;
		this.exDate="00/00/0000";
		this.iDNum="Default";
	}
	
	public Passport(String issueCountry, String name, String dob, boolean sex, String issueCity, String exDate, String iDNum, int weight, int height, int pictureNumber){
		this.issueCountry=issueCountry;
		this.name=name;
		this.dob=dob;
		this.sex=sex;
		this.issueCity = issueCity;
		this.exDate=exDate;
		this.iDNum=iDNum;
		this.weight = weight;
		this.height = height;
		this.pictureNumber = pictureNumber;
	}
	
	
	public String getIssueCountry(){
		return issueCountry;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDob(){
		return dob;
	}
	
	public char getSex(){
		if (sex)
			return 'M';
		else
			return 'F';
	}
	
	public String getIssueCity() {
		return issueCity;
	}
	
	public String getExDate(){
		return exDate;
	}
	
	public String getIDNum(){
		return iDNum;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getPictureNumber() {
		return pictureNumber;
	}
	
	public void setIssueCountry(String issueCountry){
		this.issueCountry=issueCountry;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setDob(String dob){
		this.dob=dob;
	}
	
	public void setSex(boolean sex){
		this.sex=sex;
	}
	
	public void setIssueCity(String issueCity) {
		this.issueCity = issueCity;
	}
	
	public void setExDate(String exDate){
		this.exDate=exDate;
	}
	
	public void setIDNum(String iDNum){
		this.iDNum=iDNum;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setPictureNumber(int pictureNumber) {
		this.pictureNumber = pictureNumber;
	}
	
	public void printPassport(){
		JOptionPane.showMessageDialog(null,
			   issueCountry+ " Passport"
			    + "\n Name: "+name
			    +"\n Date of Birth: "+dob
			    +"\n Sex: "+sex
			    +"\n Experation Date: "+exDate
			    +"\n ID Number: "+iDNum);
	}
}
