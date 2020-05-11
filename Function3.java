package application;
import java.text.DecimalFormat;
public class Function3 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		DecimalFormat dc = new DecimalFormat("#,###,##0.##");
	    return "Minimum distance to (0,1) is " + dc.format(optVal) + " at the points (" + 
				dc.format(x)+ ","+ dc.format(y) + ") and (" + dc.format(-x) + "," + dc.format(y) + ")";
	}

	@Override
	public double fnValue(double x) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(x, 4) - Math.pow(x, 2) + 1);
	}

	@Override
	public double getXVal(double x) {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getYVal(double x) {
		// TODO Auto-generated method stub
		return Math.pow(x, 2);
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return -1;
	}

	public String toString() {
		
		return "Find the minimum distance between the function f(x)=x^2 and the point (0.1)\n"
		        + "This distance is described by the function d(x)=sqrt(x^4-x^2+1)";
		
	}
}
