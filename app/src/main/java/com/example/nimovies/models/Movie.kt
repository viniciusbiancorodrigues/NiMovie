package com.example.nimovies.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("tittle")
    val tittle : String ?,

     @SerializedName("poster_path")
     val poster : String?,

    @SerializedName("release_date")
    val release : String?,

) : Parcelable{
    constructor() : this("", "", "", "")
}