package com.example.dviveapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class Splash_Adapter(supportFragmentManager: FragmentManager?) :
    FragmentPagerAdapter(supportFragmentManager!!) {
    private val fragments: MutableList<Fragment> = ArrayList()
    override fun getItem(i: Int): Fragment {
        return fragments[i]
    }

    fun add(fragment: Fragment, title: String?) {
        fragments.add(fragment)
    }

    override fun getCount(): Int {
        return fragments.size
    }
}