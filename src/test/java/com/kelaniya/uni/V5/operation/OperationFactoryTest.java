package com.kelaniya.uni.V5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OperationFactoryTest {

    // test cases
    // if operator is add -. should return addoperator object
    @Test
    public void should_return_AddOperation_object_when_operator_is_add(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");
        assertThat(operation, instanceOf(AddOperation.class));
    }
    // if operator is sub -. should return suboperator object
    @Test
    public void should_return_SubOperation_object_when_operator_is_sub(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");
        assertThat(operation, instanceOf(SubOperation.class));
    }

    // if operator is mul -. should return muloperator object
    @Test
    public void should_return_MulOperation_object_when_operator_is_mul(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");
        assertThat(operation, instanceOf(MulOperation.class));
    }

    // if operator is div -. should return divoperator object
    @Test
    public void should_return_DivOperation_object_when_operator_is_div(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("div");
        assertThat(operation, instanceOf(DivOperation.class));
    }

}