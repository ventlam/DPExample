package DesignPattern;
/*
 * 创建器，声明工厂方法
 */
public abstract class FacMethodCreator {
		/*
		 * 创建Product的工厂方法
		 * @return Product对象
		 */
	protected abstract FacMethodProductApi factoryMethod();
	/*
	 * 示意方法，实现某些个功能的方法
	 */
	public boolean export(String data)
	{
		//通常在这些方法实现中需要调用工厂方法来获取Product对象
		FacMethodProductApi fmProduct = factoryMethod();
		return fmProduct.export(data);
	}
}
