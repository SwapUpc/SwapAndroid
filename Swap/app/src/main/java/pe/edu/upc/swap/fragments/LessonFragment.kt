package pe.edu.upc.swap.fragments


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_lesson.*

import pe.edu.upc.swap.R
import pe.edu.upc.swap.adapters.LessonAdapter
import pe.edu.upc.swap.data.database.AppDatabase
import pe.edu.upc.swap.data.network.model.Lesson
import pe.edu.upc.swap.data.database.model.User
import pe.edu.upc.swap.data.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */
class LessonFragment : Fragment() {

    lateinit var lessonAdapter: LessonAdapter
    var lessons: List<Lesson> = ArrayList()
    var users: MutableList<User> = ArrayList()
    var token: String = ""

    companion object {
        private const val ERROR_TAG = "Error"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        users = AppDatabase.getInstance(view!!.context).getDao().getAll()
        token = users[0].token

        rvLesson.layoutManager = LinearLayoutManager(context)
        searchTeachers()
    }

    private fun searchTeachers() {
        val retrofit = RetrofitClient.instance().listLesson(token)

        retrofit.enqueue(object : Callback<List<Lesson>> {
            override fun onFailure(call: Call<List<Lesson>>, t: Throwable) {
                Log.d(ERROR_TAG, t.toString())
            }

            override fun onResponse(call: Call<List<Lesson>>, response: Response<List<Lesson>>) {
                if (response.isSuccessful) {
                    lessons = response.body()!!
                    lessonAdapter = LessonAdapter(lessons)
                    rvLesson.adapter = lessonAdapter
                } else {
                    Log.d(ERROR_TAG, "Error")
                }
            }
        })
    }
}
