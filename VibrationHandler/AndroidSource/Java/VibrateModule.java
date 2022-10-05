package ${YYAndroidPackageName};

//Game Maker Studio 2 Packages
import ${YYAndroidPackageName}.R;
import com.yoyogames.runner.RunnerJNILib;
import ${YYAndroidPackageName}.RunnerActivity;

//Some Android Packages
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Dialog;
import android.view.MotionEvent;

import android.os.Vibrator;
import android.os.VibrationEffect;
import android.os.Build;
import android.content.Context;


//Starts Here
public class VibrateModule extends RunnerActivity {

    //final String TAG = "yoyo";

    //Vibrator vibrator = (Vibrator) RunnerActivity.CurrentActivity.getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);


    public void VibrateOnce(double len, double strenght) {
        Vibrator vibrer = (Vibrator) RunnerActivity.CurrentActivity.getSystemService(Context.VIBRATOR_SERVICE);
        if(vibrer != null){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrer.vibrate(VibrationEffect.createOneShot((int)len,(int) strenght));
        }else{

          vibrer.vibrate((int)len);

        }


    }
  }

  public double CanVibrate()
  {
    int Result=0;
    String vs = RunnerActivity.CurrentActivity.getApplicationContext().VIBRATOR_SERVICE;
    Vibrator mVibrator = (Vibrator)RunnerActivity.CurrentActivity.getSystemService(vs);
    boolean isVibrator = mVibrator.hasVibrator();

    if(isVibrator){

      Result= 1;

    }

      return Result;





  }



}
