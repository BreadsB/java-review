package org.breadsb.learning_collections;

import org.junit.jupiter.api.Test;

public class LearningCollectionsTestSuite {

    @Test
    void testNonStaticNestedClass() {
        OverloadingMethods overloadingMethods = new OverloadingMethods();
        OverloadingMethods.Generator generator = overloadingMethods.new Generator();
        OverloadingMethods.HighEndGenerator highEndGenerator = overloadingMethods.new HighEndGenerator();

        System.out.println(generator.generate());
        System.out.println(highEndGenerator.generate());
    }
}
