package com.example.multithreadapp;
import android.util.Log;
import android.widget.Toast;

public class MyRunnableClass implements Runnable{

    // Implement time-consuming task
    public void run(){
        try{
        for(int i=100;i<105;i++){
            Thread.sleep(1000);
            Log.e("t1:<<runnable>>","runnable talking: "+ i );
          //  Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
        }
    }catch (InterruptedException e){
        Log.e("t1:<<runnable>>",e.getMessage());
    }
    }
}