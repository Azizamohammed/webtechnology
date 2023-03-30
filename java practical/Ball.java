public class Ball {
    /*int red;
    int blue;
    int green;
    int yellow;
    int pick;*/


    /*public void setDay(int red, int blue, int green,int yellow,int pick)throws ArithmeticException{
      /*   this.red = red;
        this.blue = blue;
        this.green =green;
        this.yellow =yellow;
        this.pick = pick;
        System.out.println(pick < 10);
        throw new ArithmeticException("the ball have picked more than 10");*/
    //}

   /*  public static void main(String[] args) {
        Ball bll = new Ball();
        bll.setDay(2, 3, 30, 2, 0);
    }*/
    

    int pick;

    public void sePick(int pick)throws ArithmeticException{
        this.pick = pick;
        if(pick <10){
            throw new ArithmeticException("the ball has picked more than 10");

        }
        else{
            System.out.println("valid picks");

        }
    }

    public static void main(String[]args){
        Ball bl=new Ball();
        bl.sePick(1);
    }
}
