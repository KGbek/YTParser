package com.example.ytparser.ui.fragments.playlist_detail

import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.ytparser.R
import com.example.ytparser.core.Resource
import com.example.ytparser.databinding.FragmentDetailBinding
import com.example.ytparser.model.Item
import com.example.ytparser.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailFragment : BaseFragment<FragmentDetailBinding>(R.layout.fragment_detail) {

    private lateinit var adapter: DetailAdapter

    override val binding by viewBinding(FragmentDetailBinding::bind)
    private val viewModel: DetailsViewModel by viewModel()
    private lateinit var item: Item

    override fun initialize() {
        adapter = DetailAdapter()
        binding.rvDetailed.adapter = adapter
        item = arguments?.getSerializable("item") as Item
    }

    override fun setupObservers() {
        viewModel.fetchPlaylistItems(item.id).observe(viewLifecycleOwner) { response ->
            when(response) {
                is Resource.Error -> {
                    Toast.makeText(requireContext(), response.message, Toast.LENGTH_SHORT).show()
                }
                is Resource.Loading -> {
                    Toast.makeText(requireContext(), "Data is loading", Toast.LENGTH_SHORT).show()
                }
                is Resource.Success -> {
                    response.data?.let { adapter.setList(it.items) }
                }
            }
        }
    }


}