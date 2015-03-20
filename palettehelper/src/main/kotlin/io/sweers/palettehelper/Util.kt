package io.sweers.palettehelper

import android.content.Context
import android.widget.Toast

/**
 * Converts a given color to a #xxxxxx string.
 */
public fun rgbToHex(color: Int): String = "#${Integer.toHexString(color)}"

/**
 * Copies a given text to the clipboard
 */
public fun copyToClipboard(context: Context, text: String) {
    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
    val clip = android.content.ClipData.newPlainText("Copied Text", text)
    clipboard.setPrimaryClip(clip)
}

/**
 * Copies given text to the clipboard and notifies via Toast
 */
public fun copyAndNotify(context: Context, text: String) {
    copyToClipboard(context, text)
    Toast.makeText(context, "Copied ${text} to clipboard", Toast.LENGTH_SHORT).show();
}