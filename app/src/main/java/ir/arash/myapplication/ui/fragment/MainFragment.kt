package ir.arash.myapplication.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nilsoo.khodro.view.market_place.main.viewtype.holder.CategoryHolder
import com.nilsoo.khodro.view.market_place.main.viewtype.holder.ListMainHolder
import com.nilsoo.khodro.view.market_place.main.viewtype.item.CategoryItem
import com.nilsoo.khodro.view.market_place.main.viewtype.item.ListMainItem
import ir.arash.myapplication.Info.CategoryInfo
import ir.arash.myapplication.Info.ListMainInfo
import ir.arash.myapplication.Info.ProductInfo
import ir.arash.myapplication.R

import ir.arash.myapplication.databinding.FragmentMainBinding
import ir.arash.myapplication.viewmodel.CategoryViewModel
import ir.arash.myapplication.viewmodel.ListMainViewModel


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding

    lateinit var categoryViewModel: CategoryViewModel
    lateinit var listMainViewModel: ListMainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return initView(layoutInflater, container)


    }


    fun initView(inflater: LayoutInflater, container: ViewGroup?): View {

        binding = FragmentMainBinding.inflate(inflater, container, false)
        categoryViewModel = CategoryViewModel()
        listMainViewModel = ListMainViewModel()



        initCategoryRecycler()
        initListMainRecycler()

        return binding.root
    }

    fun initCategoryRecycler() {


        binding.hedearInclude.categoryRecycler.layoutManager =
                LinearLayoutManager(context, RecyclerView.HORIZONTAL, true)



        binding.hedearInclude.categoryRecycler.adapter = categoryViewModel.categoryAdapter

        var catList = ArrayList<CategoryInfo>()

        catList.add(getCatInfo("test1", R.mipmap.support))
        catList.add(getCatInfo("test2", R.mipmap.delivery))
        catList.add(getCatInfo("test3", R.mipmap.warranty))
        catList.add(getCatInfo("test4", R.mipmap.back_product))


        for (catInfo in catList) {
            categoryViewModel.categoryAdapter.addItem(CategoryItem(catInfo))
        }


    }


    fun getCatInfo(title: String, img: Int): CategoryInfo {

        var catInfo = CategoryInfo(title, img)


        return catInfo

    }


    fun initListMainRecycler() {


        binding.listMainInclude.listMainRecycler.layoutManager =
                LinearLayoutManager(context, RecyclerView.VERTICAL, false)




        binding.listMainInclude.listMainRecycler.adapter = listMainViewModel.listNMainAdapter

        var listMains = ArrayList<ListMainInfo>()

        listMains.add(getListMainInfo("test1", getProductsList()))
        listMains.add(getListMainInfo("test2", getProductsList()))
        listMains.add(getListMainInfo("test3", getProductsList()))
        listMains.add(getListMainInfo("test4", getProductsList()))

        for (listMain in listMains) {
            listMainViewModel.listNMainAdapter.addItem(ListMainItem(this!!.context!!,listMain))
        }


    }


    fun getListMainInfo(title: String, productList: ArrayList<ProductInfo>?): ListMainInfo {

        var listMainInfo = ListMainInfo(title, productList)


        return listMainInfo

    }


    fun getProductsList(): ArrayList<ProductInfo> {
        var porcutsList = ArrayList<ProductInfo>()

        for (i in 1..5) {
            var productInfo = ProductInfo("text", "2,000", R.mipmap.ic_launcher)

            porcutsList.add(productInfo)
        }

        return porcutsList

    }

}
