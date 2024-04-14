import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pampanitikan.R
import com.example.pampanitikan.ui.home.Datas

class HomeViewModel2 : ViewModel() {

    private val _dataList = MutableLiveData<List<Datas>>()
    val dataList: LiveData<List<Datas>> = _dataList

    init {
        // Initialize your dataList here
        val initialList = listOf(

            Datas(R.drawable.ic_menu_camera, R.string.kabanata_1, R.string.kabanata_1_content),
            Datas(R.drawable.ic_menu_camera, R.string.kabanata_2, R.string.kabanata_2_content),
            Datas(R.drawable.ic_menu_camera, R.string.kabanata_3, R.string.kabanata_3_content),
            Datas(R.drawable.ic_menu_camera, R.string.kabanata_4, R.string.kabanata_4_content),
            Datas(R.drawable.ic_menu_camera, R.string.kabanata_5, R.string.kabanata_5_content),
            Datas(R.drawable.ic_menu_camera, R.string.kabanata_6, R.string.kabanata_6_content),
            Datas(R.drawable.ic_menu_camera, R.string.kabanata_7, R.string.kabanata_7_content),
            Datas(R.drawable.ic_menu_camera, R.string.kabanata_8, R.string.kabanata_8_content),
            Datas(R.drawable.ic_menu_camera, R.string.KABANATA_9, R.string.KABANATA_9_content),
            Datas(R.drawable.ic_menu_camera, R.string.KABANATA_10, R.string.KABANATA_10_content),
           // Datas(R.drawable.ic_menu_camera, R.string.kabanata_2, R.string.kabanata_2_content),


            // Add more items as needed
        )
        _dataList.value = initialList
    }
}
