package com.example.nikol.rocketlaunch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by nikol on 9/23/2017.
 */

public class GameSurface extends SurfaceView {
    Paint red = new Paint();

    public GameSurface(Context context) {
        super(context);
    }

    public GameSurface(Context context, AttributeSet a) {
        super (context, a);
    }

    public GameSurface(Context context, AttributeSet a, int i1) {
        super (context, a, i1);
    }

    public GameSurface(Context context, AttributeSet a, int i1, int i2) {
        super (context, a,i1, i2);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        red.setARGB(255,255,0,0);
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2, canvas.getWidth()/4, red);
    }
}
