package com.kelaniya.uni.V5.input;


public class CommandLineInputs implements Inputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments){
        this.args=arguments;
    }

    public String getOperator() throws InvalidInputException {
        //Make sure to validate arguments
        if (args.length == 0) {
            throw new InvalidInputException("Please provide an argument");
        }


        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            throw new InvalidInputException("Please provide a valid argument");

        }

        return operator;
    }
}
