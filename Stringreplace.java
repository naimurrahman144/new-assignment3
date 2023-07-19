public class Stringreplace {
    private String statename;
    public Stringreplace(){
        statename = "mississippi";
    }
    public Stringreplace(String statename){
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
}


