package mainTest.reflecttest;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/19.
 */
public class Test {


    public static void main (String [] args){
        Student student = new Student("朱建峰",Long.valueOf("123456") ,2222);
        reflect(student);
    }
    public static Map<Object,Object> reflect(Object object){
        Map<Object,Object> map= new HashMap<>();
        try {
            Class<?> aClass = object.getClass();
            //Object obj = aClass.newInstance();
            Field[] declaredFields = aClass.getDeclaredFields();
            for(Field field : declaredFields) {
                field.setAccessible(true);
                Object obj = field.get(object);
                System.out.println(field.getType()+"->"+field.getName()+":"+obj);
                map.put(field.getName(), obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return  map;
    }
}
