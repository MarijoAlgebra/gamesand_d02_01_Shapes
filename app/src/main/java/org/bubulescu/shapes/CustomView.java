package org.bubulescu.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class CustomView extends View {

    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawColor(Color.BLACK);

        Paint paint = new Paint();

        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(6);
        canvas.drawLine(100, 0, 150, 800, paint);

        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(6);
        canvas.drawLine(300, 200, 500, 400, paint);

        paint.setColor(Color.CYAN);
        paint.setStrokeWidth(20);
        for (int y = 30, alpha = 255; alpha > 0; alpha -= 20, y += 30) {
            paint.setAlpha(255);
            canvas.drawLine(600, y, 700, y, paint);
            paint.setAlpha(alpha);
            canvas.drawLine(700, y, 900, y, paint);
        }
    }
}
