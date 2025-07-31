package Lecture_34_02Apr;

public class Cars {
    String colour;
    int price;
    int speed;

    public Cars(){

    }

    public Cars(int price,int speed,String colour){
        this.price=price;
        this.speed=speed;
        this.colour=colour;
    }
    public String toString(){
        return "P "+price+" S "+speed+" C "+colour;
    }
}
