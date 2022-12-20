package org.peremaria;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        SumService service = new SumService();
        int a = parseInt(args[0]);
        int b = parseInt(args[1]);
        int result = service.sum(a, b);
        System.out.printf("Result: %d%n",result);
    }
}