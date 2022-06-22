package com.github.kr328.clash.design

import android.content.Context
import android.view.View
import com.github.kr328.clash.design.databinding.DesignSubscriptionBinding
import com.github.kr328.clash.design.util.*
import com.github.kr328.clash.design.util.layoutInflater
import com.github.kr328.clash.design.util.root

class SubscriptionDesign(context: Context) : Design<ApkBrokenDesign.Request>(context) {
    private val binding = DesignSubscriptionBinding
        .inflate(context.layoutInflater, context.root, false)

    override val root: View
        get() = binding.root

    init {
        binding.self = this

        binding.activityBarLayout.applyFrom(context)

    }
}