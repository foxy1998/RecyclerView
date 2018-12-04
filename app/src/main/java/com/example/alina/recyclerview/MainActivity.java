package com.example.alina.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Point> points = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.list );

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById( R.id.list1 );
        DataAdapter adapter = new DataAdapter( points );
        recyclerView.setAdapter( adapter );

    }

    private void setInitialData() {

        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", false ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", false ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", false ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
        points.add( new Point( "Very_long_point_name_892783624545454634343423424234234234", "3,18 km.", true ) );
    }

}