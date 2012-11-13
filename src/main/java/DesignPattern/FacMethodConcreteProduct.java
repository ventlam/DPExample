package DesignPattern;
/*
 * 具体的Product对象
 */
public class FacMethodConcreteProduct implements FacMethodProductApi {
	
	//实现Product所需的方法
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println(data+", Factory Method!");
		return true;
	}
}
