import javax.management.MBeanAttributeInfo;

public class Holiday {

    String name;
    int day;
    String month;

    

    public Holiday (String name, int day, String month){
        this. name = name;
        this.day = day;
        this. month = month;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public boolean inSameMonth(Holiday holiday2){
        if(this.month.equals(holiday2.month)){
            return true;

        }else{
            return false;
        }
        
    
    }

    public static void main(String[] args) {
        Holiday hl= new Holiday("Nyerere", 1, "october");
       // System.out.printl(hl.isSameMonth());
       System.out.println(hl.inSameMonth(hl));


    }
}
