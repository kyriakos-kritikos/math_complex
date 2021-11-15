package math;

import java.util.HashMap;
import java.util.Map;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class MathApp{
	public static void main(String[] args) {
		boolean res = MathParser.syntaxCheck("x + ");
		if (!res) System.out.println("Expression: \"x + \" is wrong!!!");
		
		try {
			Map<String,Double> map = new HashMap<String,Double>();
			map.put("x",2.0);
			map.put("y",3.0);
			double result = MathParser.expressionEvaluation("x + y", map);
			System.out.println("x + y = " + result + "!!!");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
