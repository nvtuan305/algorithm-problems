public class BigInteger {
	
     public static void main(String []args){
        String number1 = "123456789987654321";
        String number2 = "123456789";
        System.out.println("Sum = " + add(number1, number2));
        System.out.println("Sub = " + subtract(number1, number2));        
     }
     
     static String add(String number1, String number2) {
        int n1, n2, r = 0, s;
        int i = number1.length() - 1;
        int j = number2.length() - 1;
        String result = "";

        while (i >= 0 || j >= 0) {
            if (i >= 0) n1 = getNumberFromStr("" + number1.charAt(i));
            else n1 = 0;

            if (j >= 0) n2 = getNumberFromStr("" + number2.charAt(j));
            else n2 = 0;

            s = n1 + n2 + r;
            r = s / 10;
            
            if (i <= 0 && j <= 0) result = s + result;
            else result = s % 10 + result;
       
            i--; j--;
        }

        return result;
    }

    static String subtract(String number1, String number2) {
     	if (number1.equals(number2)) return "0";
     	
        String result = "", sign = "";

        // Swap two numbers to Large number - Small number
        if (number2.equals(getLargerNumber(number1, number2))) {
            sign = "-";

            String temp = number1;
            number1 = number2;
            number2 = temp;
        }

        int n1, n2, r = 0;
        int i = number1.length() - 1;
        int j = number2.length() - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0) n1 = getNumberFromStr("" + number1.charAt(i));
            else n1 = 0;

            if (j >= 0) n2 = getNumberFromStr("" + number2.charAt(j));
            else n2 = 0;

            while (n1 < (n2 + r)) n1 += 10;
            result = (n1 - n2 - r) + result;
            r = n1 / 10;
          
            i--; j--;
        }

        return sign + result;
    }

    static String getLargerNumber(String number1, String number2) {
        int l1 = number1.length();
        int l2 = number2.length();

        if (l1 > l2) return number1;
        else if (l2 > l1) return number2;

        int n1, n2;
        for (int i = 0; i < l1; i++) {
            n1 = getNumberFromStr("" + number1.charAt(i));
            n2 = getNumberFromStr("" + number2.charAt(i));     
            
            if (n1 > n2) return number1;
            else if (n2 > n1) return number2;
        }

        return number1;
    }
     
    static int getNumberFromStr(String str) {
        try {
            return Integer.parseInt(str);
        } catch(Exception e) {
            return 0;
        }
    }
}
