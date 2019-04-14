package com.nilsoo.khodro.view.market_place.main.viewtype.holder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

import ir.arash.myapplication.databinding.HedearListItmBinding

class CategoryHolder : RecyclerView.ViewHolder {

    var binding: HedearListItmBinding

    constructor(binding: ViewDataBinding) : super(binding.root) {
        this.binding = binding as HedearListItmBinding
    }
}