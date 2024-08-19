package AlgoLab3;

public class Servicing {
private int servicingNum;
private String registrationNum;
private String ownerName;
private double charge;

public Servicing() {
	servicingNum=0;
	registrationNum="";
	ownerName="";
	charge=0.0;
}
public void setservicingNum(int servicingNum) {
	this.servicingNum=servicingNum;
}
public void setregistrationNum(String registrationNum) {
	this.registrationNum=registrationNum;
}
public void setownerName(String ownerName) {
	this.ownerName=ownerName;
}
public void setcharge(double charge) {
	this.charge=charge;
}

public int getservicingNum() {
	return servicingNum;
}
public String getregistrationNum() {
	return registrationNum;
}
public String getownerName() {
	return ownerName;
}
public double getcharge() {
	return charge;
}

public String toString() {
	return "Servicing number: "+servicingNum+", registration number: "+registrationNum+", owner name: "+ownerName+", charge: "+charge;
}
}
