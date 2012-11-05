package DesignPattern;

public class SingletonHungry {
 /*
  * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只能创建一次
  */
	private static  SingletonHungry sintonHy = new SingletonHungry();
	
	/*
	 * 私有化构造方法，内部控制实例创建数目
	 */
	private SingletonHungry()
	{
		//System.out.println("SingleHungry Construction");
	}
	/*
	 * 定义方法为客户端提供类实例
	 */
	public static SingletonHungry getInstance()
	{
		return sintonHy;
	}
	 /*
	    * 示例方法，单例可以拥有自身的方法
	    */
	   public void sintnLzOpera()
	   {
		   System.out.println("SingletonHungry Operation");
	   }
	   /*
	    * 示例属性，单例可以拥有自身的属性
	    */
	   private String sintnHyData;
	     /*
	      *  示例方法，  让外部通过这些方法来访问属性值
	      */
	   public String getSintonLzData()
	   {
		   return sintnHyData;
	   }
	}


