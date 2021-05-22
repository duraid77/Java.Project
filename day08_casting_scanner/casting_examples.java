package day08_casting_scanner;

import com.sun.prism.shader.Solid_ImagePattern_AlphaTest_Loader;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.lang.model.SourceVersion;

public class casting_examples {
    public static void main(String[] args){


        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        long num4 = num2;

        int num5 = (int) num4;
        System.out.println("num5 = " + num5);

        double num13 = 34.55;
        float num14 = (float) num13;
        System.out.println("num14 = " + num14);
        System.out.println("num13 = " + num13);

        int num15 = 300;

        char letter = 'D';
        int num20= letter;
        System.out.println("num20 = " + num20);


    }
}
