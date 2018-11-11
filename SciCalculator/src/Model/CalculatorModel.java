
package Model;

/**
 *
 * @author Yasar
 */
public interface CalculatorModel {

    void setOperand(String opr);

    void setOperator(int operator);

    double getResult();

    void setResult(double result);

    void process();

}
