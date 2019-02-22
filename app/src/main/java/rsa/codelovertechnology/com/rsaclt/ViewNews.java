package rsa.codelovertechnology.com.rsaclt;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.CollapsibleActionView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rsa.codelovertechnology.com.rsaclt.Adapters.NewsListViewAdapter;
import rsa.codelovertechnology.com.rsaclt.Models.NewsListModel;
import rsa.codelovertechnology.com.rsaclt.R;

     public class ViewNews extends AppCompatActivity {

             @Override
             protected void onCreate(Bundle savedInstanceState) {
                  super.onCreate( savedInstanceState );
                  setContentView( R.layout.view_news);
                  getSupportActionBar().hide();

                  String text=getIntent().getExtras().getString("setText");
                  String subheading=getIntent().getExtras().getString("setText");
                  //
                /* CollapsingToolbarLayout collapsingToolbarLayout=findViewById( R.id.collapsing );
                 collapsingToolbarLayout.setTitleEnabled(true);
                 TextView tv_newsHeadline =findViewById(R.id.aa_newsheadline);
                 TextView tv_subHeadline=findViewById(R.id.aa_newssubheading );
                 // setting of views
                //  tv_newsHeadline.setText(text);
                  //tv_subHeadline.setText(subheading);*/
             }

          }


         


