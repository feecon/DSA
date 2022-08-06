package P10_BitManipulations1;

public class Q5_BitCompression {
    public int compressBits(int[] A) {
        int ans = 0;
        for(int i = 0;i < A.length; i++){
            ans ^= A[i];
        }
        return ans;
    }
}

// The XOR of all the numbers is preserved even after performing all the operations.
// A[i] ^ A[j] = (A[i] & A[j]) ^ (A[i] | A[j])

// We can prove this using the truth table of two binary digits.
// So, the answer is equal to the XOR of all original array elements.

