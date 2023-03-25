package org.breadsb.edabit.data_structures;

//https://edabit.com/challenge/G6dgZvzjWjoDsqECg
//ScriptEngine
//JEP parser
//Javax xml datatypeConverter

import java.util.LinkedList;
import java.util.Stack;
import java.util.regex.Pattern;

public class PostfixNotation {

    public static int postfix(String s) {
        String[] splited = s.split("\\s");
        Pattern patternNumber = Pattern.compile("\\d+");
        Pattern patternOperand = Pattern.compile("\\W");
        LinkedList<Integer> integerList = new LinkedList<>();
        LinkedList<Integer> secondList = new LinkedList<>();
        char operand;
        int result = 0;

        if (splited.length>1) {
            for (String element : splited) {
                if (patternNumber.matcher(element).matches()) {
                    integerList.add(Integer.parseInt(element));
                    continue;
                }
                if (patternOperand.matcher(element).matches()) {
                    operand = element.charAt(0);
                    if (integerList.size()>1) {
                        result = operationHelper(integerList.getFirst(), integerList.getLast(), operand);
                        integerList.clear();
                        secondList.add(result);
                    } else if (integerList.size()==1 && !secondList.isEmpty()) {
                        result = operationHelper(secondList.getFirst(), integerList.getLast(), operand);
                        integerList.clear();
                        secondList.clear();
                        secondList.add(result);
                    } else if (integerList.isEmpty() && !secondList.isEmpty()) {
                        result = operationHelper(secondList.getFirst(), secondList.getLast(), operand);
                        secondList.clear();
                        secondList.add(result);
                    }
                }
            }
        } else {
            return Integer.parseInt(splited[0]);
        }
        return result;
    }

    private static int operationHelper(int a, int b, char operand) {
        return switch (operand) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }

    public static int postfix2(String expr) {
        String[] s = expr.split("\\s+");
        Stack<Integer> stack = new Stack<>();

        for (String element : s) {

            if(element.matches("\\d+")) {
                stack.push(Integer.valueOf(element));
            } else {
                if(stack.size()<2) {
                    return 0;
                }

                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (element) {
                    case "+" -> stack.push(val2 + val1);
                    case "-" -> stack.push(val2 - val1);
                    case "*" -> stack.push(val2 * val1);
                    case "/" -> stack.push(val2 / val1);
                }
            }
        }
        return stack.pop();
    }
}
