package com.osquare.java.designpattern.structural.proxy.chap1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

    private Object obj;
    private SecurityProxy(Object obj) {
        this.obj = obj;
    }
    public static Object newInstance(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), new SecurityProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            if(method.getName().contains("post")) {
                throw new IllegalAccessException("post method cannot be called");
            } else {
                result = method.invoke(obj, args);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
