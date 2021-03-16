package com.tulau.base.model

import java.io.Serializable

/**
 * Created by Dragon on 1/31/18.
 */
class FRIENDCALL : Serializable {
    var fO100 = 0
    var aVATAR: String? = null
    var nV106: String? = null

    constructor() {}
    constructor(FO100: Int, AVATAR: String?, NV106: String?) {
        fO100 = FO100
        aVATAR = AVATAR
        nV106 = NV106
    }

}