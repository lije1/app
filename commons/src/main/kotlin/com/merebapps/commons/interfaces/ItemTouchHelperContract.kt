package com.miad.commons.interfaces

import com.miad.commons.adapters.MyRecyclerViewAdapter

interface ItemTouchHelperContract {
    fun onRowMoved(fromPosition: Int, toPosition: Int)

    fun onRowSelected(myViewHolder: MyRecyclerViewAdapter.ViewHolder?)

    fun onRowClear(myViewHolder: MyRecyclerViewAdapter.ViewHolder?)
}
