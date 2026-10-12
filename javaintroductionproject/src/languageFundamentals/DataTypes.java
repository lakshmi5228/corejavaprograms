package languageFundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataTypes {

	public static void main(String[] args) {
		BigInteger bi = new BigInteger("1234567890");
		BigDecimal bd = new BigDecimal(57798.2345623);
		
		BigInteger bi1 = new BigInteger("1234567890");
		BigDecimal bd1 = new BigDecimal(57798.2345623);
	
		BigInteger result1 =(bi).add(bi1);
		BigDecimal result = new BigDecimal(bi).add(bd);
		
		System.out.println(result);
		System.out.println(result1);
		
	}

}
