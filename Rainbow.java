public class Rainbow{
    public enum RainbowColors{
        VIOLET(1),
        INDIGO(2),
        BLUE(3),
        GREEN(4),
        YELLOW(5),
        ORANGE(6),
        RED(7);
        private int value;
        private RainbowColors(int value){
         this.value = value;
        }
    }
    public static void showValues(){
        for(RainbowColors rb : RainbowColors.values())
        System.out.println("color code of "+ rb +" is "+rb.value);
    }
}