public class ReturnArea {
    int hight = 20;
    int width = 10;
    public void Area(){
        int ans = hight * width  ;
        System.out.println(ans);
    }
    public static void main(String [] args){
        ReturnArea result = new ReturnArea();
        result.Area();
    }
}