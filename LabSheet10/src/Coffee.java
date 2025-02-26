
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
Coffee(int type, int typecoffee) {
	super(type, ' ');
	this.typeofcoffee = typecoffee;
	  this.barista = null;
      this.sizeofCoffee = ' ';
	
}
public Barista getBarista() {
	return this.barista;
}
public String getTypeName() {
    if (this.typeofcoffee == 1) {
        return "Americano";
    }
    else if (this.typeofcoffee == 2){
        return "Espresso";
    }
    else if (this.typeofcoffee == 3){
        return "Cappuccino";
    }
    return null;
}
public int getTypePrice() {
    if (this.typeofcoffee == 1) {
        return 50;
    }
    else if (this.typeofcoffee == 2){
        return 55;
    }
    else if (this.typeofcoffee == 3){
        return 65;
    }
    return 0;
}
public String getSizeName() {
    if (this.sizeofCoffee == 's' || this.sizeofCoffee == 'S') {
        return "Short";
    }
    else if (this.sizeofCoffee == 't' || this.sizeofCoffee == 'T') {
        return "Tall";
    }
    else if (this.sizeofCoffee == 'g' || this.sizeofCoffee == 'G'){
        return "Grande";
    }
    else if (this.sizeofCoffee == 'v' || this.sizeofCoffee == 'V'){
        return "Venti";
    }
    return null;
}
public int getSizePrice() {
    if (this.sizeofCoffee == 's' || this.sizeofCoffee == 'S') {
        return 100;
    }
    else if (this.sizeofCoffee == 't' || this.sizeofCoffee == 'T') {
        return 150;
    }
    else if (this.sizeofCoffee == 'g' || this.sizeofCoffee == 'G'){
        return 200;
    }
    else if (this.sizeofCoffee == 'v' || this.sizeofCoffee == 'V'){
        return 250;
    }
    return 0;
}
public double getTotalPrice() {
    return super.getTypePrice() + getTypePrice() + getSizePrice();
}
public String toString() {
    return super.getTypeName()+" "+ getTypeName() +" " + "("+getSizeName()+") is "+ getTotalPrice() + " baht";
}



}

