package com.tulau.base.Inf

import com.tulau.base.views.MySwitchButton

interface MyOnItemSwitchCheckInf {
    fun onSwitchCheck(view: MySwitchButton?, data: Any?, position: Int, isChecked: Boolean)
}