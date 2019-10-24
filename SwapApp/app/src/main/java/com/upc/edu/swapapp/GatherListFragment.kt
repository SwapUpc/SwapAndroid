package com.upc.edu.swapapp


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.upc.edu.swapapp.data.database.GatherDao
import com.upc.edu.swapapp.data.database.model.Gather
import com.upc.edu.swapapp.data.network.RetrofitClient
import com.upc.edu.swapapp.data.network.model.TeacherResponse
import kotlinx.android.synthetic.main.fragment_gather_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

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

        getGathers()

        rvGatherList.layoutManager = GridLayoutManager(this, 3, RecyclerView.HORIZONTAL, true)


        return inflater.inflate(R.layout.fragment_gather_list, container, false)
    }


    private fun getGathers() {


        val retrofit = RetrofitClient

        val GathersInterface = retrofit.instance(GatherDao::class.java)

        val methodGatherssData: Call<TeacherResponse> = GathersInterface.

        methodGathersData.enqueue(object : Callback<GatherResponse> {
            override fun onFailure(call: Call<GatherResponse>, t: Throwable) {
                Log.d("Excepción: ", t.toString())
            }

            override fun onResponse(
                call: Call<GatherResponse>,
                response: Response<GatherResponse>
            ) {

                if (response.isSuccessful) {
                    Gathers = response.body()!!.results
                    adapter = GatherAdapter(Gathers)
                    rvGather.adapter = adapter
                }

            }

        })

    }




}
