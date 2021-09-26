package com.kelaniya.uni.V5;

import com.kelaniya.uni.V5.input.CommandLineInputs;
import com.kelaniya.uni.V5.input.Inputs;
import com.kelaniya.uni.V5.operation.Operation;
import com.kelaniya.uni.V5.operation.OperationFactory;
import com.kelaniya.uni.V5.repository.FileNumberRepository;
import com.kelaniya.uni.V5.repository.NumberRepository;
import com.kelaniya.uni.V5.ui.CmdLineUI;
import com.kelaniya.uni.V5.ui.UI;

public class main {

    public static void main(String[] args){

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository =new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui =new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);

        app.execute();
    }
}






























