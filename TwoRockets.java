public class TwoRockets{
    public static void main(String[] args) {
        top_bottom();
        centerBox();
        unitedStates();
        centerBox();
        top_bottom();
    }
    static void top_bottom(){
        print(" /\\\t" + " /\\");
        print(" / \\\t"+"/ \\");
        print(" / \\\t"+" / \\");
    }
    static void centerBox(){
        print("+------+"+"+------+");
        print("||"+"||");
        print("||"+"||");
        print("+------+"+"+------+");
    }
    static void unitedStates(){
        print("|United|"+"|United|");
        print("|States|"+"|States|");
    }
    static void print(String string){
        System.out.println(string);

    }
}

  
