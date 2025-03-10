package Stan.v8moneyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private TextView textOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = findViewById(R.id.EuroInput);
        textOutput = findViewById(R.id.ResultText);

    }

    public void dollarChange(View view) {

        float euro = Float.parseFloat(textInput.getText().toString());
        float dollar = euro * 1.05f;

        textOutput.setText(String.format("$%.2f", dollar));
    }

    public void poundChange(View view) {

        float euro = Float.parseFloat(textInput.getText().toString());
        float pound = euro * 0.83f;

        textOutput.setText(String.format("£%.2f", pound));

    }

}