package application;
import java.text.DecimalFormat;
public class Function2 extends Function{

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		DecimalFormat dc = new DecimalFormat("#,###,##0.0#");
	    return "Minimum time is " + dc.format(optVal) + " to jump in the ocean at a point " + dc.format(x) + "m from the start point";
	}

	@Override
	public double fnValue(double x) {
		 return (x/3) + (2 *  Math.sqrt(Math.pow(x,2)- 8 * x + 25));
	}

	@Override
	public double getXVal(double x) {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getYVal(double x) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return -1;
	}

	public String toString() {
		
	return "minimize speed with which a dog can run and swim to fetch the ball on the beach";
	}
}
