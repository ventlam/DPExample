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
	 /*
	  * Adapter
	  */
	 //创建需要被适配的对象
	 AdapterAdaptee atee = new AdapterAdaptee();
	 //创建客户端需要的接口对象
	 AdapterTarget atget =new AdapterAdapter(atee);
	 //请求处理
	 atget.request();
	 /*
	  * Factory Method
	  */
	 FacMethodCreator fcpa = new FacMethodCreatorA();
	 fcpa.export("Fuck");
	 FacMethodCreator fcpb = new FacMethodCreatorB();
	 fcpb.export("Hello");
 }
}
