package day30_arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class for_each_array {
    public static void main(String[] args) {


        int[] data1 = {13516, 55255, 5525, 221, 588, 321, 35, 97, 788, 734, 4532};
        for (int each : data1) {
            System.out.println("data = " + each);
        }

        System.out.println("Regular for loop");
        for(int n =0; n< data1.length; n++){
            System.out.println(data1[n]);
        }
        System.out.println("last value = " + data1[data1.length-1]);
        System.out.println("loop Backward");

        for(int idx = data1.length-1; idx>=0; idx--){
            System.out.println(data1[idx]);
        }
    }


}
