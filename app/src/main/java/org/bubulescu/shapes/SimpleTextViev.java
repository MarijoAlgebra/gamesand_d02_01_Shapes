package org.bubulescu.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Random;


public class SimpleTextViev extends View {

    public SimpleTextViev(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLUE);

        Paint paint = new Paint();

        paint.setColor(Color.MAGENTA);
        paint.setTextSize(100f);

        canvas.drawText("Android rulez", 50f, 150f, paint);

        int colors[] = new int[]{Color.BLACK, Color.YELLOW, Color.CYAN};
        Random rand = new Random();
        int randomIndex = rand.nextInt(2);

        float[] positions = new float[]{
                100, 350,
                170, 390,
                220, 350,
                280, 390,
                330, 300,
                385, 365,
                420, 390
        };

        paint.setColor(colors[randomIndex]);
        canvas.drawPosText("Android", positions, paint);
    }
}
