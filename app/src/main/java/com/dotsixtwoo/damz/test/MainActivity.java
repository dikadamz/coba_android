package com.dotsixtwoo.damz.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtNumberOne, edtNumberTwoo;
    private Button btnCalculate;
    private TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumberOne = (EditText)findViewById(R.id.edt_angka_satu);
        edtNumberTwoo = (EditText)findViewById(R.id.edt_angka_dua);
        textResult = (TextView)findViewById(R.id.txt_hasil);
        btnCalculate = (Button)findViewById(R.id.btn_hitung);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_hitung) {
            String numberOne = edtNumberOne.getText().toString().trim();
            String numberTwoo = edtNumberTwoo.getText().toString().trim();
            boolean isEmptyField = false;

            if (TextUtils.isEmpty(numberOne)) {
                isEmptyField = true;
                edtNumberOne.setError("Field ini tidak boleh kosong!");
            }
            if (TextUtils.isEmpty(numberTwoo)) {
                isEmptyField = true;
                edtNumberTwoo.setError("Field ini tidak boleh kosong!");
            }
            if (!isEmptyField){
                Double satu = Double.parseDouble(numberOne);
                Double dua = Double.parseDouble(numberTwoo);
                Double hasil = satu + dua;
                textResult.setText(String.valueOf(hasil));
            }
        }
    }
}
