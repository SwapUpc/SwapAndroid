package pe.edu.upc.swap.activities.ui.matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pe.edu.upc.swap.activities.R

class MatchesFragment : Fragment() {

    private lateinit var matchesViewModel: MatchesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        matchesViewModel =
            ViewModelProviders.of(this).get(MatchesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_send, container, false)
        val textView: TextView = root.findViewById(R.id.text_send)
        matchesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}