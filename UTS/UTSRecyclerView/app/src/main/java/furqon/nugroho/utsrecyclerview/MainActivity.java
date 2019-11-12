package furqon.nugroho.utsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHp;
    private ArrayList<Hp> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("List Hp Blackberry");
        }
        rvHp=findViewById(R.id.rv_hp);
        rvHp.setHasFixedSize(true);
        list.addAll(HpData.getListData());
        showRecyclerList();
        }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
        }
    private void showRecyclerList() {
        rvHp.setLayoutManager(new LinearLayoutManager(this));
        CardHpAdapter cardHmjAdapter = new CardHpAdapter(this, list);
        rvHp.setAdapter(cardHmjAdapter);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profile:
                Intent activity1 = new Intent(this, InfoProfil.class);
                startActivity(activity1);
                return true;

        }
        return false;
    }
}