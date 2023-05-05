package com.example.gitfit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class DietActivity extends AppCompatActivity {

    PieChart pieChart;
    PieData pieData;
    PieDataSet pieDataSet;
    ArrayList pieEntries;
    ArrayList PieEntryLabels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_diet);
        pieChart = findViewById(R.id.pieChart);
        getPieEntries();
        pieDataSet = new PieDataSet(pieEntries, "Food Consumption");
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        pieDataSet.setSliceSpace(2f);
        pieDataSet.setValueTextColor(Color.WHITE);
        pieDataSet.setValueTextSize(10f);
        pieDataSet.setSliceSpace(5f);


    }
    public ArrayList getPieEntries() {
        setContentView(R.layout.fragment_diet);
        pieChart = findViewById(R.id.pieChart);
        pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(2f, "Carbs",0));
        pieEntries.add(new PieEntry(4f,"Fats", 1));
        pieEntries.add(new PieEntry(6f,"Sugar", 2));
        pieEntries.add(new PieEntry(8f,"Protein", 3));


        return pieEntries;
    }
}