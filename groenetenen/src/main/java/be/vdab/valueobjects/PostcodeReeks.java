package be.vdab.valueobjects;
public class PostcodeReeks {
private int vanpostcode;
private int totpostcode;
// Je maakt getters en setters voor de private variabelen
public boolean bevat(int postcode) {
// bevat de reeks een bepaalde postcode ? (gebruikt in de repository layer)
return postcode >= vanpostcode && postcode <= totpostcode;
}
public int getVanpostcode() {
	return vanpostcode;
}
public void setVanpostcode(int vanpostcode) {
	this.vanpostcode = vanpostcode;
}
public int getTotpostcode() {
	return totpostcode;
}
public void setTotpostcode(int totpostcode) {
	this.totpostcode = totpostcode;
}
}