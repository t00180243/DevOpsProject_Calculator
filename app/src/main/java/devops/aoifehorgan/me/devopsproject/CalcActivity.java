package devops.aoifehorgan.me.devopsproject;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class CalcActivity extends AppCompatActivity {
    enum Operation {addition, minus, multiply, divide}

    Operation operation = Operation.addition;
    float storedValue=0;
    TextView textView;

    Button clear, bracket, percentage, divide, add, subtract, multiply, equal, minusValue;

    Button one, two, three, four, five, six, seven, eight, nine, point, zero ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //code for hide title bar.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_calc);

        textView = findViewById(R.id.textView1);

        clear = findViewById(R.id.buttonClearText);
        bracket = findViewById(R.id.buttonBracket);
        percentage = findViewById(R.id.buttonPercentage);
        divide = findViewById(R.id.buttonDivide);
        add = findViewById(R.id.buttonAdd);
        subtract = findViewById(R.id.buttonSubtraction);
        multiply = findViewById(R.id.buttonMultiply);
        equal = findViewById(R.id.buttonEqual);
        minusValue = findViewById(R.id.buttonMinusValue);

        one = findViewById(R.id.button1);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        point = findViewById(R.id.buttonPoint);
        zero = findViewById(R.id.buttonZero);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(null);
            }
        });


        bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String S = textView.getText().toString();

            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "%";

                textView.setText(s);

            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "/";

                textView.setText(s);

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "+";

                textView.setText(s);
                operation = Operation.addition;

            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "-";

                textView.setText(s);

            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "*";
                textView.setText(s);

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (operation) {
                    case addition:
                        String s = ""+addC(storedValue,storedValue);
                    textView.setText(s);

                    case minus:
                        String sub = ""+subtractC(storedValue,storedValue);
                        textView.setText(sub);

                    case multiply:
                        String mul = ""+multiplyC(storedValue,storedValue);
                        textView.setText(mul);

                    case divide:
                        String div = ""+divideC(storedValue,storedValue);
                        textView.setText(div);
                }


            }
        });


        minusValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "1";
                textView.setText(s);
                storedValue =1;

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "2";
                textView.setText(s);
                storedValue =2;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "3";
                textView.setText(s);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "4";
                textView.setText(s);

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "5";
                textView.setText(s);

            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "6";
                textView.setText(s);

            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "7";
                textView.setText(s);

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "8";
                textView.setText(s);

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "9";
                textView.setText(s);

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + ".";
                textView.setText(s);

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText() + "0";
                textView.setText(s);

            }
        });
    }


    public static float addC(float a, float b){
        return a+b;
    }

    public static float subtractC(float a, float b){
        return a-b;
    }

    public static float divideC(float a, float b){
        return b/a;
    }

    public static float multiplyC(float a, float b){
        return a*b;
    }


}

