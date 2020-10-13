package com.prateek.android.navigationcomponent

import android.os.Bundle
import android.view.View


class CanadaFragment : BaseFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.also { bundle ->
            print("Name :  ${bundle.getString("name")}")
            print("Age :  ${bundle.getInt("age")}")
        }

    }

    override fun getResourceLayout(): Int {
        return R.layout.fragment_canada
    }
}