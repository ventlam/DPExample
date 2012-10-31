package DesignPattern;

public class SimpleFacFactory {
/*
 * ���崴��Api���󷽷�
 * @param condition �ⲿ��������
 * @return �����õ�Api����
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
