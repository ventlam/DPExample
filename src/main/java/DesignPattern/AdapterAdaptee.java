package DesignPattern;
/*
 * 已存在接口，需要被适配
 */

public class AdapterAdaptee {
	/*
	 * 已存在的实现方法
	 */
      public void someRequest()
      {
    	  //Do something
    	  System.out.println("Adaptee accomplished!");
    	  
      }
}
