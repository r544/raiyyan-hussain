package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cakeButton,noodleButton,pizzaButton;

    String choices = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cakeButton = (Button) findViewById(R.id.cakeButton);
        noodleButton = (Button) findViewById(R.id.noodleButton);
        pizzaButton = (Button) findViewById(R.id.pizzaButton);
    }

    public void add_to_list(View view)
    {
        if(view == findViewById(R.id.cakeButton) )
        {
            choices = choices+"Cake"+"\n";
            price = price+599;
        }

        else if(view == findViewById(R.id.noodleButton))
        {
            choices = choices+"Noodle"+"\n";
            price = price+40;
        }

        else if(view == findViewById(R.id.pizzaButton))
        {
            choices = choices+"Pizza"+"\n";
            price = price+699;
        }

    }

    public void placeOrder(View view)
    {
        Intent i = new Intent(MainActivity.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices", choices);
        bundle.putDouble("price", price);
        i.putExtras(bundle);
        startActivity(i);


    }
}
			
