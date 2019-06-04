package mainTest.studytest;

/**
 * Created by Administrator on 2019/1/27.
 */
public class StaticStudy {
    private static int a =0;
    public void add(int a){
        System.out.println("==========="+a);
        this.a = a+1;
    }
    static {
        a += 2;
    }
    public static void main (String [] args){
        new StaticStudy().add(a);
        System.out.println(a);
    }

}
