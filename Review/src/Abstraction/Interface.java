package Abstraction;

public interface Interface {
    /*Another way to achieve abstraction in Java, is with interfaces.
      An interface is a completely "abstract class" that is used to group related methods with empty bodies
	 *Interface: we declare interface when all the methods are abstract.
	 * We able to create method without abstract keyword inside interface because it abstract by nature
	 * Whatever variable we create in interface is final, we don't change its value
	 * Multiple inheritance is possible through interface*/
	public void add();
	public abstract void substraction();
	
	
}
