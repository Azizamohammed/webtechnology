public class Illegal {
    int  x;

    public void setx(int x)throws ArithmeticException{
        this.x =x;
        System.out.println(x / 0);
            throw new ArithmeticException("undefine number");

        }


    public static void main(String[]args){
        Illegal ill= new Illegal();
        ill.setx(10);
    }
    
}
