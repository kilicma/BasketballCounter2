package com.kilicma.mvvmbasketballcounter.match

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kilicma.mvvmbasketballcounter.databinding.FragmentMatchBinding

class FragmentMatch : Fragment() {

    private lateinit var binding: FragmentMatchBinding
    private val viewModel : MatchViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentMatchBinding.inflate(inflater,container, false)
        binding.leftThreePoints.setOnClickListener {
            binding.scoreOne.text = viewModel.forThreeThrowA().toString()
        }
        binding.rightThreePoints.setOnClickListener {
            binding.scoreTwo.text = viewModel.forThreeThrowB().toString()
        }
        binding.leftTwoPoints.setOnClickListener {
            binding.scoreOne.text = viewModel.forTwoThrowA().toString()
        }
        binding.rightTwoPoints.setOnClickListener {
            binding.scoreTwo.text = viewModel.forTwoThrowB().toString()
        }
        binding.leftFreeThrow.setOnClickListener {
            binding.scoreOne.text = viewModel.forFreeThrowA().toString()
        }
        binding.rightFreeThrow.setOnClickListener {
            binding.scoreTwo.text = viewModel.forFreeThrowB().toString()
        }


        binding.resetButton.setOnClickListener {
            resetScore()
        }
        binding.endGameButtom.setOnClickListener {
            findNavController().navigate(FragmentMatchDirections.actionFragmentMatchSelf())
            resetScore()
        }

        return binding.root
    }

    private fun resetScore() {
        binding.scoreOne.text = viewModel.forReset().toString()
        binding.scoreTwo.text = viewModel.forReset().toString()
    }
}