package com.example.watch;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Draw extends View {

    private float width;
    private float height;
    private Paint paint = new Paint();
    private Bitmap bitmap;
    public Draw(Context context,float width,float height) {

        super(context);
        this.width=width;
        this.height=height;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float iternalCircleBorder=10;
        float iternalCircleRadius=width/4f;


        bitmap = Bitmap.createBitmap(100, 100,
                Bitmap.Config.ARGB_8888);
        // стиль Заливка
        paint.setStyle(Paint.Style.FILL);

        // закрашиваем холст белым цветом
        paint.setColor( Color.parseColor("#060627"));
        canvas.drawPaint(paint);

        // Рисуем желтый круг
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#999797"));
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        // canvas.drawCircle(950, 30, 25, mPaint);
        canvas.drawCircle(width/2f, height/2f, width/3f, paint);


        // Рисуем желтый круг
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#999797"));
        paint.setStrokeWidth(iternalCircleBorder);
        paint.setStyle(Paint.Style.STROKE);
        // canvas.drawCircle(950, 30, 25, mPaint);
        canvas.drawCircle(width/2f, height/2f, iternalCircleRadius, paint);



        // Рисуем желтый круг
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#61144214"));
        paint.setStyle(Paint.Style.FILL);
        // canvas.drawCircle(950, 30, 25, mPaint);
        canvas.drawCircle(width/2f, height/2f, iternalCircleRadius-iternalCircleBorder, paint);

        // test clock
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String text=formatter.format(date);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(100);

        canvas.drawText(text,width/2f,height/2f,paint);


        canvas.drawBitmap(bitmap,440,530,paint);
    }
}
