import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pampanitikan.R
import com.example.pampanitikan.ui.home.Datas
import com.example.pampanitikan.ui.home.DetailFragment
import com.example.pampanitikan.ui.home.Myadapter

class HomeFragment : Fragment(), Myadapter.OnItemClickListener {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = root.findViewById(R.id.cropRecycler)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = Myadapter(requireContext())
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(this)
        homeViewModel.dataList.observe(viewLifecycleOwner, Observer {
            adapter.setDataList(it)
        })

        return root
    }
    override fun onItemClick(data: Datas) {
        // Navigate to new fragment and pass data
        val bundle = Bundle().apply {
            putInt("imageResId", data.imageResId)
            putString("title", data.title)
            putString("content", data.content)
        }
        val detailFragment = DetailFragment()
        detailFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_content_main, detailFragment)
            .addToBackStack(null)
            .commit()
    }
}
