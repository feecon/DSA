package P13_ModularArithmaticIntro;

public class Q1_ExcelColumnNumber {
    public int titleToNumber(String A) {
	    int[] val = new int[26];
	    for (int i = 0; i < 26; i++) {
	        val[i] = i + 1;
	    }
	    int mul = 1;
	    int value = 0;
	    for (int i = A.length() - 1; i >= 0; i--) {
	        char c = A.charAt(i);
	        value += (mul * val[c - 'A']);
	        mul *= 26;
	    }
	    return value;
	}
}


// Simple math.

// This is just like base 26 number conversion.

// number = 26^0 * (S[n - 1] - ‘A’ + 1) + 26^1 * (S[n - 2] - ‘A’ + 1) + ….

// We recommend you to check out the piece on base number conversion in articles again. Please also attempt the sample problem associated with it.
