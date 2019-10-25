package pe.edu.upc.swap.fragments


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_teachers.*

import pe.edu.upc.swap.R
import pe.edu.upc.swap.adapters.TeachersAdapter
import pe.edu.upc.swap.data.database.AppDatabase
import pe.edu.upc.swap.data.database.model.User
import pe.edu.upc.swap.data.network.RetrofitClient
import pe.edu.upc.swap.data.network.model.Teacher
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */
class TeachersFragment : Fragment() {

    lateinit var teachersAdapter: TeachersAdapter
    var teachers: List<Teacher> = ArrayList()
    var users: MutableList<User> = ArrayList()
    var token: String = ""

    companion object{
        private const val ERROR_TAG = "Error"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teachers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        users = AppDatabase.getInstance(view!!.context).getDao().getAll()
        token = users[0].token

        rvTeachers.layoutManager = LinearLayoutManager(context)
        searchTeachers()
    }

    private fun searchTeachers(){
        val retrofit = RetrofitClient.instance().listTeachers(token)

       retrofit.enqueue(object: Callback<List<Teacher>> {
            override fun onFailure(call: Call<List<Teacher>>, t: Throwable) {
                Log.d(ERROR_TAG, t.toString())
            }

            override fun onResponse(
                call: Call<List<Teacher>>,
                response: Response<List<Teacher>>
            ) {
                if (response.isSuccessful){
                    teachers = response.body()!!
                    teachersAdapter = TeachersAdapter(teachers)
                    rvTeachers.adapter = teachersAdapter
                }else{
                    Log.d(ERROR_TAG, "Error")
                }
            }
        })
    }
}
