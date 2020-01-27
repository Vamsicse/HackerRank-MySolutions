public class Solution {

    static long flippingBits(long number) {
        number = ~number;   // 1s compliment
        long unsignedNumber = number & 0xffffffffL;  
        return unsignedNumber;
    }
}
