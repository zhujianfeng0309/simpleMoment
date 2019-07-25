package common.util;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/7/19.
 */

public class KeyValueEnumUtil {
    public static <E extends Enum<?> & BaseKeyValueEnum, N extends Number> List<N> getKeys(Class<E> enumClass, Class<N> toType) {
        E[] consts = enumClass.getEnumConstants();
        try {
            Constructor<N> cstruct = toType.getConstructor(String.class);
            List<N> vals = new ArrayList<N>();
            for(E c : consts){
                vals.add(cstruct.newInstance(String.valueOf(c.getValue())));
            }
            return vals;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <E extends Enum<?> & BaseKeyValueEnum> List<String> getValues(Class<E> enumClass) {
        E[] consts = enumClass.getEnumConstants();
        List<String> vals = new ArrayList<String>();
        for(E c : consts){
            vals.add(c.getDesc());
        }
        return vals;
    }

    public static <E extends Enum<?> & BaseKeyValueEnum> E getEnumByKey(Class<E> enumClass, int key) {
        E[] consts = enumClass.getEnumConstants();
        for(E c : consts){
            if(c.getValue().equals(key)){
                return c;
            }
        }
        return null;
    }

    public static <E extends Enum<?> & BaseKeyValueEnum> E getEnumByValue(Class<E> enumClass, String value) {
        E[] consts = enumClass.getEnumConstants();
        for(E c : consts){
            if(c.getDesc().equals(value)){
                return c;
            }
        }
        return null;
    }

    public static <E extends Enum<?> & BaseKeyValueEnum> String getValueByKey(Class<E> enumClass, int key) {
        E c = getEnumByKey(enumClass, key);
        return c == null ? null : c.getDesc();
    }

    public static <E extends Enum<?> & BaseKeyValueEnum> int getKeyByValue(Class<E> enumClass, String value) {
        E c = getEnumByValue(enumClass, value);
        return c == null ? null : c.getValue();
    }

    public static boolean isIndexEq(BaseKeyValueEnum kvenum, Number idx){
        if(kvenum != null && idx != null){
            return kvenum.getValue().equals(idx.intValue());
        }
        return false;
    }

    public static <E extends Enum<?> & BaseKeyValueEnum> Map<Integer,String> getEnumMapping(Class<E> enumClass) {
        E[] consts = enumClass.getEnumConstants();
        Map<Integer,String> keyValueMap = new HashMap<>(consts.length);
        for(E c : consts){
            keyValueMap.put(c.getValue(), c.getDesc());
        }
        return keyValueMap;
    }
}

