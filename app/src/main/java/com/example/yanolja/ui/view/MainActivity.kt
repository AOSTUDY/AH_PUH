package com.example.yanolja.ui.view

import com.example.yanolja.R
import com.example.yanolja.databinding.ActivityMainBinding
import com.example.yanolja.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val homeFragment: HomeFragment by lazy { HomeFragment() }

    override fun initView() {
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        binding.btNaviMain.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.page_home -> navigateHome()
            }
            true
        }
    }

    private fun navigateHome() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container_main, homeFragment)
        transaction.commit()
        binding.btNaviMain.menu.getItem(0).isChecked = true
    }
}