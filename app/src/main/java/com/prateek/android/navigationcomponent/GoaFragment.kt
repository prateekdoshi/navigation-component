package com.prateek.android.navigationcomponent

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_goa.*


class GoaFragment : BaseFragment(),View.OnClickListener{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigatecountry.setOnClickListener(this)
    }

    override fun getResourceLayout(): Int {
        return R.layout.fragment_goa
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.navigatecountry -> navigateTo(R.id.action_goaFragment_to_countryFragment)
        }
    }
}