@file:Suppress("MatchingDeclarationName")

package org.fossify.keyboard.extensions

import android.content.Context
import android.graphics.Color
import org.fossify.commons.models.RadioItem
import org.fossify.keyboard.R
import org.fossify.keyboard.helpers.THEME_HONEY_3D
import org.fossify.keyboard.helpers.THEME_IOS_DARK
import org.fossify.keyboard.helpers.THEME_NEON_CYBER
import org.fossify.keyboard.helpers.THEME_PIANO_3D
import org.fossify.keyboard.helpers.THEME_RETRO_1995

data class KeyboardThemeData(
    val id: Int,
    val nameRes: Int,
    val keyboardBgColor: Int,
    val toolbarBgColor: Int,
    val toolbarIconColor: Int,
    // Normal Keys
    val normalKeyTopColor: Int,
    val normalKeyBottomColor: Int,
    val normalKeyHighlightColor: Int,
    val normalKeyShadowColor: Int,
    val normalKeyPressedColor: Int,
    val normalTextColor: Int,
    val normalTextPressedColor: Int,
    val subTextColor: Int,
    // Accent Keys (Shift, 123, AR/EN)
    val accentKeyTopColor: Int,
    val accentKeyBottomColor: Int,
    val accentKeyHighlightColor: Int,
    val accentKeyShadowColor: Int,
    val accentKeyPressedColor: Int,
    val accentTextColor: Int,
    // Enter Key
    val enterKeyTopColor: Int,
    val enterKeyBottomColor: Int,
    val enterKeyHighlightColor: Int,
    val enterKeyShadowColor: Int,
    val enterKeyPressedColor: Int,
    val enterIconColor: Int,
    // Delete Key
    val deleteKeyTopColor: Int,
    val deleteKeyBottomColor: Int,
    val deleteKeyHighlightColor: Int,
    val deleteKeyShadowColor: Int,
    val deleteKeyPressedColor: Int,
    val deleteIconColor: Int,
    // Space Key
    val spaceKeyTopColor: Int,
    val spaceKeyBottomColor: Int,
    // Dimensions
    val cornerRadiusDp: Float,
    val elevationDp: Float
)

val CYBER_NEON_THEME = KeyboardThemeData(
    id = THEME_NEON_CYBER,
    nameRes = R.string.theme_cyber_neon,
    keyboardBgColor = Color.parseColor("#060B14"),
    toolbarBgColor = Color.parseColor("#0A1424"),
    toolbarIconColor = Color.parseColor("#00E5FF"),
    normalKeyTopColor = Color.parseColor("#223B5E"),
    normalKeyBottomColor = Color.parseColor("#14253D"),
    normalKeyHighlightColor = Color.parseColor("#4477A8"),
    normalKeyShadowColor = Color.parseColor("#070E1A"),
    normalKeyPressedColor = Color.parseColor("#0E4F7D"),
    normalTextColor = Color.parseColor("#FFFFFF"),
    normalTextPressedColor = Color.parseColor("#00E5FF"),
    subTextColor = Color.parseColor("#00E5FF"),
    accentKeyTopColor = Color.parseColor("#1B3354"),
    accentKeyBottomColor = Color.parseColor("#102035"),
    accentKeyHighlightColor = Color.parseColor("#00E5FF"),
    accentKeyShadowColor = Color.parseColor("#060C14"),
    accentKeyPressedColor = Color.parseColor("#18426B"),
    accentTextColor = Color.parseColor("#00E5FF"),
    enterKeyTopColor = Color.parseColor("#00A3E0"),
    enterKeyBottomColor = Color.parseColor("#006B99"),
    enterKeyHighlightColor = Color.parseColor("#40E6FF"),
    enterKeyShadowColor = Color.parseColor("#003C59"),
    enterKeyPressedColor = Color.parseColor("#00BFFF"),
    enterIconColor = Color.parseColor("#FFFFFF"),
    deleteKeyTopColor = Color.parseColor("#1B3354"),
    deleteKeyBottomColor = Color.parseColor("#102035"),
    deleteKeyHighlightColor = Color.parseColor("#00E5FF"),
    deleteKeyShadowColor = Color.parseColor("#060C14"),
    deleteKeyPressedColor = Color.parseColor("#18426B"),
    deleteIconColor = Color.parseColor("#00E5FF"),
    spaceKeyTopColor = Color.parseColor("#1C3250"),
    spaceKeyBottomColor = Color.parseColor("#122237"),
    cornerRadiusDp = 9f,
    elevationDp = 4.2f
)

val HONEY_3D_THEME = KeyboardThemeData(
    id = THEME_HONEY_3D,
    nameRes = R.string.theme_honey_3d,
    keyboardBgColor = Color.parseColor("#130B03"),
    toolbarBgColor = Color.parseColor("#201407"),
    toolbarIconColor = Color.parseColor("#FFC107"),
    normalKeyTopColor = Color.parseColor("#4E3117"),
    normalKeyBottomColor = Color.parseColor("#321E0D"),
    normalKeyHighlightColor = Color.parseColor("#8C5824"),
    normalKeyShadowColor = Color.parseColor("#120A03"),
    normalKeyPressedColor = Color.parseColor("#5F3A1B"),
    normalTextColor = Color.parseColor("#FFF1C2"),
    normalTextPressedColor = Color.parseColor("#FFE082"),
    subTextColor = Color.parseColor("#FFA000"),
    accentKeyTopColor = Color.parseColor("#3B230E"),
    accentKeyBottomColor = Color.parseColor("#261507"),
    accentKeyHighlightColor = Color.parseColor("#FFC107"),
    accentKeyShadowColor = Color.parseColor("#0F0802"),
    accentKeyPressedColor = Color.parseColor("#4F3014"),
    accentTextColor = Color.parseColor("#FFD54F"),
    enterKeyTopColor = Color.parseColor("#D97706"),
    enterKeyBottomColor = Color.parseColor("#92400E"),
    enterKeyHighlightColor = Color.parseColor("#FBBF24"),
    enterKeyShadowColor = Color.parseColor("#451A03"),
    enterKeyPressedColor = Color.parseColor("#F59E0B"),
    enterIconColor = Color.parseColor("#FFFFFF"),
    deleteKeyTopColor = Color.parseColor("#3B230E"),
    deleteKeyBottomColor = Color.parseColor("#261507"),
    deleteKeyHighlightColor = Color.parseColor("#FFC107"),
    deleteKeyShadowColor = Color.parseColor("#0F0802"),
    deleteKeyPressedColor = Color.parseColor("#4F3014"),
    deleteIconColor = Color.parseColor("#FFC107"),
    spaceKeyTopColor = Color.parseColor("#452A12"),
    spaceKeyBottomColor = Color.parseColor("#2E1B0A"),
    cornerRadiusDp = 9f,
    elevationDp = 4.5f
)

val RETRO_1995_THEME = KeyboardThemeData(
    id = THEME_RETRO_1995,
    nameRes = R.string.theme_retro_1995,
    keyboardBgColor = Color.parseColor("#17191C"),
    toolbarBgColor = Color.parseColor("#22252A"),
    toolbarIconColor = Color.parseColor("#E2E8F0"),
    normalKeyTopColor = Color.parseColor("#545B67"),
    normalKeyBottomColor = Color.parseColor("#3B4049"),
    normalKeyHighlightColor = Color.parseColor("#7D8697"),
    normalKeyShadowColor = Color.parseColor("#111315"),
    normalKeyPressedColor = Color.parseColor("#2F333B"),
    normalTextColor = Color.parseColor("#FFFFFF"),
    normalTextPressedColor = Color.parseColor("#CBD5E1"),
    subTextColor = Color.parseColor("#94A3B8"),
    accentKeyTopColor = Color.parseColor("#444A55"),
    accentKeyBottomColor = Color.parseColor("#2F333A"),
    accentKeyHighlightColor = Color.parseColor("#64748B"),
    accentKeyShadowColor = Color.parseColor("#0E1012"),
    accentKeyPressedColor = Color.parseColor("#272A30"),
    accentTextColor = Color.parseColor("#E2E8F0"),
    enterKeyTopColor = Color.parseColor("#2563EB"),
    enterKeyBottomColor = Color.parseColor("#1D4ED8"),
    enterKeyHighlightColor = Color.parseColor("#60A5FA"),
    enterKeyShadowColor = Color.parseColor("#1E3A8A"),
    enterKeyPressedColor = Color.parseColor("#3B82F6"),
    enterIconColor = Color.parseColor("#FFFFFF"),
    deleteKeyTopColor = Color.parseColor("#444A55"),
    deleteKeyBottomColor = Color.parseColor("#2F333A"),
    deleteKeyHighlightColor = Color.parseColor("#64748B"),
    deleteKeyShadowColor = Color.parseColor("#0E1012"),
    deleteKeyPressedColor = Color.parseColor("#272A30"),
    deleteIconColor = Color.parseColor("#FFFFFF"),
    spaceKeyTopColor = Color.parseColor("#4E5460"),
    spaceKeyBottomColor = Color.parseColor("#363B43"),
    cornerRadiusDp = 6f,
    elevationDp = 5f
)

val IOS_DARK_THEME = KeyboardThemeData(
    id = THEME_IOS_DARK,
    nameRes = R.string.theme_ios_dark,
    keyboardBgColor = Color.parseColor("#0E0E10"),
    toolbarBgColor = Color.parseColor("#151518"),
    toolbarIconColor = Color.parseColor("#0A84FF"),
    normalKeyTopColor = Color.parseColor("#424247"),
    normalKeyBottomColor = Color.parseColor("#2E2E33"),
    normalKeyHighlightColor = Color.parseColor("#62626B"),
    normalKeyShadowColor = Color.parseColor("#0A0A0C"),
    normalKeyPressedColor = Color.parseColor("#56565C"),
    normalTextColor = Color.parseColor("#FFFFFF"),
    normalTextPressedColor = Color.parseColor("#D1D1D6"),
    subTextColor = Color.parseColor("#98989D"),
    accentKeyTopColor = Color.parseColor("#2A2A2E"),
    accentKeyBottomColor = Color.parseColor("#1C1C20"),
    accentKeyHighlightColor = Color.parseColor("#48484E"),
    accentKeyShadowColor = Color.parseColor("#08080A"),
    accentKeyPressedColor = Color.parseColor("#3A3A40"),
    accentTextColor = Color.parseColor("#0A84FF"),
    enterKeyTopColor = Color.parseColor("#007AFF"),
    enterKeyBottomColor = Color.parseColor("#0056B3"),
    enterKeyHighlightColor = Color.parseColor("#54A6FF"),
    enterKeyShadowColor = Color.parseColor("#003870"),
    enterKeyPressedColor = Color.parseColor("#0A84FF"),
    enterIconColor = Color.parseColor("#FFFFFF"),
    deleteKeyTopColor = Color.parseColor("#2A2A2E"),
    deleteKeyBottomColor = Color.parseColor("#1C1C20"),
    deleteKeyHighlightColor = Color.parseColor("#48484E"),
    deleteKeyShadowColor = Color.parseColor("#08080A"),
    deleteKeyPressedColor = Color.parseColor("#3A3A40"),
    deleteIconColor = Color.parseColor("#D1D1D6"),
    spaceKeyTopColor = Color.parseColor("#3E3E43"),
    spaceKeyBottomColor = Color.parseColor("#2B2B2F"),
    cornerRadiusDp = 8f,
    elevationDp = 4f
)

val PIANO_3D_THEME = KeyboardThemeData(
    id = THEME_PIANO_3D,
    nameRes = R.string.theme_piano_3d,
    keyboardBgColor = Color.parseColor("#08080B"),
    toolbarBgColor = Color.parseColor("#111115"),
    toolbarIconColor = Color.parseColor("#F5E6CC"),
    normalKeyTopColor = Color.parseColor("#484136"),
    normalKeyBottomColor = Color.parseColor("#2F2A22"),
    normalKeyHighlightColor = Color.parseColor("#706453"),
    normalKeyShadowColor = Color.parseColor("#0B0907"),
    normalKeyPressedColor = Color.parseColor("#5C5345"),
    normalTextColor = Color.parseColor("#FFF8EC"),
    normalTextPressedColor = Color.parseColor("#F5E6CC"),
    subTextColor = Color.parseColor("#D4AF37"),
    accentKeyTopColor = Color.parseColor("#24242C"),
    accentKeyBottomColor = Color.parseColor("#17171C"),
    accentKeyHighlightColor = Color.parseColor("#444452"),
    accentKeyShadowColor = Color.parseColor("#050507"),
    accentKeyPressedColor = Color.parseColor("#353540"),
    accentTextColor = Color.parseColor("#F5E6CC"),
    enterKeyTopColor = Color.parseColor("#B45309"),
    enterKeyBottomColor = Color.parseColor("#78350F"),
    enterKeyHighlightColor = Color.parseColor("#F59E0B"),
    enterKeyShadowColor = Color.parseColor("#3D1C05"),
    enterKeyPressedColor = Color.parseColor("#D97706"),
    enterIconColor = Color.parseColor("#FFFFFF"),
    deleteKeyTopColor = Color.parseColor("#24242C"),
    deleteKeyBottomColor = Color.parseColor("#17171C"),
    deleteKeyHighlightColor = Color.parseColor("#444452"),
    deleteKeyShadowColor = Color.parseColor("#050507"),
    deleteKeyPressedColor = Color.parseColor("#353540"),
    deleteIconColor = Color.parseColor("#F5E6CC"),
    spaceKeyTopColor = Color.parseColor("#423B31"),
    spaceKeyBottomColor = Color.parseColor("#2B261E"),
    cornerRadiusDp = 8f,
    elevationDp = 4.5f
)

fun Context.getCurrentKeyboardTheme(): KeyboardThemeData {
    return when (config.keyboardTheme) {
        THEME_HONEY_3D -> HONEY_3D_THEME
        THEME_RETRO_1995 -> RETRO_1995_THEME
        THEME_IOS_DARK -> IOS_DARK_THEME
        THEME_PIANO_3D -> PIANO_3D_THEME
        else -> CYBER_NEON_THEME
    }
}

fun Context.getKeyboardBackgroundColor(): Int {
    return getCurrentKeyboardTheme().keyboardBgColor
}

fun Context.getStrokeColor(): Int {
    return getCurrentKeyboardTheme().normalKeyHighlightColor
}

fun Context.getKeyboardThemesRadioItems(): ArrayList<RadioItem> {
    return arrayListOf(
        RadioItem(THEME_NEON_CYBER, getString(R.string.theme_cyber_neon)),
        RadioItem(THEME_HONEY_3D, getString(R.string.theme_honey_3d)),
        RadioItem(THEME_RETRO_1995, getString(R.string.theme_retro_1995)),
        RadioItem(THEME_IOS_DARK, getString(R.string.theme_ios_dark)),
        RadioItem(THEME_PIANO_3D, getString(R.string.theme_piano_3d))
    )
}

fun Context.getKeyboardThemeName(themeId: Int): String {
    return when (themeId) {
        THEME_HONEY_3D -> getString(R.string.theme_honey_3d)
        THEME_RETRO_1995 -> getString(R.string.theme_retro_1995)
        THEME_IOS_DARK -> getString(R.string.theme_ios_dark)
        THEME_PIANO_3D -> getString(R.string.theme_piano_3d)
        else -> getString(R.string.theme_cyber_neon)
    }
}
