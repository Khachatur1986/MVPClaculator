package example.am.mvpclaculator.presenters;

import android.text.TextUtils;

import example.am.mvpclaculator.views.CalculatorViewActivity;
import example.am.mvpclaculator.views.ICalculatorView;

/**
 * Created by Khach on 12-Aug-18.
 */

public class CalculatorPresenter implements IPresenter {

    private CalculatorViewActivity calculatorView;
    private double firstNumber;
    private double secondNumber;
    private String action;
    private boolean isResoultExist;

    public CalculatorPresenter(CalculatorViewActivity calculatorView) {
        this.calculatorView = calculatorView;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void btnOnclick(String tag) {
        if (TextUtils.isEmpty(tag)) {
            return;
        }
        if (isResoultExist) {
            calculatorView.reset();
            isResoultExist = false;
        }
        String input = calculatorView.getEt_input().getText().toString();

        switch (tag) {
            case "0":
                calculatorView.appendInput(tag);
                break;
            case "1":
                calculatorView.appendInput(tag);
                break;
            case "2":
                calculatorView.appendInput(tag);
                break;
            case "3":
                calculatorView.appendInput(tag);
                break;
            case "4":
                calculatorView.appendInput(tag);
                break;
            case "5":
                calculatorView.appendInput(tag);
                break;
            case "6":
                calculatorView.appendInput(tag);
                break;
            case "7":
                calculatorView.appendInput(tag);
                break;
            case "8":
                calculatorView.appendInput(tag);
                break;
            case "9":
                calculatorView.appendInput(tag);
                break;
            case "+":
                if (action == null) {
                    if (!TextUtils.isEmpty(input)) {
                        action = "+";
                        firstNumber = Double.parseDouble(input);
                        calculatorView.setInput(tag);
                    }
                }
                break;
            case "-":
                if (action == null) {
                    if (!TextUtils.isEmpty(input)) {
                        action = "-";
                        firstNumber = Double.parseDouble(input);
                        calculatorView.setInput(tag);
                    }
                }
                break;
            case "/":
                if (action == null) {
                    if (!TextUtils.isEmpty(input)) {
                        action = "/";
                        firstNumber = Double.parseDouble(input);
                        calculatorView.setInput(tag);
                    }
                }
                break;
            case "*":
                if (action == null) {
                    if (!TextUtils.isEmpty(input)) {
                        action = "*";
                        firstNumber = Double.parseDouble(input);
                        calculatorView.setInput(tag);
                    }
                }
                break;
            case ".":
                if (!TextUtils.isEmpty(input)) {
                    calculatorView.appendInput(tag);
                }
                break;
            case "=":
                if (!TextUtils.isEmpty(action)) {
                    if (!TextUtils.isEmpty(input)) {
                        secondNumber = Math.abs(Double.parseDouble(input));
                        double result = 0;
                        switch (action) {
                            case "+":
                                result = firstNumber + secondNumber;
                                break;
                            case "-":
                                result = firstNumber - secondNumber;
                                break;
                            case "/":
                                result = firstNumber / secondNumber;
                                break;
                            case "*":
                                result = firstNumber * secondNumber;
                                break;
                        }

                        calculatorView.showResult(String.valueOf(result));
                        firstNumber = 0;
                        secondNumber = 0;
                        action = null;
                        isResoultExist = true;
                    }
                }

                break;
        }
    }

    public void clear() {
        firstNumber = 0;
        secondNumber = 0;
        action = null;
        isResoultExist = false;
        calculatorView.getEt_input().setText("");
    }
}
