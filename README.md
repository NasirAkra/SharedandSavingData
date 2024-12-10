# Saving Data in Android

This guide explains how to save data in Android using **SharedPreferences** and other common approaches.

---

## 1. SharedPreferences

SharedPreferences is a lightweight mechanism to store small amounts of key-value pairs. It's typically used for storing app settings or user preferences.

### How to Use SharedPreferences

#### Writing Data:

```kotlin
val sharedPref = getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)
val editor = sharedPref.edit()
editor.putString("key_name", "value")
editor.putInt("key_age", 25)
editor.apply() // or .commit()
