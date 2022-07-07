package dev.arj.businesscardcompose.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

fun showBrowser(context: Context, url: String) {
    val profileUrl = Uri.parse(url)
    val intent = Intent(Intent.ACTION_VIEW, profileUrl)
    context.startActivity(intent)
}

fun showLinkedIn(context: Context) {
    val linkedInUrl = "https://id.linkedin.com/in/ri0arjuna"
    try {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedInUrl))
        val linkedInPackage = "com.linkedin.android"

        intent.setPackage(linkedInPackage)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    } catch (e: Exception) {
        showBrowser(context, linkedInUrl)
    }
}