package example.am.mvpclaculator.views;

/**
 * Created by Khach on 12-Aug-18.
 */

public interface ICalculatorView {

    public void reset();

    public void showResult(String text);

    public void appendInput(String text);

    public void setInput(String text);
}
