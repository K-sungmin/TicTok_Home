package com.tictok.example_tictok_home.ui.study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tictok.example_tictok_home.R

class StudyFragment : Fragment() {

    private lateinit var studyViewModel: StudyViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        studyViewModel =
                ViewModelProvider(this).get(StudyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_study, container, false)
        val textView: TextView = root.findViewById(R.id.text_study)
        studyViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}