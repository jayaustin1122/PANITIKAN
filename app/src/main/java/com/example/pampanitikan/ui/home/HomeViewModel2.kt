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
            Datas(R.drawable.talong, R.string.alamat_ng_talong, R.string.alamat_ng_talong_content),
            Datas(R.drawable.asin, R.string.alamat_ng_asin, R.string.alamat_ng_asin_content),
            Datas(R.drawable.kapre, R.string.alamat_ng_kapre, R.string.alamat_ng_kapre_Content),
            Datas(R.drawable.kawayan, R.string.alamat_ng_kawayan, R.string.alamat_ng_kawayan_Content),
            Datas(R.drawable.magayon, R.string.alamat_ni_daragang_magayon, R.string.alamat_ni_daragang_magayon_Content),
         //   Datas(R.drawable.ic_menu_camera, R.string.ang_pipit, R.string.ang_pipit_content),
            Datas(R.drawable.jaguar, R.string.jaguar_story_title, R.string.jaguar_story_content),
         //   Datas(R.drawable.ic_menu_camera, R.string.moses_moses, R.string.moses_moses_content),
            Datas(R.drawable.ic_menu_camera, R.string.plop, R.string.plop_content),
            Datas(R.drawable.ic_menu_camera, R.string.sapula_saputi, R.string.sapula_saputi_content),
            Datas(R.drawable.ic_menu_camera, R.string.sinag, R.string.sinag_content),
            Datas(R.drawable.ic_menu_camera, R.string.kalupi, R.string.kalupi_content),
            Datas(R.drawable.ic_menu_camera, R.string.bantugan, R.string.bantugan_content),
            Datas(R.drawable.ic_menu_camera, R.string.epiko, R.string.epiko_content),
            Datas(R.drawable.ic_menu_camera, R.string.biag_ni_lam_ang, R.string.biag_ni_lam_ang_content),
            Datas(R.drawable.ic_menu_camera, R.string.ibalon, R.string.ibalon_content),
            Datas(R.drawable.ic_menu_camera, R.string.indarapatra, R.string.indarapatra_content),
            Datas(R.drawable.ic_menu_camera, R.string.labaw_donggon, R.string.labaw_donggon_content),
            Datas(R.drawable.ic_menu_camera, R.string.kwento_ni_mabuti, R.string.kwento_ni_mabuti_content),
            Datas(R.drawable.ic_menu_camera, R.string.paglalayag, R.string.paglalayag_content),
     //       Datas(R.drawable.ic_menu_camera, R.string.panata_ni_pilar, R.string.panata_ni_pilar_content),
            Datas(R.drawable.ic_menu_camera, R.string.langgam_at_tipaklong, R.string.langgam_at_tipaklong_content),
            Datas(R.drawable.ic_menu_camera, R.string.si_pinkaw, R.string.si_pinkaw_content),
            Datas(R.drawable.ic_menu_camera, R.string.pusa_uwak, R.string.pusa_uwak_content),
            Datas(R.drawable.ic_menu_camera, R.string.ang_kampanilya, R.string.ang_kampanilya_content),
            Datas(R.drawable.ic_menu_camera, R.string.ang_tatlong_biik, R.string.ang_tatlong_biik_content),
            Datas(R.drawable.ic_menu_camera, R.string.kuneho, R.string.kuneho_content),
            Datas(R.drawable.ic_menu_camera, R.string.amado, R.string.amado_content),
          //  Datas(R.drawable.ic_menu_camera, R.string.rizal, R.string.rizal_content),
       //     Datas(R.drawable.ic_menu_camera, R.string.balagtas, R.string.balagtas_content),
         //   Datas(R.drawable.ic_menu_camera, R.string.santos, R.string.santos_content),
          //  Datas(R.drawable.ic_menu_camera, R.string.del_pilar, R.string.del_pilar_content),
            Datas(R.drawable.ic_menu_camera, R.string.reyes, R.string.reyes_content),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),


            // Add more items as needed
        )
        _dataList.value = initialList
    }
}
