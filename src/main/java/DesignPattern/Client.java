package DesignPattern;

public class Client {
 public static void main(String[] args)
 {
	 /*
	  * Simple Factory
	  */
	 String s = "HandSome";
	 SimpleFacApi simApi = SimpleFacFactory.createSimFacApi(1);
	 simApi.operation(s);
	 /*
	  * Facade
	  */
	 new FacadeModFacade().test();
 }
}
