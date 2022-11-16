package ClassAndObject;
class HumanBeingh{
    public int walk(int distance, int time){
        return time;
    }
}
class athlete extends HumanBeingh{
    public int walk(int distance,int time){
        int speed =distance/time;
        speed=speed*2;
        return speed;
    }
}
public class oops {
    public static void main (String[]args){
    }
}
