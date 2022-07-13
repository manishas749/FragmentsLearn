package com.learn.fragmentslearn.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.learn.fragmentslearn.R
import com.learn.fragmentslearn.Utility

class FragmentDetails : Fragment(R.layout.fragment_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = requireArguments().getString(Utility.KEY_NAME)
        val age = requireArguments().getString(Utility.KEY_AGE)
        val className = requireArguments().getString(Utility.KEY_CLASS)

        view.findViewById<TextView>(R.id.txtName).text = name
        view.findViewById<TextView>(R.id.txtAge).text = age
        view.findViewById<TextView>(R.id.txtClass).text = className
    }
}