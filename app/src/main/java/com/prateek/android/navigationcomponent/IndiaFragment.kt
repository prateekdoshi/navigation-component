package com.prateek.android.navigationcomponent

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_india.*


class IndiaFragment : BaseFragment(), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigatecountry.setOnClickListener(this)
    }

    override fun getResourceLayout(): Int {
        return R.layout.fragment_india
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.navigatecountry -> navigateTo(R.id.action_indiaFragment_to_goaFragment)
        }
    }
}