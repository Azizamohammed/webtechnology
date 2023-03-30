public class Holiday {
 //declaring variables
 private String name;
 private int day;
 private String month;
 //creating constructor that will Initialize variables
 public Holiday(String name, int day, String month) {
  this.name = name;
  this.day = day;
  this.month = month;
 }
 //sameMonth method
 public boolean sameMonth(Holiday holi) {
  //check if both month are equals
  if((holi.month).equalsIgnoreCase(this.month))
   return true;
  else
   return false;
 }
 public double aveDate(Holiday [] holidays) {
  //declaring variable to hold sum
  double sum=0;
  //iterate over array
  for(Holiday h:holidays) {
   //add days
   sum=sum+h.day;
  }
  //find and return average
  return sum/holidays.length;
 }
 
 public static void main(String[] args) {
  //creating Holiday object with values
  Holiday holi=new Holiday("Independence Day", 4, "July");
        System.out.println(holi);
 }
 
 

}