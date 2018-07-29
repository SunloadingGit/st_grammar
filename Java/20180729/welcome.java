import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import algorithm.*;
import grammar.*;

public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReflectService object = null;
		/*
		 * 类构造器有参数的反射生成对象和反射调度方法
		 * @return "Welcome 李明"
		 */
		try {
			object = (ReflectServiceImpl) Class.forName("grammar.ReflectServiceImpl").getConstructor(String.class).newInstance("李明");
			Method method=object.getClass().getMethod("sayWelcome");
			method.invoke(object);
		} catch (NoSuchMethodException| SecurityException|IllegalAccessException|IllegalArgumentException|InvocationTargetException | InstantiationException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		/*
		 * 类构造器无参数的反射生成对象和反射调度方法
		 * @return "Welcome 李明"
		 */
		try {
			object = (ReflectServiceImpl2) Class.forName("grammar.ReflectServiceImpl2").newInstance();
			Method method=object.getClass().getMethod("sayWelcome",String.class);
			method.invoke(object,"李明");
		} catch (NoSuchMethodException| SecurityException|IllegalAccessException|IllegalArgumentException|InvocationTargetException | InstantiationException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
