package com.example.lenovo.calci1;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);*/


        public class MainActivity extends Activity {


            Button b11,b21,b31,b41,b51,b61,b71,b81,b91,b01,bClear1,bplus1,bminus1,bdiv1,bmult1,bequal1,bdot1;
            TextView textViewResult1,textViewInput1;
            String s="",s1="",s2="",resultString="";
            int i=0,i1=0,c=-1;
            int result=0;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.content_main);


                b11=(Button)findViewById(R.id.one);
                b21=(Button)findViewById(R.id.b2);
                b31=(Button)findViewById(R.id.b3);
                b41=(Button)findViewById(R.id.b4);
                b51=(Button)findViewById(R.id.b5);
                b61=(Button)findViewById(R.id.b6);
                b71=(Button)findViewById(R.id.b7);
                b81=(Button)findViewById(R.id.b8);
                b91=(Button)findViewById(R.id.b9);
                b01=(Button)findViewById(R.id.b0);
                bClear1=(Button)findViewById(R.id.bClear);
                bmult1=(Button)findViewById(R.id.bmult);
                bplus1=(Button)findViewById(R.id.bplus);
                bminus1=(Button)findViewById(R.id.bminus);
                bdiv1=(Button)findViewById(R.id.bdiv);
                bdot1=(Button)findViewById(R.id.bdot);
                bequal1=(Button)findViewById(R.id.bequal);
                textViewInput1=(TextView)findViewById(R.id.textViewInput);
                textViewResult1=(TextView)findViewById(R.id.textViewResult);

                b11.setOnClickListener(new View.OnClickListener() {
                        @Override
                         public void onClick(View v) {

                            s=(String)textViewResult1.getText();
                            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                            {
                                textViewResult1.setText("");

                            }
                            textViewResult1.setText(s+"1");
                            s="";
                          }
                         }


                );
                b21.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"2");
                                               s="";
                                           }
                                       }


                );
                b31.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"3");
                                               s="";
                                           }
                                       }


                );
                b41.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"4");
                                               s="";
                                           }
                                       }


                );
                b51.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"5");
                                               s="";
                                           }
                                       }


                );
                b61.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"6");
                                               s="";
                                           }
                                       }


                );
                b71.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"7");
                                               s="";
                                           }
                                       }


                );
                b81.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"8");
                                               s="";
                                           }
                                       }


                );
                b91.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               s=(String)textViewResult1.getText();
                                               if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                                               {
                                                   textViewResult1.setText("");

                                               }
                                               textViewResult1.setText(s+"9");
                                               s="";
                                           }
                                       }


                );


            }



        }
