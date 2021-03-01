public class Holiday {
private String name;
private int day;
private String month;

Holiday(){
	this.name=null;
	this.day=0;
	this.month=null;
}
Holiday(String name, int day, String month){
	this.name=name;
	this.day=day;
	this.month=month;
}
//------------------------------------------------
//Settere

public void setMonth(String month) {
this.month=month;	
}
public void setDay(int day) {
	this.day=day;
}
//------------------------------------------------
//Getters

public String getMonth() {
	return this.month;
}

public String getName() {
	return this.name;
}
public int getDay() {
	return this.day;
}

//------------------------------------------------
public Boolean sameMonth(String month) {
	if(this.month==month) {
	return true;
	}else {
		return false;
	}
}
public void printData() {
	System.out.println('|'+"Name Of The Holiday: "+this.name+'|'+"\n|Day Of The Holiday: "+this.day+'|'+"\n|Month of The Holiday: "+this.month+'|');
}
}
