package DesignPattern;

public class SingletonLazy {
	/*
	 * 定义变量存储创建好的实例
	 */
   private static SingletonLazy  sinLz = null;
   /*
    * 私有化构造方法，可以在内部控制实例数目
    */
   private SingletonLazy()
   {
	//   System.out.println("SingletonLazy Construction ");
   }
   /*
    * 定义一个方法为客户端提供类实例
    * @return 一个SingletonLazy实例
    */
   public static synchronized SingletonLazy getInstance()
   {   //判断存储实例的变量是否有值
	   if(sinLz ==null)
	   {   
		   //如果没有，就创建类实例，复制给存储类实例变量sinLz
		   sinLz = new SingletonLazy();
	   }
	   //返回已有实例值
	return sinLz;
	   
   }
   /*
    * 示例方法，单例可以拥有自身的方法
    */
   public void sintnLzOpera()
   {
	   System.out.println("SingletonLazy Operation");
   }
   /*
    * 示例属性，单例可以拥有自身的属性
    */
   private String sintnLzData;
     /*
      *  示例方法，  让外部通过这些方法来访问属性值
      */
   public String getSintonLzData()
   {
	   return sintnLzData;
   }
}
