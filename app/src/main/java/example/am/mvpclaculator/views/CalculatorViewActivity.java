package example.am.mvpclaculator.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import example.am.mvpclaculator.R;
import example.am.mvpclaculator.presenters.CalculatorPresenter;

/**
 * https://abhiandroid.com/ui/tablelayout
 */
public class CalculatorViewActivity extends AppCompatActivity implements ICalculatorView {
    private CalculatorPresenter presenter = new CalculatorPresenter(this);
    private EditText et_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_input = findViewById(R.id.et_input);
    }

    public EditText getEt_input() {
        return et_input;
    }

    @Override
    public void reset() {
        et_input.setText("");
    }

    @Override
    public void showResult(String text) {
        et_input.setText(text);
    }

    @Override
    public void appendInput(String text) {
        et_input.append(text);
    }

    @Override
    public void setInput(String text) {
        et_input.setText(text);
    }


    public void onClick(View v) {
        presenter.btnOnclick((String) v.getTag());
    }

    public void clear(View view) {
        presenter.clear();
    }
}
