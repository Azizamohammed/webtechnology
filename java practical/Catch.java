public class Catch {
    int day;

    public void setDay(int day){
        try{
            this.day = day;
            System.out.println(day/3);


        }
        catch(ArithmeticException x ){
            System.out.println("u cant divide by zero");

        }
        
    }



    public static void main(String[] args) {
           Catch ct= new Catch();
           ct.setDay(6);        
        
    }
    
}
