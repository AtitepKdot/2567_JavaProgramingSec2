
public class Barista {
 private String name;
 private char gender;
 Barista (String name , char gender) {
	 this.name = name;
	 this.gender = gender;
 }
 public String getName() {
	 return this.name;
 }
 public String getGender() {
	 if (gender == 'm' || gender == 'M') {
		 return "Male";
	 }
	 if (gender == 'f' || gender == 'F' ) {
		 return "Female";
	 }
	 return " ";
 }
}
