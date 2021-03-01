public class main{

    public static void main(String[] args) {
Holiday Christmas= new Holiday("Christmas", 25, "December");
Holiday Easter= new Holiday("Easter", 4, "April");
Holiday IndependenceDay= new Holiday("Independence Day", 4, "July");
//Some Testing

//Setting Different Values For int day:
Christmas.setDay(10);
Easter.setDay(15);
IndependenceDay.setDay(21);

//Printing The Data Of The Holidays

System.out.println("---------------------------------------------");
  Christmas.printData();
System.out.println("---------------------------------------------");
  Easter.printData();
System.out.println("---------------------------------------------");
  IndependenceDay.printData();
System.out.println("---------------------------------------------");

//Getting Only The Day Of A Holiday:
System.out.println(Christmas.getDay());
System.out.println(Easter.getDay());
System.out.println(IndependenceDay.getDay());

//Setting A Different Value For String Month:

  Christmas.setMonth("July");
  Easter.setMonth("January");
  IndependenceDay.setMonth("March");
  
  //Printing The Data Of The Holidays With The Changes:
  
  System.out.println("---------------------------------------------");
  Christmas.printData();
System.out.println("---------------------------------------------");
  Easter.printData();
System.out.println("---------------------------------------------");
  IndependenceDay.printData();
System.out.println("---------------------------------------------");

//Getting Only The Month Of A Holiday:

System.out.println(Christmas.getMonth());
System.out.println(Easter.getMonth());
System.out.println(IndependenceDay.getMonth());

//Setting The Name Of An Holiday: 

Christmas.setName("Test Name#1");
Easter.setName("Test Name#2");
IndependenceDay.setName("Test Name#3");

//Printing The Data Of The Holidays With The Changes:

  System.out.println("---------------------------------------------");
  Christmas.printData();
System.out.println("---------------------------------------------");
  Easter.printData();
System.out.println("---------------------------------------------");
  IndependenceDay.printData();
System.out.println("---------------------------------------------");

//Getting Only The Name Of An Holiday: 

  System.out.println(Christmas.getName());
System.out.println(Easter.getName());
System.out.println(IndependenceDay.getName());
    }
} 
