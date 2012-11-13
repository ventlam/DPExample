package DesignPattern;

public class FacMethodConcreteCreator extends FacMethodCreator{

	@Override
	protected FacMethodProductApi factoryMethod() {
		// 重定义工厂方法 返回一个具体的Product对象
		return new FacMethodConcreteProduct();
	}
	

}
