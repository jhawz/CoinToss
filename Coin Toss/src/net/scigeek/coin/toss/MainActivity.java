package net.scigeek.coin.toss;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void flipCoin( View theButton ){
    	int count = 100;
    	Random random = new Random();
    	View a = findViewById(R.id.imageView1);
    	View b = findViewById(R.id.imageView2);
    	boolean side = false;
    	
    	while (count != 0 ){
    		try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		side = random.nextBoolean();
    		if ( count % 2 == 0){
    			a.setVisibility(View.INVISIBLE);
    	    	b.setVisibility(View.VISIBLE);
    	    	count -= 1;
    		}
    		else{
    			b.setVisibility(View.INVISIBLE);
    	    	a.setVisibility(View.VISIBLE);
				}
    	    	count -=1;
    		}
    	if (side == true){
    		a.setVisibility(View.VISIBLE);
    		b.setVisibility(View.INVISIBLE);
    	}
    	else{
    		a.setVisibility(View.INVISIBLE);
    		b.setVisibility(View.VISIBLE);
    	}
    }
}
