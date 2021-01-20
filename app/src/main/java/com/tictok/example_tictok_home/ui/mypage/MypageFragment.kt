package com.tictok.example_tictok_home.ui.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tictok.example_tictok_home.R

class MypageFragment : Fragment() {

    private lateinit var mypageViewModel: MypageViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mypageViewModel =
                ViewModelProvider(this).get(MypageViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_mypage, container, false)
        val textView: TextView = root.findViewById(R.id.text_mypage)
        mypageViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}