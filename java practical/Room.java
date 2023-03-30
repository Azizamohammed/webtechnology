public class Room {
    double width;
    double length;
    int floor;


    public Room(double width, double length,int floor){
        this.width = width;
        this.length = length;
        this.floor = floor;
    }

    public void setWidth(double width){
        if(width <=0){
            this.width = width;
        }
        else{
            System.out.println(width);
        }
    }
    public double getWidth(){
        return width;
    }

    public void setLengthg(double length){
        if(length <= 0 ){
            this.length = length;
        }
        else{
            System.out.println(length);
        }
    }

    public void setfloor(int floor){
        this.floor = floor;
    }
    public int getFloor(){
        return floor;
    }
    

}

