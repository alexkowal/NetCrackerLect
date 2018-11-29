package com.ec;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Solution {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Child child = new Child();
        Root root = new Root();


        int i = 0;
        Object[] arr = {"pref", 6};


        Object o = child.getClass().newInstance();

        Method m = child.getClass().getMethods()[0];

        System.out.println(m.invoke(o, arr));

        Constructor c = child.getClass().getConstructor();

        Object ob = (Child) (c.newInstance());
        System.out.println(((Child) ob).m("s", 0));
    }



/*

        Method[] m = root.getClass().getMethods();
        for (Method method : m) {
            System.out.println("methods: " + method.getName());
        }
*/


}
