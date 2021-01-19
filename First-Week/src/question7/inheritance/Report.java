package question7.inheritance;

import java.util.Date;

public class Report {

	 private String name;
	 private String result;
	 private Date createDate;
	 
	 
	 public String getName() {
		 
		 return this.name;
	 }
	 public void setName(String _name) {
		  
		 this.name = _name;
	 }
	 
	 public String getResult() {
		 
		 return this.result;
	 }
	 public void setResult(String _result) {
		 
		 this.result = _result;
		 
	 }
	 
	 public Date getCreateDate() {
		 
		 return this.createDate;
	 }
	 public void setCreateDate(Date _createDate) {
		 
		 this.createDate = _createDate;
	 }
	 
}
