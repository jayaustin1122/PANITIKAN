import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pampanitikan.R
import com.example.pampanitikan.ui.home.Datas

class HomeViewModel : ViewModel() {

    private val _dataList = MutableLiveData<List<Datas>>()
    val dataList: LiveData<List<Datas>> = _dataList

    init {
        // Initialize your dataList here
        val initialList = listOf(
            Datas(R.drawable.ic_menu_camera, "Title 1", "Content 1"),
            Datas(R.drawable.ic_menu_gallery, "Title 2", "Content 2")
            // Add more items as needed
        )
        _dataList.value = initialList
    }
}
