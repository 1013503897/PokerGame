package Game;

public class Card implements Comparable<Card>{
    public static String colorArray[] = new String[]{"梅花","方块","红桃","黑桃"};
    public static String numberArray[] = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private int number;
    private int color;
    public Card(int color,int number){
        this.number = number;
        this.color = color;
    }

    @Override
    public int compareTo(Card o) {
        if(this.number>o.number){
            return 1;
        }else if(this.number<o.number){
            return -1;
        }else{
            if(this.color>o.color){
                return 1;
            }else if(this.color<o.color){
                return -1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return colorArray[color] +numberArray[number];
    }
}
