package OOP;

public class BitwiseOperators {
    // &,|,~,>>,<<,^
    public static void main(String[] args) {
        int a = 3;
        // System.out.println((byte) a);
        // System.out.println(a & 5);
        // System.out.println(3 | 5);
        // System.out.println(3 ^ 5);
        // System.out.println(5 >> 3);
        // System.out.println(4 >> 2);
        // System.out.println(5 << 2);
        // System.out.println(23 << 3);
        // System.out.println(23 >> 3);
        System.out.println(~-5);
    }
}

// 1's complement
// //00000101
// //11111010
// 2'scomplement
// 1'scomplement 00000101
// +                    1
// 00000110

// ~a=-(a+1)
// a<<b=a*2^b
// 23<<3=23*8= 184
// a>>b=a/2^b
// 23>>3=23/8=2
// 5/2=1
// 2/2=0
// 1
// 3->011
// 5->00 000101
// 00010100
// 4->00000100
// 00010000
// starting 1 bit is known as set bit
// 001 /1
// 111
// 32 16 8 4 2 1 
// same bits= 0
// diff bits=1
// 110