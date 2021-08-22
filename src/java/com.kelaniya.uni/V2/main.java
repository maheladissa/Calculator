package com.kelaniya.uni.V2;

public class main {

    public static void main(String[] args) {

        //Make sure to validate arguments
        if (args.length==0) {
            System.out.println("Please provide an argument");
            return;
        }


        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))){
            System.out.println("Please provide a valid argument");
            return;
        }
        System.out.println(args[0]);

    }
}
