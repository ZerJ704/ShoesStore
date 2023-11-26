package com.example.lunchtray.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lunchtray.R

@Composable
fun StartOrderScreen( //TODO 8: Fungsi layar utama untuk menampilkan gambar dan tombol start order
    onStartOrderButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.main),
            contentDescription = null,
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
        Button(
            onClick = onStartOrderButtonClicked,
            Modifier.widthIn(min = 250.dp)
        ) {
            Text(stringResource(R.string.start_order))
        }
    }
}

@Preview
@Composable
fun StartOrderPreview(){
    StartOrderScreen(
        onStartOrderButtonClicked = {},
        modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_medium))
            .fillMaxSize()
    )
}
