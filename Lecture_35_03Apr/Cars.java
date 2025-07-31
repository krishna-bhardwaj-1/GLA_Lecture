package Lecture_35_03Apr;

public class Cars //implements Comparable<Cars>
{
    String colour;
    int price;
    int speed;

    public Cars(){

    }


    public Cars(int price, int speed, String colour){
        this.price=price;
        this.speed=speed;
        this.colour=colour;
    }
    public String toString(){
        return "P "+price+" S "+speed+" C "+colour;
    }

//    @Override
//    public int compareTo(Cars o) {
////        return this.price-o.price;
//        return this.colour.compareTo(o.colour);
//    }
}
