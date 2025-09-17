public class enumexample{
    
    enum week {
        Monday,tuesday,wednesday, thursday,friday,saturday,sunday

        //these enum are cont
        //public, static, and final
        //it's final so cant inherited.

        week(){
            System.out.print("Contructor is colled for"+this.toString());
        }
    }
    public static void main(String[] args) {
        week w;
        w = week.Monday;
        System.out.println(w);

        for(week day: week.values()){
            System.out.println(day);
        }

        System.out.println(w.ordinal());
        
    }
}