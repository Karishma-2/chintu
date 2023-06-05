package controlFlowStatements;

import java.util.Scanner;

public class DecisionMakingStatementsTest {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	DecisionMakingStatements obj = new DecisionMakingStatements(scan);
/*	obj.checkAisGreater();
	obj.checkAOrBisGreater();
	DecisionMakingStatements obj1 = new DecisionMakingStatements();
	obj1.checkAOrBisGreaterOrEqual();
	obj1.game();
*/
	//obj.calculatorUsingIf();
	obj.calculatorUsingSwitch();
	
}
}
