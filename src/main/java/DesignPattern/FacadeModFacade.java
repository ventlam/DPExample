package DesignPattern;

public class FacadeModFacade {
  public void test()
  {
	  FacadeModApiA a = new FacadeModImplA();
	  a.testA();
	  FacadeModApiB b = new FacadeModImplB();
	  b.testB();
  }
}
