package com.example.taller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNro1;
    TextView tvNro2;
    TextView tvResultado;
    float n1 = 0;
    float n2 = 0;
    String op = "";
    float result = 0;
    String a = "";
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt0;
    Button btborrar;
    Button btmas;
    Button btmenos;
    Button btpor;
    Button btdiv;

    Button btigual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNro1 = findViewById(R.id.tvNro1);
        tvNro2 = findViewById(R.id.tvNro2);
        tvResultado = findViewById(R.id.tvResultado);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        bt0 = findViewById(R.id.bt0);
        btborrar = findViewById(R.id.btborrar);
        btmas = findViewById(R.id.btmas);
        btmenos = findViewById(R.id.btmenos);
        btpor = findViewById(R.id.btpor);
        btdiv =findViewById(R.id.btdiv);
        btigual = findViewById(R.id.btigual);


        bt0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tvNro1.setText(tvNro1.getText() + "9");
            }
        });
        btborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNro1.setText("");
                tvNro2.setText("");
                tvResultado.setText("");
                bt0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "0");
                    }
                });
                bt1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "1");
                    }
                });
                bt2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "2");
                    }
                });
                bt3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "3");
                    }
                });
                bt4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "4");
                    }
                });
                bt5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "5");
                    }
                });
                bt6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "6");
                    }
                });
                bt7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "7");
                    }
                });
                bt8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "8");
                    }
                });
                bt9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "9");
                    }
                });
            }
        });
        btmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="+";
                bt0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "0");
                    }
                });
                bt1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "1");
                    }
                });
                bt2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "2");
                    }
                });
                bt3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "3");
                    }
                });
                bt4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "4");
                    }
                });
                bt5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "5");
                    }
                });
                bt6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "6");
                    }
                });
                bt7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "7");
                    }
                });
                bt8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "8");
                    }
                });
                bt9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "9");
                    }
                });
            }
        });
        btmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="-";
                bt0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "0");
                    }
                });
                bt1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "1");
                    }
                });
                bt2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "2");
                    }
                });
                bt3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "3");
                    }
                });
                bt4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "4");
                    }
                });
                bt5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "5");
                    }
                });
                bt6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "6");
                    }
                });
                bt7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "7");
                    }
                });
                bt8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "8");
                    }
                });
                bt9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "9");
                    }
                });
            }
        });
        btpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="*";
                bt0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "0");
                    }
                });
                bt1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "1");
                    }
                });
                bt2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "2");
                    }
                });
                bt3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "3");
                    }
                });
                bt4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "4");
                    }
                });
                bt5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "5");
                    }
                });
                bt6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "6");
                    }
                });
                bt7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "7");
                    }
                });
                bt8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "8");
                    }
                });
                bt9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "9");
                    }
                });
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                op="/";
                bt0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "0");
                    }
                });
                bt1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "1");
                    }
                });
                bt2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "2");
                    }
                });
                bt3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "3");
                    }
                });
                bt4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "4");
                    }
                });
                bt5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "5");
                    }
                });
                bt6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "6");
                    }
                });
                bt7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "7");
                    }
                });
                bt8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "8");
                    }
                });
                bt9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro2.setText(tvNro2.getText() + "9");
                    }
                });
            }
        });
        btigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float n1 = Float.parseFloat(tvNro1.getText().toString());
                Float n2 = Float.parseFloat(tvNro2.getText().toString());
                if (op=="+"){
                    result=n1+n2;
                    a=Float.toString(result);
                    tvResultado.setText(a);
                }
                else if (op=="-"){
                    result=n1-n2;
                    a=Float.toString(result);
                    tvResultado.setText(a);
                }
                else if (op=="*"){
                    result=n1*n2;
                    a=Float.toString(result);
                    tvResultado.setText(a);
                }
                else if (op=="/"){
                    if (n2==0){
                        tvResultado.setText("Syntax Error");
                    }
                    else{
                        result=n1/n2;
                        a=Float.toString(result);
                        tvResultado.setText(a);
                    }
                }
                tvNro1.setText("");
                tvNro2.setText("");
                bt0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "0");
                    }
                });
                bt1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "1");
                    }
                });
                bt2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "2");
                    }
                });
                bt3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "3");
                    }
                });
                bt4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "4");
                    }
                });
                bt5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "5");
                    }
                });
                bt6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "6");
                    }
                });
                bt7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "7");
                    }
                });
                bt8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "8");
                    }
                });
                bt9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        tvNro1.setText(tvNro1.getText() + "9");
                    }
                });
            }
        });

    }




}