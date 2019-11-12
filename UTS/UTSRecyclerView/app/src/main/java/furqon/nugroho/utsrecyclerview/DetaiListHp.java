package furqon.nugroho.utsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetaiListHp extends AppCompatActivity {
    private int hmj_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Hp> listHmj=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detai_list_hp);
        hmj_id = getIntent().getIntExtra("hmj_id", 0);
        tvName = findViewById(R.id.nama_hp);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);
        listHmj.addAll(HpData.getListData());
        setLayout();
    }
    private void setLayout() {
        tvName.setText(listHmj.get(hmj_id).getName());
        tvDesc.setText(listHmj.get(hmj_id).getDescription());
        getSupportActionBar().setTitle("Detail");
        Glide.with(this)
                .load(listHmj.get(hmj_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.back_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.home:
                Intent activity2 = new Intent(this, MainActivity.class);
                startActivity(activity2);
                return true;

        }
        return false;
    }
}
