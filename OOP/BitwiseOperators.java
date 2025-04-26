package OOP;

public class BitwiseOperators {
    // &,|,~,>>,<<,^
    public static void main(String[] args) {

        // and operation
        // if any bit is 0 the answer is 0
        System.out.println(3 & 5); //011 & 101 

        // or operation
        // if any bit is 1 the answer is 1
        System.out.println(3 | 5); // 011 | 101

        // xor operation(^)
        // same bits= 0
        // diff bits=1
        System.out.println(3 ^ 5); // 011 ^ 101

        // right shift
        // a>>b=a/2^b
        // 23>>3=23/8=2
        System.out.println(5 >> 3); // 00000011 >> 00000101

        // left shift
        // a<<b=a*2^b
        // 23<<3=23*8= 184
        System.out.println(5 << 3); // 00000011 << 00000101

        // complement(~)
        // ~a=-(a+1)
        // 1's complement -> 1 becomes 0 and 0 becomes 1
        // 00000101 = (5)
        // 11111010 (1's complement)
        // MSB=1 -> negative, MSB=0 -> positive
        // 2'scomplement -> do 1's complement then add 1
        // 1'scomplement of 11111010 -> 00000101
        // + 1
        // = 00000110
        System.out.println(~5);
    }
}

// first 1 occuring bit from the left is known as set bit
// 001=1

// binary to decimal
// 32 16 8 4 2 1
