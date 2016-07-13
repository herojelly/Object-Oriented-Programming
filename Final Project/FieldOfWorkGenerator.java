/** Field of Work Generator */

public class FieldOfWorkGenerator {
	private String fieldOfWork;
	
	public FieldOfWorkGenerator() {
		int random = (int)(Math.random() * 11);
		switch (random) {
			case 0: fieldOfWork = "Medical"; break;
			case 1: fieldOfWork = "Labor"; break;
			case 2: fieldOfWork = "Engineering"; break;
			case 3: fieldOfWork = "Architecture"; break;
			case 4: fieldOfWork = "Art"; break;
			case 5: fieldOfWork = "Design"; break;
			case 6: fieldOfWork = "Business"; break;
			case 7: fieldOfWork = "Education"; break;
			case 8: fieldOfWork = "Sciences"; break;
			case 9: fieldOfWork = "Law"; break;
			case 10: fieldOfWork = "Communications"; break;
		}
	}
	
	public String getField() {
		return fieldOfWork;
	}
	
	public void setField(String fieldOfWork) {
		this.fieldOfWork = fieldOfWork;
	}
}
