package DesignPattern;
/*
 * 适配器
 */
public class AdapterAdapter implements AdapterTarget {
	/*
	 * 持有需要适配的接口对象
	 */
      private AdapterAdaptee atee;
      /*
       * 构造方法，传入需要被适配的对象
       * @param adaptee需要被适配的对象
       */
      public AdapterAdapter(AdapterAdaptee atee )
      {
    	  this.atee=atee;
      }
	public void request() {
		// TODO Auto-generated method stub
		//转调已经实现的方法，适配之
		atee.someRequest();
		
	}
	
	

}
