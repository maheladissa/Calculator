package com.kelaniya.uni.V3;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments){
        this.args=arguments;
    }

    public String getOperator(){
        //Make sure to validate arguments
        if (args.length == 0) {
            System.out.println("Please provide an argument");
            return "";
        }


        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide a valid argument");
            return "";

        }

        return operator;
    }
}
