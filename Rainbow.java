public class Rainbow{
    public enum Rainbowcolors{
        voilet(1),
        indigo(2),
        blue(3),
        green(4),
        yellow(5),
        orange(6),
        red(7);
        private int value;
        private Rainbowcolors(int value){
         this.value = value;
        }
    }
    public static void getValues(){
        for(Rainbowcolors rb : Rainbowcolors.values())
        System.out.println("color code of "+ rb +" is "+rb.value);
    }
}