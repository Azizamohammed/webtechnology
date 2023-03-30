public class Exception{
    int marks;

    public void setMarks(int marks)throws IllegalArgumentException{
        this.marks = marks;
        if(marks < 16){
            throw new IllegalArgumentException("spplimentary");
        }
        else{
            System.out.println("passed");
        }
    }
    public static void main(String[] args) {
        Exception exp= new Exception();   
        exp.setMarks(16);
        
    }
}