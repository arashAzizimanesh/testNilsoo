package com.nilsoo.khodro.view.market_place.main.viewtype.item


import com.nilsoo.khodro.view.market_place.main.viewtype.holder.CategoryHolder
import com.squareup.picasso.Picasso
import ir.arash.myapplication.Info.CategoryInfo
import ir.arash.myapplication.R
import ir.coderz.ghostadapter.BindItem
import ir.coderz.ghostadapter.Binder

@BindItem(layout = R.layout.hedear_list_itm, holder = CategoryHolder::class, binding = true)
class CategoryItem(
    val category: CategoryInfo/*,
                              val onClickListener: Act1<Int>*/
) {

    @Binder
    public fun bind(holder: CategoryHolder) {

        if (!category.title.isNullOrEmpty())
            holder.binding.txtTitle.text = category.title
        else
        ;

//        holder.itemView.setOnClickListener {
//            onClickListener.call(category.id)
//        }
//

        holder.binding.imgCategory.setImageResource(category.image)

//        ImageUtils.instance.displayMarketPlaceCategory(category.picture, holder.binding.image)

    }
}