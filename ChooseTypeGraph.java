package com.padrew.enssystem;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class ChooseTypeGraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type_graph);
    } // main method

    public void clickBackChooseType(View view) {
        finish();
    }

    public void clickChoose1(View view) {
        Intent intent = new Intent(ChooseTypeGraph.this, StaticActivity.class);
        intent.putExtra("Status", false);
        startActivity(intent);
    }

    public void clickChoose2(View view) {
        Intent intent = new Intent(ChooseTypeGraph.this, StaticDistrict.class);
        intent.putExtra("Status", true);
        startActivity(intent);
    }


}// main class
