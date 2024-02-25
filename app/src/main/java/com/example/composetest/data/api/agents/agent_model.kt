package com.example.composetest.data.api.agents
import com.google.gson.annotations.SerializedName
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class AgentsItemModel(
    @SerializedName("displayName")
    val displayName: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("developerName")
    val developerName: String,
    @SerializedName("displayIcon")
    val displayIcon: String,
    @SerializedName("fullPortrait")
    val bustPortrait: String,
    @SerializedName("killFeedPortrait")
    val killFeedPortrait: String,
    @SerializedName("background")
    val background: String,
    @SerializedName("backgroundGradientColors")
    val backgroundGradientColors: List<String>
) : Parcelable





val nullAgentItemModel = AgentsItemModel(
    displayName = "",
    description = "",
    developerName = "",
    displayIcon = "",
    bustPortrait = "",
    killFeedPortrait = "",
    background = "",
    backgroundGradientColors = emptyList()
)



data class AgentsModel(
    val data: List<AgentsItemModel>,
    val status:Int,
)
