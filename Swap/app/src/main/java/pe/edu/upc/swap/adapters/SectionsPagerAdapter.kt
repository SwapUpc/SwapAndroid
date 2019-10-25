package pe.edu.upc.swap.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitle = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> mFragmentList[0]
            else -> mFragmentList[1]
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> mFragmentTitle[0]
            else -> mFragmentTitle[1]
        }
    }

    fun addFragment(fragment: Fragment, title: String){
        mFragmentList.add(fragment)
        mFragmentTitle.add(title)
    }
}
