package main;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematic m = (a, b) -> a + b;
        Mathematic x = Double::sum;
        System.out.println(x.add(5, 45));
        System.out.println(Calculator.Calculate1('f',9,78));


    }

}

interface Mathematic{
    double add(double a, double b);
}

class Calculator {
    static Map<Character, Calculable> map = new HashMap<>();
    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('f', arr -> Math.sqrt(arr[0]));
    }
    public static double Calculate(char op, double a, double b){
        if (op == '+') { return a + b; }
        if (op == '-') { return a - b; }
        if (op == '*') { return a * b; }
        else throw new UnsupportedOperationException("Не реализуется");
    }
    public static double Calculate1(char op, double ... arr){
        return map.get(op).calc(arr);
    }
}

interface Calculable{
    double calc(double ... arg);
}