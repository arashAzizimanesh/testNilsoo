package com.nilsoo.khodro.view.market_place.main.viewtype.item


import com.nilsoo.khodro.view.market_place.main.viewtype.holder.CategoryHolder
import com.nilsoo.khodro.view.market_place.main.viewtype.holder.ListMainHolder
import com.nilsoo.khodro.view.market_place.main.viewtype.holder.ProductHolder
import com.squareup.picasso.Picasso
import ir.arash.myapplication.Info.CategoryInfo
import ir.arash.myapplication.Info.ListMainInfo
import ir.arash.myapplication.Info.ProductInfo
import ir.arash.myapplication.R
import ir.coderz.ghostadapter.BindItem
import ir.coderz.ghostadapter.Binder

@BindItem(layout = R.layout.product_item, holder = ProductHolder::class, binding = true)
class ProductItem(
    val productInfo: ProductInfo
) {

    @Binder
    public fun bind(holder: ProductHolder) {

        if (!productInfo.title.isNullOrEmpty())
            holder.binding.txtTitle.text = productInfo.title
        else
        ;

        if (!productInfo.price.isNullOrEmpty())
            holder.binding.txtPrice.text = productInfo.price
        else
        ;

//        holder.itemView.setOnClickListener {
//            onClickListener.call(category.id)
//        }
//


        holder.binding.imgProduct.setImageResource(productInfo.image)

//        ImageUtils.instance.displayMarketPlaceCategory(category.picture, holder.binding.image)

    }


}