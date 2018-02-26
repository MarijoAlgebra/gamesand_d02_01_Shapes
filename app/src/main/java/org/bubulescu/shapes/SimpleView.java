package org.bubulescu.shapes;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

public class SimpleView extends View {

    private ShapeDrawable shapeDrawable;

    public SimpleView(Context context) {
        super(context);
        setFocusable(true);
        shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int x = 100;
        int y = 10;
        int width = 500;
        int height = 250;
        shapeDrawable.setBounds(x, y, x + width, y + height);
        shapeDrawable.draw(canvas);
    }
}
