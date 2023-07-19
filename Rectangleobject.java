public class Rectangleobject {
    public int hight , width ;

    void setHight(int higth){
        this.hight = higth;
    }
    void setWidth(int width){
        this.width = width;
    }
    int getHight(){
        return hight;
    }
    int getWidth(){
        return width;
    }
    public int getParameter(){
        int result = (hight + width) * 2;
        return result;
    }
    public static void main(String [] args){
        Rectangleobject parameter = new Rectangleobject();
        parameter.setHight(15);
        parameter.setWidth(10);
        int ans = parameter.getParameter();
        System.out.println(ans);

    }
}