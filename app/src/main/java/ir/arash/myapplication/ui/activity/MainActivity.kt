package ir.arash.myapplication.ui.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.View
import ir.arash.myapplication.R
import ir.arash.myapplication.databinding.ActivityMainBinding
import ir.arash.myapplication.ui.fragment.MainFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mainFragment: MainFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        addFragment()
    }


    fun initView() {


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


    }

    fun addFragment() {

        mainFragment = MainFragment()
        supportFragmentManager.beginTransaction().add(binding.addFragment.id, mainFragment).commit()
    }

}

