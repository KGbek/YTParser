package com.example.ytparser.ui.fragments.playlists

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.ytparser.R
import com.example.ytparser.databinding.FragmentPlaylistsBinding
import com.example.ytparser.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistFragment: BaseFragment<FragmentPlaylistsBinding>(R.layout.fragment_playlists) {

    override val binding by viewBinding(FragmentPlaylistsBinding::bind)
    private val viewModel: PlaylistsViewModel by viewModel()

}