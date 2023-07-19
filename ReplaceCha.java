public class ReplaceCha {
    private String stateName;
    public  ReplaceCha(){
        stateName = "Hello, World!";
    }
    public ReplaceCha(String stateName){
        this.stateName = stateName;
    }
    public String replaceO(){
        String name = stateName.replace("o" , "e").replace("e", "o");
        return name;
    }
    public static void main(String [] args) {
        ReplaceCha sr = new ReplaceCha();

        String  NewString1 = sr.replaceO();

        System.out.println(NewString1);

    }
}