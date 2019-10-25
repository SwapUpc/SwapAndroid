package pe.edu.upc.swap.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prototype_lesson.view.*
import pe.edu.upc.swap.R
import pe.edu.upc.swap.data.network.model.Lesson
import java.lang.StringBuilder

class LessonAdapter(val lessons: List<Lesson>) :
    RecyclerView.Adapter<LessonAdapter.PrototypeLesson>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PrototypeLesson {

        return PrototypeLesson(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.prototype_lesson, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return lessons.size
    }

    override fun onBindViewHolder(holder: PrototypeLesson, position: Int) {
        holder.bindTo(lessons[position])
    }

    inner class PrototypeLesson(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvDay = itemView.tvDay
        private val tvHour = itemView.tvHour
        private val tvDescription = itemView.tvDescription
        private val tvTask = itemView.tvTask
        private var tvLesson = itemView.tvLesson
        private var tvStatus = itemView.tvStatus

        fun bindTo(lesson: Lesson) {
            val temp = StringBuilder()
            temp.append(tvLesson.text).append(" ").append(lesson.id)
            tvTask.text = lesson.task
            tvDescription.text = lesson.description

            val completeDay: String = lesson.day
            val day = completeDay.substring(0, 10)
            val hour = completeDay.substring(11, 16)
            tvHour.text = hour
            tvDay.text = day

            when(lesson.status){
                0 -> tvStatus.text = "Waiting..."
                1 -> tvStatus.text = "Accepted"
                else -> tvStatus.text = "Cancel"
            }
        }
    }
}