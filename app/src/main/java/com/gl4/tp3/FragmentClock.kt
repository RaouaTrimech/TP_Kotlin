import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gl4.tp3.R
import android.view.View as View

private const val IS_DIGITAL = "digitalOK"
class FragmentClock : Fragment() {
    // TODO: Rename and change types of parameters
    private var digitalClock = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            digitalClock = it.getBoolean(IS_DIGITAL)

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return if (!digitalClock)
            inflater.inflate(R.layout.frag_numeric, container, false)
        else
            inflater.inflate(R.layout.frag_digital, container, false)
    }
}
