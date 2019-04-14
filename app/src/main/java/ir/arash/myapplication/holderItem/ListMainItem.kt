package com.nilsoo.khodro.view.market_place.main.viewtype.item


import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.nilsoo.khodro.view.market_place.main.viewtype.holder.CategoryHolder
import com.nilsoo.khodro.view.market_place.main.viewtype.holder.ListMainHolder
import com.squareup.picasso.Picasso
import ir.arash.myapplication.Info.CategoryInfo
import ir.arash.myapplication.Info.ListMainInfo
import ir.arash.myapplication.Info.ProductInfo
import ir.arash.myapplication.R
import ir.arash.myapplication.viewmodel.ProductViewModel
import ir.coderz.ghostadapter.BindItem
import ir.coderz.ghostadapter.Binder

@BindItem(layout = R.layout.list_main_item, holder = ListMainHolder::class, binding = true)
class ListMainItem(val context: Context, val listMainInfo: ListMainInfo/*,val onClickListener: Act1<Int>*/) {

    lateinit var prodcutViewModel: ProductViewModel
    @Binder
    public fun bind(holder: ListMainHolder) {
        prodcutViewModel = ProductViewModel()
        if (!listMainInfo.title.isNullOrEmpty())
            holder.binding.txtTitle.text = listMainInfo.title
        else
        ;


//        holder.itemView.setOnClickListener {
//            onClickListener.call(category.id)
//        }


        setProductRecycler(listMainInfo.productList!!, holder.binding.recyclerProduct)

//        holder.binding.imgCategory.setImageResource(category.image)

//        ImageUtils.instance.displayMarketPlaceCategory(category.picture, holder.binding.image)

    }

    fun setProductRecycler(productList: ArrayList<ProductInfo>, recyclerView: RecyclerView) {


        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, true)
        recyclerView.adapter = prodcutViewModel.productAdapter

        for (productInfo in productList) {
            prodcutViewModel.productAdapter.addItem(ProductItem(productInfo))
        }





    }


}