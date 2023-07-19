 public class removeSpace {
    public String input ;

    void getInput(String input){
        this.input = input;
    }
    String getInput(){
        return input;
    }
    public String ReplaceSpace(){
        input = input.replaceAll("\\s", "");
        return input;
    }
    public static void main(String [] args){
        removeSpace input = new removeSpace();
        input.getInput("I Am a Student");
        String output = input.ReplaceSpace();
        System.out.println(output);
    }
}