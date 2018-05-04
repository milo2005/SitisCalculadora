package sitis.calculadora;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText num1, num2;
    private TextView rta;
    private Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CicloVida", "Entro en OnCreate");

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        rta = findViewById(R.id.rta);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CicloVida", "Entro en OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CicloVida", "Entro en OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CicloVida", "Entro en OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CicloVida", "Entro en OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CicloVida", "Entro en OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CicloVida", "Entro en OnDestroy");
    }

    @Override
    public void onClick(View v) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int result = 0;
        switch (v.getId()) {
            case R.id.btnAdd:
                result = n1 + n2;
                break;
            case R.id.btnSub:
                result = n1 - n2;
                break;
            case R.id.btnMul:
                result = n1 * n2;
                break;
            case R.id.btnDiv:
                result = n1 / n2;
                break;
        }
        rta.setText(""+result);
    }
}

