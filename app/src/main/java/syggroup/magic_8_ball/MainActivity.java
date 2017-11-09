package syggroup.magic_8_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView ballDisplay = findViewById(R.id.ballDisplay);
        final Button myButton = findViewById(R.id.askButton);

        final int[] ballArray = {
                R.mipmap.ball1,
                R.mipmap.ball2,
                R.mipmap.ball3,
                R.mipmap.ball4,
                R.mipmap.ball5,

        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[number]);

            }
        });



    }
}
