package rsa.codelovertechnology.com.rsaclt;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newsshare extends AppCompatActivity {

    FloatingActionButton sharebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_newsshare );

        FloatingActionButton sharebutton=(FloatingActionButton)findViewById(R.id.sharebutton );
                        sharebutton.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent=new Intent(Intent.ACTION_SEND);
                                intent.setType("text/plain");
                                String shareBody="Rashtiya Saman Adhikar";
                                String shareSubject="Village News";

                                intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                                intent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);

                                startActivity(Intent.createChooser(intent,"Share News"  )  );
                            }
                        } );
    }
}
