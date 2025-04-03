package com.adika.commons.dialogs

import android.app.Activity
import androidx.appcompat.app.AlertDialog
import com.adika.commons.R
import com.adika.commons.extensions.getAlertDialogBuilder
import com.adika.commons.extensions.launchUpgradeToProIntent
import com.adika.commons.extensions.launchViewIntent
import com.adika.commons.extensions.setupDialogStuff
import kotlinx.android.synthetic.main.dialog_upgrade_to_pro.view.*

class UpgradeToProDialog(val activity: Activity) {

    init {
        val view = activity.layoutInflater.inflate(R.layout.dialog_upgrade_to_pro, null).apply {
            upgrade_to_pro.text = activity.getString(R.string.upgrade_to_pro_long)
        }

        activity.getAlertDialogBuilder()
            .setPositiveButton(R.string.upgrade) { dialog, which -> upgradeApp() }
            .setNeutralButton(R.string.more_info, null)     // do not dismiss the dialog on pressing More Info
            .setNegativeButton(R.string.later, null)
            .apply {
                activity.setupDialogStuff(view, this, R.string.upgrade_to_pro, cancelOnTouchOutside = false) { alertDialog ->
                    alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener {
                        moreInfo()
                    }
                }
            }
    }

    private fun upgradeApp() {
        activity.launchUpgradeToProIntent()
    }

    private fun moreInfo() {
        activity.launchViewIntent("https://hahuet.com/upgrade_to_pro")
    }
}
