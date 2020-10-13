package com.prateek.android.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.fragment_country.*


class CountryFragment : BaseFragment(), View.OnClickListener {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        india.setOnClickListener(this)
        canada.setOnClickListener(this)
        USA.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.india -> navigateTo(R.id.action_countryFragment_to_indiaFragment)
            R.id.canada -> navigateTo(R.id.action_countryFragment_to_canadaFragment,bundleOf(
                "age" to 25,
                "name" to "Michael",
                "skill" to null
            ))
            R.id.USA -> {
            }
        }
    }

    override fun getResourceLayout(): Int {
        return R.layout.fragment_country
    }
}