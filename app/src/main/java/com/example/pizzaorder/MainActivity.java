package com.example.pizzaorder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view)
    {
        quantity++;
        display(quantity);
    }

    public void decrement(View view)
    {
        quantity--;
        if(quantity<0)
            quantity=0;
        else
            display(quantity);
    }


    public void submitorder(View view)
    {
        displayprice(quantity*40);
    }
    public void  display(int number)
    {
        TextView x= (TextView) findViewById(R.id.quantity_text_view);
        x.setText("" + number);
    }
    public void displayprice(int number)
    {
        TextView y= (TextView) findViewById(R.id.price_text_view);
        y.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}

