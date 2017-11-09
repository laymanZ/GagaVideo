package com.example.root.timevideo.dymanic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.HashMap;

public class ProxyHandle implements InvocationHandler
{

    private HashMap<String, Object> cache;
    private Object target;

    private ProxyHandle()
    {
    }

    public String getBaseUrl(String key)
    {
        return String.valueOf((RealUrlSubject) bind(new RealUrlSubject().getBaseUrl(key)));
    }

    private Object bind(Object target)
    {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    private ProxyHandle getInstance()
    {
        return ProxyHandleHolder.proxyHandle;
    }

    private static class ProxyHandleHolder
    {
        private static final ProxyHandle proxyHandle = new ProxyHandle();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        Type[] types = method.getParameterTypes();
        if (method.getName().matches("get.+")
                && types.length == 1
                && types[0] == String.class)
        {
            String key = (String) args[0];
            Object value = cache.get(key);
            if (value == null)
            {
                value = method.invoke(target, args);
                cache.put(key, value);
            }
            return value;
        }
        return method.invoke(target, args);
    }
}
