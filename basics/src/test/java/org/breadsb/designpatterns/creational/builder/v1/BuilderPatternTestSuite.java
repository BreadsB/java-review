package org.breadsb.designpatterns.creational.builder.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderPatternTestSuite {

    @Test
    void testBuilderPattern() {
        ScrewdriverToolBuilder screwdriverBuilder = new ScrewdriverToolBuilder();
        ToolBuildExecutor executor = new ToolBuildExecutor(screwdriverBuilder);
        Tool screwdriver = executor.produceTool();
        Assertions.assertTrue("philips".equalsIgnoreCase(screwdriver.getManufacturer()));
    }

//    @Test
//    void testOneBuildExecutorCreatesMultipleToolTypes() {
//        ScrewdriverToolBuilder screwdriverToolBuilder = new ScrewdriverToolBuilder();
//        WelderToolBuilder welderToolBuilder = new WelderToolBuilder();
//        ToolBuildExecutor toolBuildExecutor = new ToolBuildExecutor();
//        //choose which tool to produce
//        toolBuildExecutor.chooseToolBuilder(welderToolBuilder);
//        return toolBuildExecutor.produceTool();
//    }


//      Choose from list which tool you want
//      on "Submit" button click, check which element it is and create new object eg. new ScredriverToolBuilder();
//      send it to new method with executor what takes scredriverToolBuilder and executes produceTool()
}
