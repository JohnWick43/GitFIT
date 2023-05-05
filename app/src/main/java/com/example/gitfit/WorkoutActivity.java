package com.example.gitfit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class WorkoutActivity extends AppCompatActivity {

    GraphView graphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_workout);
        graphView = findViewById(R.id.idGraphView);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                // on below line we are adding
                // each point on our x and y axis.
                new DataPoint(0, 1),
                new DataPoint(1, 3),
                new DataPoint(2, 4),
                new DataPoint(3, 9),
                new DataPoint(4, 6),
                new DataPoint(5, 3),
                new DataPoint(6, 6),
                new DataPoint(7, 1),
                new DataPoint(8, 2)
        });
        // after adding data to our line graph series.
        // on below line we are setting
        // title for our graph view.
        graphView.setTitle("Workout Tracker");
        // on below line we are setting
        // text color to our graph view.
        graphView.setTitleColor(R.color.white);
        // on below line we are setting
        // our title text size.
        graphView.setTitleTextSize(90);
        // on below line we are adding
        // data series to our graph view.
        graphView.addSeries(series);
        graphView.getGridLabelRenderer().setVerticalAxisTitle(getApplicationContext().getString(R.string.Weight_Lifted));
        graphView.getGridLabelRenderer().setHorizontalAxisTitle(getApplicationContext().getString(R.string.Time));
        graphView.getGridLabelRenderer().setVerticalLabelsColor(Color.WHITE);
        graphView.getGridLabelRenderer().setVerticalAxisTitleColor(Color.WHITE);
        graphView.getGridLabelRenderer().setHorizontalLabelsColor(Color.WHITE);
        graphView.getGridLabelRenderer().setHorizontalAxisTitleColor(Color.WHITE);
        graphView.getViewport().setBackgroundColor(Color.BLACK);
        graphView.getGridLabelRenderer().setGridColor(Color.WHITE);
        graphView.getViewport().setDrawBorder(true);
        graphView.getViewport().setBorderColor(Color.YELLOW);

        series.setDrawDataPoints(true);
        series.setDataPointsRadius(10);
        series.setThickness(8);



    }
}