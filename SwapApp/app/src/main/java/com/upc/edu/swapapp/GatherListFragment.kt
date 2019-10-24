package com.upc.edu.swapapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.upc.edu.swapapp.data.database.model.Gather
import kotlinx.android.synthetic.main.fragment_gather_list.*

/**
 * A simple [Fragment] subclass.
 */
class GatherListFragment : Fragment() {

    val Gathers: List<Gather> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rvGatherList.layoutManager = LinearLayoutManager(this.activity)


        return inflater.inflate(R.layout.fragment_gather_list, container, false)
    }


}
