
package Model;

/**
 *
 * @author Yasar
 */
public class CalculatorModelImpl implements CalculatorModel {
    int operator=0;
    double operand1;
    double operand2;
    double result;

    @Override
    public void setOperand(String opr) {
        if(!opr.equals("")){
            if(operator==0){
                operand1=Double.valueOf(opr);
            }else{
                operand2=Double.valueOf(opr);
            }
        }
    }

    @Override
    public void setOperator(int operator) {
        this.operator = operator;
    }

    @Override
    public double getResult() {
        return result;
    }

    @Override
    public void setResult(double result) {
        this.result = result;
    }
   
    @Override
    public void process(){
        switch (operator){
            case 1:
                result = operand1 + operand2;
                break;
            case 2:
                result = operand1 - operand2;
                break;
            case 3:
                result = operand1 * operand2;
                break;
            case 4:
                result = operand1 / operand2;
                break;
            case 5:
                result = operand1 % operand2;
                break;
            case 6:
                result = 1/operand1;
                break;
        }
        operand1=result;
    }

}
