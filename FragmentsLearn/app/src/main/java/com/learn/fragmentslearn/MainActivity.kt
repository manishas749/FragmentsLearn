package com.learn.fragmentslearn

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.learn.fragmentslearn.fragments.FragmentName

class MainActivity : FragmentActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FragmentName>(R.id.fragmentContainer)
                  addToBackStack(null)
                //addToBackStack(FragmentName::class.simpleName)
            }

        }
    }
}