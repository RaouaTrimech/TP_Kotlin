package com.gl4.tp3.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import androidx.fragment.app.FragmentTransaction
import com.gl4.tp3.R
import com.gl4.tp3.databinding.ActivityHomeworkBinding


class HomeworkActivity : AppCompatActivity()/*,ActionMode.Callback*/ {
    private lateinit var binding : ActivityHomeworkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeworkBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    /*override fun onCreateActionMode(actionMode: ActionMode, menu: Menu?): Boolean {
        val inflater: MenuInflater = actionMode.menuInflater
        inflater.inflate(R.menu.context_mode_menu, menu)
        return true
    }*/
    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.action_switch)
        {
            binding.button.isChecked = !binding.switchId.isChecked
            setTime(null)
        }
        return super.onOptionsItemSelected(item)
    }*/

    // A method on the Fragment that owns the SlidingPaneLayout,
// called by the adapter when an item is selected.
    fun openDetails(view : View) {

        val toast = Toast.makeText(applicationContext, "this button has been pressed", Toast.LENGTH_SHORT)
        toast.show()
        var fragmentManager = supportFragmentManager
        var transaction = fragmentManager.beginTransaction()
        var fragmentHomework = FragmentHomework()

        if (binding.slidingPaneLayout.isOpen) {
            transaction.replace(R.id.fragment2,fragmentHomework)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        }else{
            transaction.replace(R.id.fragment1,fragmentHomework)
        }
        transaction.commit()
        binding.slidingPaneLayout.openPane()

    }
}