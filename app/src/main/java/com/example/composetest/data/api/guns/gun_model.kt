package com.example.composetest.data.api.guns

import com.example.composetest.data.api.agents.AgentsItemModel
import com.google.gson.annotations.SerializedName


data class GunModel(
    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("displayIcon")
    val displayIcon: String,

    @SerializedName("category")
    val category: String,

    @SerializedName("GunStats")
    val weaponStats: GunStats
)

data class GunStats(
    @SerializedName("fireRate")
    val fireRate: Int,

    @SerializedName("magazineSize")
    val magazineSize: Int,

    @SerializedName("reloadTimeSeconds")
    val reloadTimeSeconds: Int,
)

data class GunsModel(
    val data: List<GunModel>,
    val status:Int,
)