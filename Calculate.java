package pc2calculator;

import java.text.DecimalFormat;

public class Calculate {
    //creating variables
    private double num1;
    private double num2;
    private char operator;

    public char getOperator() {
        return operator;
    }

    //method for rounding menu
    public String roundTo(String roundMe, int numPlaces) {
        String hashString = "##.";
        
        for (int i = 0; i < numPlaces; i++) {
            hashString += "#";
            
        }
        double d = Double.parseDouble(roundMe);
        DecimalFormat f = new DecimalFormat(hashString);
        String result = f.format(d);
        return result;
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    //method to calculate answer
    public double answer() {
        double answer = 0;
        if (operator == '+') {
            answer = num1 + num2;
        }
        else if (operator == '-') {
            answer = num1 - num2;
        }
        else if (operator == '/') {
            answer = num1 / num2;
        }
        else if (operator == '*') {
            answer = num1 * num2;
        }
        else if (operator == '^'){
            answer = Math.pow(num1, num2);
        }
        return answer;
    }
    
    public double clearAll() {
        // clears all entries from calculator
        num1 = 0;
        num2 = 0;
        return num1;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    public static void main(String args[]) {
        // do this in the GUI
        
        //Done
        Calculate c = new Calculate();
        
        // in operator event handler
        c.setNum1(5);
        c.setOperator('-');
        
        // when 'equals' is pressed
        c.setNum2(3);
        System.out.println(c.answer());
        
    }
}
