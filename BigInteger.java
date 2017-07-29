public class BigInteger {
     public static void main(String []args){
        String number1 = "123456789987654321";
        String number2 = "123456789";
        System.out.println("Sum = " + add(number1, number2));
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

    static int getNumberFromStr(String str) {
        try {
            return Integer.parseInt(str);
        } catch(Exception e) {
            return 0;
        }
    }
}
