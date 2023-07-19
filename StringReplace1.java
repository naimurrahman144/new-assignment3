public class StringReplace1 {
    
    private String statename;
    public StringReplace1(){
        statename = "mississippi";
    }
    public StringReplace1(String statename){
        this.statename=statename;
    }
    public String replaceI(){
        String name1 = statename.replace("i","ii");
        return name1;
    }
    public String replaceSS(){
        String name2 = statename.replace("ss","s");
        return name2;
    }
    public static void main(String[] args){
        StringReplace1 sr = new StringReplace1();

        String newString1 = sr.replaceI();
        String newString2 = sr.replaceSS();

        System.out.println( newString1 +" "+ newString1.length());
        System.out.println( newString2 +" "+ newString2.length());
    }
}
