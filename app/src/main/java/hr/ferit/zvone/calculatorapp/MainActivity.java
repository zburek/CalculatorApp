package hr.ferit.zvone.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/// Not working properly when clicking operations and then equals,
/// should create additional variable for storing values to avoid this bug

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private String number = "0";
    private boolean commenceOperation = false;
    private boolean commenceAdding = false;
    private boolean commenceSubtracting = false;
    private boolean commenceMultiplying = false;
    private boolean commenceDividing = false;
    private boolean doubleClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
    }

    private void initializeUI()
    {
        this.result =(TextView) findViewById(R.id.result);
    }

    ///////////////////// Numbers /////////////////////
    public void Zero(View view){
        if(this.result.getText().toString().equals("0"))
        {
            return;
        }
        if(commenceOperation){
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "0");
        doubleClick = false;
    }
    public void One(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "1");
        doubleClick = false;
    }
    public void Two(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "2");
        doubleClick = false;
    }
    public void Three(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "3");
        doubleClick = false;
    }
    public void Four(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "4");
        doubleClick = false;
    }
    public void Five(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "5");
        doubleClick = false;
    }
    public void Six(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "6");
        doubleClick = false;
    }
    public void Seven(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "7");
        doubleClick = false;
    }
    public void Eight(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "8");
        doubleClick = false;
    }
    public void Nine(View view){
        if(commenceOperation){
            this.number = this.result.getText().toString();
            this.result.setText("");
            commenceOperation=false;
        }
        this.result.setText(this.result.getText().toString() + "9");
        doubleClick = false;
    }
    ///////////////////// Numbers ////////////////////

    ///////////////////// Dot ////////////////////
    public void Dot(View view){
        for (int i = 0; i < this.result.getText().toString().length(); i++){
            char c = this.result.getText().toString().charAt(i);
            if(c == '.'){
                return;
            }
        }
        this.result.setText(this.result.getText().toString() + ".");
    }
    ///////////////////// Dot ////////////////////

    ///////////////////// Operations ////////////////////
    public void Equals(View view){
        if(commenceAdding){
           DoAdd(view);
        }
        if(commenceSubtracting){
            DoSubtracting(view);
        }
        if(commenceMultiplying){
            DoMultiplying(view);
        }
        if(commenceDividing){
            DoDividing(view);
        }
        this.result.setText(this.number.toString());

    }

    public void Add(View view){
        if(this.result.getText().toString().equals("")) {
            return;
        }
        if(commenceAdding || commenceSubtracting || commenceMultiplying || commenceDividing)
        {
            if(!doubleClick) {
                Equals(view);
            }
            doubleClick = true;
        }
        commenceOperation = true;
        commenceAdding = true;
    }
    public void DoAdd(View view){
        String tempNumber = this.result.getText().toString();
        double numberResult = Double.parseDouble(tempNumber);
        double numberNumber = Double.parseDouble(this.number);

        double numberFinalResult = numberResult+numberNumber;
        this.number = String.valueOf(numberFinalResult);
        commenceAdding = false;
    }

    public void Subtract(View view){
        if(this.result.getText().toString().equals("")) {
            return;
        }
        if(commenceAdding || commenceSubtracting || commenceMultiplying || commenceDividing)
        {
            if(!doubleClick) {
                Equals(view);
            }
            doubleClick = true;
        }
        commenceOperation = true;
        commenceSubtracting = true;
    }
    public void DoSubtracting(View view){
        String tempNumber = this.result.getText().toString();
        double numberResult = Double.parseDouble(tempNumber);
        double numberNumber = Double.parseDouble(this.number);

        double numberFinalResult = numberNumber - numberResult;
        this.number = String.valueOf(numberFinalResult);
        commenceSubtracting = false;
    }

    public void Multiply(View view){
        if(this.result.getText().toString().equals("")) {
            return;
        }
        if(commenceAdding || commenceSubtracting || commenceMultiplying || commenceDividing)
        {
            if(!doubleClick) {
                Equals(view);
            }
            doubleClick = true;
        }
        commenceOperation = true;
        commenceMultiplying = true;
    }
    public void DoMultiplying(View view){
        String tempNumber = this.result.getText().toString();
        double numberResult = Double.parseDouble(tempNumber);
        double numberNumber = Double.parseDouble(this.number);

        double numberFinalResult = numberResult*numberNumber;
        this.number = String.valueOf(numberFinalResult);
        commenceMultiplying = false;
    }

    public void Divide(View view){
        if(this.result.getText().toString().equals("")) {
            return;
        }
        if(commenceAdding || commenceSubtracting || commenceMultiplying || commenceDividing)
        {
            if(!doubleClick) {
                Equals(view);
            }
            doubleClick = true;
        }
        commenceOperation = true;
        commenceDividing = true;
    }
    public void DoDividing(View view){
        String tempNumber = this.result.getText().toString();
        double numberResult = Double.parseDouble(tempNumber);
        double numberNumber = Double.parseDouble(this.number);

        double numberFinalResult = numberNumber/numberResult;
        this.number = String.valueOf(numberFinalResult);
        commenceDividing = false;
    }
    ///////////////////// Operations ////////////////////

    ///////////////////// Helper Functions /////////////////////

    ///////////////////// Helper Functions /////////////////////
}
