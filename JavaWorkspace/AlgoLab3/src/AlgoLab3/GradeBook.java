package AlgoLab3;
public class GradeBook {
private String[] moduleName=new String[4];
private double[] mark=new double[4];

public GradeBook(String[] moduleName, double[] mark) {

this.moduleName = moduleName;
this.mark = mark;
}
public GradeBook() {

moduleName = new String[4];
mark=new double[4];
}
public void setModuleName(String newModuleName,int modnum) {
moduleName[modnum] = newModuleName;
}
//return whole array
public String getModuleName(int modnum) { 
	return moduleName[modnum];
	}
//find mod name and set its mark
public void setMark(double newMark, String modname) {
	for(int i=0;i<=4;i++) {
	if(moduleName[i]==modname) {
	mark[i] = newMark;
	break;
	}
	}
}
public double getMark(String modname) { 
	for(int i=0;i<=4;i++) {
		if(moduleName[i]==modname) {
	return mark[i];
	}
}}
public String toString() {

result= "Mark for "+ moduleName+ ": " + mark;

}
}