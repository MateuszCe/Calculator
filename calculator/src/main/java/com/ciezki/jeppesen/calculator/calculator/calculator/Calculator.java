package com.ciezki.jeppesen.calculator.calculator.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Calculations calculations = new Calculations() {
            //            nie wiem czy ta implementacja jest odpowiednia????
            @Override
            public double compute(double numberA, double numberB) {
                return 0;
            }
        };
        while (true) {
            System.out.println("Wybierz operacje: \n" +
                    "-dodawanie: + \n" +
                    "-mnozenie: * \n" +
                    "-odejmowanie: - \n" +
                    "-dzielenie: /");
//            z tymi ifami cos dziwnego sie dzieje nie zawsze wylapuje operacje np dopiero jak sie poda + za 2 razem to wylapuje do sprawdznia...
            if (calculator.doAddition()) {
                calculations = new Addition();
            } else if (calculator.doSubstraction()) {
                calculations = new Substraction();
            } else if (calculator.doMullticipation()) {
                calculations = new Multicipation();
            } else if (calculator.doDivision()) {
                calculations = new Division();
            }
            double value1 = calculator.getValue();
            double value2 = calculator.getValue();
            double result = calculations.compute(value1, value2);
            System.out.println("Wynik: " + result);
            System.out.println("Zakonczyc prace kalkulatora? Y/N");
            String switchoff = scanner.next();
            if (switchoff.equals("Y")) {
                break;
            } else continue;
        }
    }

    private boolean doAddition() {
        return scanner.next().equals("+");
    }

    private boolean doSubstraction() {
        return scanner.next().equals("-");
    }

    private boolean doMullticipation() {
        return scanner.next().equals("*");
    }

    private boolean doDivision() {
        return scanner.next().equals("/");
    }

    private double getValue() {
        System.out.println("Podaj liczbe: ");
        return scanner.nextDouble();
    }
}
