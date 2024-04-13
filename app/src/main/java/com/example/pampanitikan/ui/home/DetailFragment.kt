package com.example.pampanitikan.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pampanitikan.R
import com.example.pampanitikan.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        // Retrieve data from arguments
        val imageResId = arguments?.getInt("imageResId") ?: R.drawable.ic_launcher_background
        val author = arguments?.getString("author") ?: ""
        val title = arguments?.getString("title") ?: ""
        val content = arguments?.getString("content") ?: ""

        // Set data to views
        binding.imageView.setImageResource(imageResId)
        binding.textAuthor.text = author
        binding.textTitle.text = title
        binding.textContent.text = content

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
