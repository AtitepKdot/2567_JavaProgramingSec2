import javax.swing.*;
public class CoffeeShopDemo {

		public static void main(String[] args) {
	        Barista staff1 = new Barista("Leon",'m');
	        Barista staff2 = new Barista("Claire",'f');
	        String drinkType = JOptionPane.showInputDialog(null,"Drink type: ");
	        int dType = Integer.parseInt(drinkType);
	        String tasteType = JOptionPane.showInputDialog(null,"Coffee type: ");
	        int tType = Integer.parseInt(tasteType);
	        String sizeName = JOptionPane.showInputDialog(null,"Coffee size: ");
	        char size = sizeName.charAt(0);
	        String baristaNumber = JOptionPane.showInputDialog(null,"Barista number: ");
	        int bNumber = Integer.parseInt(baristaNumber);
	        if (bNumber >2 || bNumber <1) {
	          bNumber = 1;
	        }
	        Coffee order = new Coffee(dType,size,tType,bNumber == 1 ? staff1 : staff2);
	 
	        JOptionPane.showMessageDialog(null, order.toString()+"\nBarista: "+order.getBarista().getName() + " ("+order.getBarista().getGender()+")");
	         

	}

}
