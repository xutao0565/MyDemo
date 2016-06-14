package com.example.mac.fx168.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

import com.example.mac.fx168.R;
import com.example.mac.fx168.frament.ConsultFragment;
import com.example.mac.fx168.frament.InformationFragment;
import com.example.mac.fx168.frament.MarketFragment;
import com.example.mac.fx168.frament.PersonFragment;
import com.example.mac.fx168.frament.SubscibeFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    /**
     * 申明底部的按钮
     */
    private RadioGroup radioGroup;
    /**
     * 申明管理器
     */
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.radioGroup= (RadioGroup) this.findViewById(R.id.radioGroup);
        this.fragmentManager=getSupportFragmentManager();
        this.radioGroup.setOnCheckedChangeListener(this);

        ConsultFragment consultFragment=new ConsultFragment();
        commitFragment(consultFragment);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.rb_consult:
                ConsultFragment consultFragment=new ConsultFragment();
                commitFragment(consultFragment);
                break;

            case R.id.rb_subscribe:
                SubscibeFragment subscibeFragment=new SubscibeFragment();
                commitFragment(subscibeFragment);
                break;

            case R.id.rb_market:
                MarketFragment marketFragment=new MarketFragment();
                commitFragment(marketFragment);
                break;

            case R.id.rb_information:
                InformationFragment informationFragment=new InformationFragment();
                commitFragment(informationFragment);
                break;

            case R.id.rb_personal:
                PersonFragment personFragment=new PersonFragment();
                commitFragment(personFragment);
                break;
            default:
                Log.e("MainActivity","The Error of Fragment Checked");
                break;
        }

    }

    /**
     * 动态提交Fragment的方法
     * @param fragment 实例化的Fragment对象
     */
    public void commitFragment(Fragment fragment){
        FragmentTransaction transaction=this.fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout,fragment);
        transaction.commit();
    }
}
