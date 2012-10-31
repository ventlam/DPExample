package DesignPattern;

public class SimpleFacFactory {
/*
 * 具体创建Api对象方法
 * @param condition 外部传入条件
 * @return 创建好的Api对象
 */
	public static SimpleFacApi createSimFacApi(int condition)
	{
		SimpleFacApi simApi = null;
		if (condition ==1)
		{
			simApi = new SimpleFacImpA();
		}
		else if (condition ==2)
		{
			simApi = new SimpleFacImpB();
		}
		return simApi;
		
	}
}
