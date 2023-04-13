package com.kilicma.mvvmbasketballcounter.match

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MatchViewModel : ViewModel(){
    var scoreA : Int= 0
    var scoreB : Int= 0

    fun forThreeThrowA() : Int{
        scoreA +=3
        return scoreA
    }
    fun forThreeThrowB() : Int{
        scoreB +=3
        return scoreB
    }
    fun forTwoThrowA() : Int{
        scoreA +=2
        return scoreA
    }
    fun forTwoThrowB() : Int{
        scoreB +=2
        return scoreB
    }
    fun forFreeThrowA() : Int{
        scoreA +=1
        return scoreA
    }
    fun forFreeThrowB() : Int{
        scoreB +=1
        return scoreB
    }
    fun forReset() : Int{
        scoreA =0
        scoreB =0
        return scoreA
    }




}