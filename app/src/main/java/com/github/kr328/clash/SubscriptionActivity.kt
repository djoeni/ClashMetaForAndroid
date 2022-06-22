package com.github.kr328.clash

import com.github.kr328.clash.design.SubscriptionDesign
import kotlinx.coroutines.isActive

class SubscriptionActivity : BaseActivity<SubscriptionDesign>() {
    override suspend fun main() {
        val design = SubscriptionDesign(this)

        setContentDesign(design)

        while (isActive) {
            events.receive()
        }
    }
}