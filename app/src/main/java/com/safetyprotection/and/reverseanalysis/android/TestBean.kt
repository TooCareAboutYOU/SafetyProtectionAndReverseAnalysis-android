package com.safetyprotection.and.reverseanalysis.android

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author zhangshuai
 * @date 2022/3/9 星期三
 * @email zhangshuai@dushu365.com
 * @description 序列化的使用，配置脚本：kotlin-Parcelize
 */
@Parcelize
data class TestBean(var firstName: String? = null, var lastName: String? = null) : Parcelable{
    var age:Int=0
    var sex:Int=0
    override fun toString(): String {
        return "TestBean(" +
                "firstName=$firstName, " +
                "lastName=$lastName, " +
                "age=$age, " +
                "sex=$sex" +
                ")"
    }

}
