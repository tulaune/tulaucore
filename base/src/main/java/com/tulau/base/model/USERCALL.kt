package com.tulau.base.model

import java.io.Serializable

/**
 * Created by Dragon on 1/31/18.
 */
class USERCALL : Serializable {
    var FO100 = 0L
    var FO100R = 0L
    var FO100S = 0L
    var PM100 = ""
    var FM200 = ""
    var VIDEO = false
    var STATUS: String? = null
    var SDP: String? = null
    var SDPMID: String? = null
    var DATE: String? = null
    var TYPE: String? = null
    var MV102: String? = null
    var sDPMLINEINDEX = 0
    var FRIEND: FRIENDCALL? = null

    constructor() {}
    constructor(FO100: Long, FO100R: Long, FO100S: Long, PM100: String, FM200: String, VIDEO: Boolean, STATUS: String?, SDP: String?, SDPMID: String?, DATE: String?, TYPE: String?, MV102: String?, SDPMLINEINDEX: Int, FRIEND: FRIENDCALL?) {
        this.FO100 = FO100
        this.FO100R = FO100R
        this.FO100S = FO100S
        this.PM100 = PM100
        this.FM200 = FM200
        this.VIDEO = VIDEO
        this.STATUS = STATUS
        this.SDP = SDP
        this.SDPMID = SDPMID
        this.DATE = DATE
        this.TYPE = TYPE
        this.MV102 = MV102
        sDPMLINEINDEX = SDPMLINEINDEX
        this.FRIEND = FRIEND
    }

}