package com.example.watch;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import static android.content.Context.WINDOW_SERVICE;

public class IternalCircle extends View {

    private static float width;
    private static float height;

    public IternalCircle(Context context) {
        super(context);
        this.height=getHeight();
        this.width=getWidth();
        drawCircle();
    }
    public static Canvas drawCircle(){


        Bitmap bitmap = Bitmap.createBitmap(700, 1000, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmap);

        // canvas background color
        canvas.drawARGB(255, 78, 168, 186);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FFFFFF"));
        paint.setStrokeWidth(30F);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setDither(true);



        float w, h, cx, cy, radius;
        w = width;
        h = height;
        cx = w / 2;
        cy = h / 2;

        if (w > h) {
            radius = h / 4;
        } else {
            radius = w / 4;
        }
        canvas.drawCircle(cx, cy, radius, paint);
        return canvas;
    }
}
