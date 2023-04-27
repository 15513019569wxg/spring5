package com.capensis.spring.aop;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author wxg
 * @date 2022/3/16-15:40
 * @quotes 小不忍则乱大谋
 */
public class JDKProxy {
    public static void main(String[] args) {

        Class[] interfaces = new Class[]{UserDao.class};

        // 被增强的对象
        UserDaoImpl userDao = new UserDaoImpl();

        UserDao dao = (UserDao) Proxy.newProxyInstance(
                JDKProxy.class.getClassLoader(),
                // 被增强类实现的接口
                interfaces,
                // 增强被代理对象的方法
                new UserDaoProxy(userDao));

        int result = dao.add(1, 2);
        System.out.println( "result:"+result);
    }


}

/**
 * 增强某个类的实例对象的方法
 */
class UserDaoProxy implements InvocationHandler {

    private final Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println(" 方法之前执行 ...."+method.getName()+ " : 传递的参数 ..."+ Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println(" 方法之后执行 ...."+ obj.toString());
        return res;
    }
}
