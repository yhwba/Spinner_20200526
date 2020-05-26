package kr.co.yhw.spinner_20200526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.yhw.spinner_20200526.Adapters.OccupationSpinnerAdapter;
import kr.co.yhw.spinner_20200526.databinding.ActivityMainBinding;
import kr.co.yhw.spinner_20200526.datas.Occupation;

public class MainActivity extends BaseActivity {

    List<Occupation> occupations = new ArrayList<>();
    OccupationSpinnerAdapter osa;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
    addOccupation();
    osa = new OccupationSpinnerAdapter(mContext, R.layout.occupation_spinner_list_item, occupations);
    binding.occSpinner.setAdapter(osa);

    }
    void addOccupation(){
        occupations.add(new Occupation("안드로이드", R.drawable.android_icon));
        occupations.add(new Occupation("ios", R.drawable.ios_icon));
        occupations.add(new Occupation("웹프론트", R.drawable.web_icon));
        occupations.add(new Occupation("서버", R.drawable.server_icon));
    }
}
