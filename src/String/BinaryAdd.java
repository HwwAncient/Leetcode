package String;

public class BinaryAdd {

	public static void main(String[] args) {

		// Don't suggest to use addition in int to solve this problem beacause of the case of overflow in int or long
		System.out.println(addBinary("1010","1011"));
	}

	public static String addBinary(String a, String b) {
		
		int nA  = a.length();
		int nB  = b.length();
		int len = nA > nB ? nA : nB;
		int add0 = Math.abs(nA - nB);
		String add0s = "";
		if(nA > nB) {
			for(int i = 0;i< add0;i++) add0s += "0";
			b = add0s + b;
		}
		else {
			for(int i = 0;i< add0;i++) add0s += "0";
			a = add0s + a;
		}
		String[] A = a.split("");
		String[] B = b.split("");
		String result = "";
		String addBit = "0";
		String results[] = new String[2];
		for(int i = len - 1;i>=0;i--) {
			results = bitAdd(A[i], B[i], addBit);
			addBit = results[1];
			result += results[0];
			if(i==0) if(addBit.equals("1")) result+="1";			
		}
		
		
			
		return new StringBuilder(result).reverse().toString();
    }
	
	public static String[] bitAdd(String a, String b, String addBit) {
		
		int oneCount = 0;
		if(a.equals("1")) oneCount+= 1;
		if(b.equals("1")) oneCount+= 1;
		if(addBit.equals("1")) oneCount+= 1;
		
		String[] results =  new String[2];
		Integer A = Integer.parseInt(a, 2);
		Integer B = Integer.parseInt(b, 2);
		Integer AddBit = Integer.parseInt(addBit, 2);
		int nA = A.intValue();
		int nB = B.intValue();
		int nAddBit = AddBit.intValue();
		results[0] = String.valueOf(nA ^ nB ^ nAddBit);
		if(oneCount > 1) results[1] = "1";
		else results[1] = "0";
		return results;
	}
}
