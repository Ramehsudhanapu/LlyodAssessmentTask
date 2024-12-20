package com.ramesh.assessment.navigation.navdrawer.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.ramesh.core.R
import com.ramesh.core.util.Dimens


@Composable
fun NavDrawerHeader(
    modifier: Modifier = Modifier,
) {
    Row {
        Image(
            modifier = modifier
                .size(Dimens.dp60)
                .shadow(elevation = Dimens.dp1, shape = CircleShape)
                .clip(shape = CircleShape),
            painter = painterResource(id = com.ramesh.core.R.drawable.ic_launcher),
            contentDescription = stringResource(id = R.string.rivaldy),
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = modifier.width(Dimens.dp16))
        Column(modifier = modifier.align(Alignment.CenterVertically)) {
            Text(
                text = stringResource(id = R.string.rivaldy),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = Dimens.sp18,
                ),
            )
            Spacer(modifier = modifier.height(Dimens.dp3))
            Text(
                text = stringResource(id = R.string.profile_web),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.White.copy(alpha = 0.5f),
                    fontSize = Dimens.sp14,
                ),
            )
        }
    }
}