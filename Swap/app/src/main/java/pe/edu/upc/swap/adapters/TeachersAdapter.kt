package pe.edu.upc.swap.adapters

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.util.Base64
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prototype_teacher.view.*
import pe.edu.upc.swap.R
import pe.edu.upc.swap.data.network.model.Teacher

class TeachersAdapter(val teachers: List<Teacher>) :
    RecyclerView.Adapter<TeachersAdapter.PrototypeTeacher>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrototypeTeacher {
        return PrototypeTeacher(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.prototype_teacher, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return teachers.size
    }

    override fun onBindViewHolder(holder: PrototypeTeacher, position: Int) {
        holder.bindTo(teachers[position])
    }

    inner class PrototypeTeacher(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvName = itemView.tvName
        private val tvDescriptor = itemView.tvDescription
        private val tvLanguage = itemView.tvLanguages
        private val ivPicture = itemView.ivPicture

        fun bindTo(teacher: Teacher) {
            val size = teacher.languages.size
            val fullName = "" + teacher.name + " " + teacher.lastname
            var languages = ""
            tvName.text = fullName
            for (i in 0 until size) {
                languages += teacher.languages[i] + " "
            }
            tvDescriptor.text = teacher.description
            tvLanguage.text = languages

            val arrayBytes = Base64.decode(teacher.image.toByteArray(), Base64.DEFAULT)
            ivPicture.setImageBitmap(BitmapFactory.decodeByteArray(arrayBytes, 0, arrayBytes.size))
        }
    }
}

