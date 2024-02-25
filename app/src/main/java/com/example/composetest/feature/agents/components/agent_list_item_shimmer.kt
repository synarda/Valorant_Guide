package com.example.composetest.feature.agents.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import shimmerLoadingAnimation

@Composable
fun AgentListItemShimmer(){
    Box(modifier = Modifier.padding(all=16.dp)){
        Box(modifier = Modifier.fillMaxWidth().height(85.dp).clip(shape = RoundedCornerShape(20.dp)).shimmerLoadingAnimation()) {
        }
    }
}

