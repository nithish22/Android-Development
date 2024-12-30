package com.example.netflixuiclone
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting(){

    val list = mutableListOf<Employees>()
    list.add(Employees(R.drawable.ic_launcher_foreground,"Nithish", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Vamsi", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Sathish", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Vasu", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Kalyan", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Nithish", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Nithish", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Nithish", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Vamsi", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Sathish", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Vasu", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Vamsi", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Nithish", "Android Developer"))
    list.add(Employees(R.drawable.ic_launcher_foreground,"Nithish", "Android Developer"))
    

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        LazyColumn(){
            itemsIndexed(list){
                    index, item -> courseModelItemUI(name = item.name, role = item.role)
            }

        }
    }

}



@Composable
fun courseModelItemUI(
    name: String,
    role: String
) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .background(Color.Blue)) {

        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image",
            modifier = Modifier
                .width(60.dp)
                .wrapContentHeight())

        Column() {
            Text(text = name,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.offset(x=10.dp),
                fontSize = 25.sp)
            Text(text = role,
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp))
        }

    }

}

data class Employees(
    val image : Int,
    val name : String,
    val role : String
)