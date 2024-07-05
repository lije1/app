package com.miad.commons.extensions

import android.content.Context
import com.miad.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
