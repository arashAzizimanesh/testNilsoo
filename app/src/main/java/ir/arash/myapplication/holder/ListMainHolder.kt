package com.nilsoo.khodro.view.market_place.main.viewtype.holder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

import ir.arash.myapplication.databinding.HedearListItmBinding
import ir.arash.myapplication.databinding.ListMainItemBinding

class ListMainHolder : RecyclerView.ViewHolder {

    var binding: ListMainItemBinding

    constructor(binding: ViewDataBinding) : super(binding.root) {
        this.binding = binding as ListMainItemBinding
    }
}