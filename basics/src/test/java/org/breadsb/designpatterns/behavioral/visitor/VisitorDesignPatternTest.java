package org.breadsb.designpatterns.behavioral.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisitorDesignPatternTest {

    @Test
    void test() {
        WindowsMailClientVisitor windowsVisitor = new WindowsMailClientVisitor();
        MacMailClientVisitor macVisitor = new MacMailClientVisitor();
        OperaMailClient operaClient = new OperaMailClient();
        SquirrelMailClient squirrelClient = new SquirrelMailClient();
        Assertions.assertTrue(operaClient.accept(windowsVisitor));
        Assertions.assertTrue(squirrelClient.accept(macVisitor));
    }
}
