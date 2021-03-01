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
public void setName(String name){
	this.name=name;
}
//------------------------------------------------
//Getters

public String getMonth() {
	return "The Month Of The Holiday: "+this.month+'('+this.name+')';
}

public String getName() {
	return "The Name Of The Holiday: "+this.name+'('+this.name+')';
}
public String getDay() {
	return "The Day Of The Holiday: "+this.day+'('+this.name+')';
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
