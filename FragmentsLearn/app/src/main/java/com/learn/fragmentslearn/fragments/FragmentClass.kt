package com.learn.fragmentslearn.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.learn.fragmentslearn.R
import com.learn.fragmentslearn.Utility

class FragmentClass : Fragment(R.layout.fragment_name) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = requireArguments().getString(Utility.KEY_NAME)
        val age = requireArguments().getString(Utility.KEY_AGE)

        view.findViewById<Button>(R.id.btnNext).setOnClickListener {
            val className = view.findViewById<EditText>(R.id.editTextName).text.toString()

            val bundle = Bundle()
            bundle.putString(Utility.KEY_NAME, name)
            bundle.putString(Utility.KEY_AGE, age)
            bundle.putString(Utility.KEY_CLASS, className)

            activity?.supportFragmentManager?.commit {
                setReorderingAllowed(true)
                add<FragmentDetails>(R.id.fragmentContainer, args = bundle)
            }

        }
    }
}