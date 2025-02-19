
public class Coffee extends Drink{
private int typeofcoffee;
private char sizeofCoffee;
private Barista barista;

Coffee(int type , char sizeCoffee , int typeCoffee , Barista barista) {
	super(type,sizeCoffee);
	this.sizeofCoffee = sizeCoffee;
	this.typeofcoffee = typeCoffee;
	this.barista = barista;
}
}

