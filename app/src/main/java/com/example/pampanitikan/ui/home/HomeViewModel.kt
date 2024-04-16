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
            Datas(R.drawable.talong, R.string.alamat_ng_talong, R.string.alamat_ng_talong_content),
            Datas(R.drawable.asin, R.string.alamat_ng_asin, R.string.alamat_ng_asin_content),
            Datas(R.drawable.kapre, R.string.alamat_ng_kapre, R.string.alamat_ng_kapre_Content),
            Datas(R.drawable.kawayan, R.string.alamat_ng_kawayan, R.string.alamat_ng_kawayan_Content),
            Datas(R.drawable.magayon, R.string.alamat_ni_daragang_magayon, R.string.alamat_ni_daragang_magayon_Content),
         //   Datas(R.drawable.ic_menu_camera, R.string.ang_pipit, R.string.ang_pipit_content),
            Datas(R.drawable.jaguar, R.string.jaguar_story_title, R.string.jaguar_story_content),
         //   Datas(R.drawable.ic_menu_camera, R.string.moses_moses, R.string.moses_moses_content),
            Datas(R.drawable.plop, R.string.plop, R.string.plop_content),
            Datas(R.drawable.sapula, R.string.sapula_saputi, R.string.sapula_saputi_content),
         //   Datas(R.drawable.ic_menu_camera, R.string.sinag, R.string.sinag_content),
            Datas(R.drawable.kalupi, R.string.kalupi, R.string.kalupi_content),
            Datas(R.drawable.bantugan, R.string.bantugan, R.string.bantugan_content),
            Datas(R.drawable.epiko, R.string.epiko, R.string.epiko_content),
            Datas(R.drawable.biag, R.string.biag_ni_lam_ang, R.string.biag_ni_lam_ang_content),
            Datas(R.drawable.ibalon, R.string.ibalon, R.string.ibalon_content),
            Datas(R.drawable.indrapatra, R.string.indarapatra, R.string.indarapatra_content),
            Datas(R.drawable.labawdonggon, R.string.labaw_donggon, R.string.labaw_donggon_content),
            Datas(R.drawable.mabuti, R.string.kwento_ni_mabuti, R.string.kwento_ni_mabuti_content),
            Datas(R.drawable.paglalayag, R.string.paglalayag, R.string.paglalayag_content),
     //       Datas(R.drawable.ic_menu_camera, R.string.panata_ni_pilar, R.string.panata_ni_pilar_content),
            Datas(R.drawable.langgam, R.string.langgam_at_tipaklong, R.string.langgam_at_tipaklong_content),
            Datas(R.drawable.pinkaw, R.string.si_pinkaw, R.string.si_pinkaw_content),
            Datas(R.drawable.usapuwak, R.string.pusa_uwak, R.string.pusa_uwak_content),
            Datas(R.drawable.kampanilya, R.string.ang_kampanilya, R.string.ang_kampanilya_content),
            Datas(R.drawable.biik, R.string.ang_tatlong_biik, R.string.ang_tatlong_biik_content),
            Datas(R.drawable.kuneho, R.string.kuneho, R.string.kuneho_content),
            Datas(R.drawable.amado, R.string.amado, R.string.amado_content),
          //  Datas(R.drawable.ic_menu_camera, R.string.rizal, R.string.rizal_content),
       //     Datas(R.drawable.ic_menu_camera, R.string.balagtas, R.string.balagtas_content),
         //   Datas(R.drawable.ic_menu_camera, R.string.santos, R.string.santos_content),
          //  Datas(R.drawable.ic_menu_camera, R.string.del_pilar, R.string.del_pilar_content),
            Datas(R.drawable.reyes, R.string.reyes, R.string.reyes_content),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),
//            Datas(R.drawable.ic_menu_camera, R.string., R.string.),


            // Add more items as needed
        )
        _dataList.value = initialList
    }
}
