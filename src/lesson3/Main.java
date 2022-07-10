package lesson3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scaner = new Scanner(System.in);

    System.out.println("Выберите программу");

    int numberOperarion = scaner.nextInt();

    Execution execution = new Execution();

    switch(numberOperarion)
    {
      case 1:
        execution.FindMonthViaSwitch();
        break;
      case 2:
        execution.findNameOfMonthViaIf();
        break;
      case 3:
        execution.defineEvenNumber();
        break;
      case 4:
        execution.defineTemperature();
        break;
      case 5:
        execution.defineColourRainbow();
        break;
      case 6:
        execution.outputNotEvenNumbers();
        break;
      case 7:
        execution.outputFiveNumbers();
        break;
      case 8:
        execution.findSumNumbers();
        break;
      case 9:
        execution.outputSubsequencePlusSeven();
        break;
      case 10:
        execution.outputSubsequenceMinusFive();
        break;
      case 11:
        execution.outputSquareNumbers();
        break;
    }

  }
}
