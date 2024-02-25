package com.example.composetest.feature.agent_detail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.composetest.R
import com.example.composetest.feature.agents.components.AgentsListItem

@Composable
fun AgentDetailColors(colors:List<String>){
    LazyRow(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
        .fillMaxWidth()) {
        items(colors) { colors ->
            val color = Color(android.graphics.Color.parseColor("#$colors"))
            Box(
                modifier = Modifier
                    .border(
                        width = 0.5.dp,
                        color = colorResource(id = R.color.mainColor03),
                        shape = RoundedCornerShape(40.dp)
                    ).clip(shape = RoundedCornerShape(40.dp))
                    .background(color = color)
                    .size(60.dp)
            )
        }
    }
}