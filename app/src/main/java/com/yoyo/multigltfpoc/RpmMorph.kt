package com.yoyo.multigltfpoc

object RpmMorph {

    fun closeBothEye(size: Int): FloatArray? {
        // 69 is the index of eyesClosed in rpm
        if (size != 0) {
            val motion = FloatArray(size)
            motion[69] = 1F
            return motion
        }
        return null
    }

    fun openBothEye(size: Int): FloatArray? {
        // 69 is the index of eyesClosed in rpm- 1
        if (size != 0) {
            val motion = FloatArray(size)
            motion[69] = 0F
            return motion
        }
        return null
    }

    fun smile(value: Float): FloatArray {
        // 69 is the index of eyesClosed in rpm- 1
        val smileIndex = 16
        val motion = FloatArray(smileIndex + 1)
        motion[smileIndex] = value
        return motion
    }

    fun smileWithBlink(valueForSmile: Float, eyeBlinkValue: Float): FloatArray {
        // 69 is the index of eyesClosed in rpm- 1
        val smileIndex = 16
        val blinkIndex = 69
        val motion = FloatArray(blinkIndex + 1)
        motion[smileIndex] = valueForSmile
        motion[blinkIndex] = eyeBlinkValue
        return motion
    }



}

object MorphRpm {
    const val Wolf3D_Outfit_Bottom = "Wolf3D_Outfit_Bottom"
    const val Wolf3D_Outfit_Footwear = "Wolf3D_Outfit_Footwear"
    const val Wolf3D_Body = "Wolf3D_Body"
    const val Wolf3D_Outfit_Top = "Wolf3D_Outfit_Top"
    const val Wolf3D_Teeth = "Wolf3D_Teeth"
    const val Wolf3D_Head = "Wolf3D_Head"
    const val Wolf3D_Avatar = "Wolf3D_Avatar"
    const val EyeRight = "EyeRight"
    const val EyeLeft = "EyeLeft"


}


