package vijay.natarajan.sampletmdb.view

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

//@Composable
//private fun <T : Any> MovieSection(
//    items: List<T>,
//    @StringRes headerResId: Int,
//    onSeeAllClicked: (() -> Unit)? = null,
//    itemContent: @Composable (T, Int) -> Unit,
//    modifier: Modifier,
//) {
//    Column(modifier = modifier.fillMaxWidth()) {
//        SectionHeader(headerResId, items.size, onSeeAllClicked)
//        LazyRow(
//            modifier = Modifier.testTag(LocalContext.current.getString(headerResId)),
//            contentPadding = PaddingValues(16.dp),
//        ) {
//            items(
//                count = items.size,
//                itemContent = { index ->
//                    itemContent(items[index], index)
//                    Spacer(modifier = Modifier.width(16.dp))
//                },
//            )
//        }
//    }
//}