package co.minesweepers.maintenance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import co.minesweepers.maintenance.adapters.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager  = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecyclerViewAdapter(this));
    }

    @Override
    public void onCardClick(int position) {
        Toast.makeText(this, "Position clicked " + position, Toast.LENGTH_SHORT).show();
    }
}
